package com.regex.web.controller.web;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.baomidou.mybatisplus.toolkit.StringUtils;
import com.regex.web.common.Assist;
import com.regex.web.common.dto.info.PolicyDTO;
import com.regex.web.common.utils.Contant;
import com.regex.web.common.utils.QueryParam;
import com.regex.web.common.utils.QueryResult;
import com.regex.web.common.vo.FileVO;
import com.regex.web.service.info.PolicyService;
import com.regex.web.utils.HTMLSpiritUtil;
/**
 * 
 * 〈一句话功能简述〉<br> 
 * 金融政策
 *
 * @author admin
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
@Controller
@RequestMapping("web/policy")
public class WebPolicyController {
    
    @Autowired
    private PolicyService policyService;
    
    private static Map<String, String> typeMap = new HashMap<String, String>();
    
    static {
        typeMap.put("0", "金融机构");
        typeMap.put("1", "担保公司");
        typeMap.put("2", "合同能源管理服务公司");
    }
    
    /**
     * 
     * 功能描述: <br>
     * 金融政策展示
     *
     * @param model
     * @param assist
     * @return
     * @see [相关类/方法](可选)
     * @since [产品/模块版本](可选)
     */
    @RequestMapping("show")
    public String show(Model model, QueryParam param, String type) {
        Assist assist = new Assist();
        assist.setRowSize(Contant.NONMAL_PAGE_SIZE);
        assist.setStartRow((param.getPageNumber() - 1) * Contant.NONMAL_PAGE_SIZE);
        assist.setRequires(Assist.andEq("is_del", "0"));
        if(StringUtils.isEmpty(type)) {
            type = "0";
        }
        assist.setRequires(Assist.andEq("type", type));
        assist.setOrder(Assist.order("is_top", false));
        assist.setOrder(Assist.order("update_time", false));
        List<PolicyDTO> datas = policyService.selectPolicyDTO(assist);
        for(PolicyDTO PolicyDTO : datas) {
            PolicyDTO.setContent(HTMLSpiritUtil.delHTMLTag(PolicyDTO.getContent()));
        }
        int totalCount = (int) policyService.getPolicyDTORowCount(assist);
        QueryResult<PolicyDTO> result = new QueryResult<PolicyDTO>(totalCount, Contant.NONMAL_PAGE_SIZE, param.getPageNumber());
        result.setDatas(datas);
        model.addAttribute("result", result);
        model.addAttribute("type", type);
        model.addAttribute("typeMap", typeMap);

        return "web/policy/show";

    }
    
    /**
     * 
     * 功能描述: <br>
     * 详情
     *
     * @param id
     * @param model
     * @return
     * @see [相关类/方法](可选)
     * @since [产品/模块版本](可选)
     */
    @RequestMapping("detial_{id}")
    public String detial(@PathVariable("id") Long id, Model model) {
        try {
            PolicyDTO PolicyDTO = policyService.selectPolicyDTOById(id);
            model.addAttribute("PolicyDTO", PolicyDTO);
            
            List<FileVO> List = new ArrayList<FileVO>();
            if(StringUtils.isNotEmpty(PolicyDTO.getFileUrl())) {
            String[] ary = PolicyDTO.getFileUrl().split("#");
            for(String item: ary){
                String name = item.substring(item.lastIndexOf("/")+1);
                FileVO file = new FileVO();
                file.setName(name);
                file.setUrl(item);
                List.add(file);
                
               }
            model.addAttribute("List", List);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        model.addAttribute("typeMap", typeMap);



        return "web/policy/detial";

    }
    
    
}
