package com.regex.web.controller.admin.sys;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.regex.web.common.Assist;
import com.regex.web.common.dto.info.PolicyDTO;
import com.regex.web.controller.vo.PageVO;
import com.regex.web.excel.ExportExcel;
import com.regex.web.service.info.PolicyService;
import com.regex.web.utils.AjaxUtil;
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
@RequestMapping("sys/policy")
public class PolicyController {
    
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
     * 金融政策
     *
     * @param model
     * @param assist
     * @return
     * @see [相关类/方法](可选)
     * @since [产品/模块版本](可选)
     */
    @RequestMapping("show")
    public String show() {
//        assist.setRequires(Assist.andEq("is_del", "0"));
//        assist.setOrder(Assist.order("update_time", false));
//        List<PolicyDTO> datas = policyService.selectPolicyDTO(assist);
//        model.addAttribute("datas", datas);
//        model.addAttribute("typeMap", typeMap);
        return "admin/policy/show";
    }
    
    @RequestMapping(value = "getPage", method = RequestMethod.POST)
    @ResponseBody
    public void getPage(Model model, @ModelAttribute("assist") Assist assist, HttpServletResponse response, int sEcho,
            String columns, String iDisplayStart, String iDisplayLength, String sSearch) {
        assist.setOrder(Assist.order("is_top", false));
        assist.setRequires(Assist.andNeq("is_del", "1"));
        if(StringUtils.isEmpty(iDisplayLength)) {
            iDisplayLength = "10";
        }
        assist.setRowSize(Integer.parseInt(iDisplayLength));
        if(StringUtils.isEmpty(iDisplayStart)) {
            iDisplayStart = "0";
        }
        if(StringUtils.isNotEmpty(sSearch)) {
            assist.setRequires(Assist.customRequire("and title like concat('%',", sSearch, ",'%')"));
        }
        assist.setStartRow(Integer.parseInt(iDisplayStart));
        List<PolicyDTO> datas = policyService.selectPolicyDTO(assist);
        long totalCount = policyService.getPolicyDTORowCount(assist);
        PageVO<PolicyDTO> mData = new PageVO<PolicyDTO>();
        mData.setAaData(datas);
        mData.setsEcho(sEcho);
        mData.setiTotalRecords(totalCount);
        mData.setiTotalDisplayRecords(totalCount);
        AjaxUtil.ajaxJsonSucMessage(response, mData);
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
    @RequestMapping("detial")
    public String detial(Long id, Model model) {
        try {
            PolicyDTO PolicyDTO = policyService.selectPolicyDTOById(id);
            model.addAttribute("PolicyDTO", PolicyDTO);
        } catch (Exception e) {
            e.printStackTrace();
        }
        model.addAttribute("typeMap", typeMap);
        return "admin/policy/detial";
    }
    
    /**
     * 
     * 功能描述: <br>
     * 删除
     *
     * @param id
     * @param response
     * @see [相关类/方法](可选)
     * @since [产品/模块版本](可选)
     */
    @RequestMapping("del")
    public void del(Long id, HttpServletResponse response) {
        int n = 0;
        PolicyDTO PolicyDTO = policyService.selectPolicyDTOById(id);
        PolicyDTO.setIsDel("1");
        n = policyService.updateNonEmptyPolicyDTOById(PolicyDTO);
        AjaxUtil.ajaxJsonSucMessage(response, n);
    }
    
    /**
     * 
     * 功能描述: <br>
     * 置顶
     *
     * @param id
     * @param response
     * @see [相关类/方法](可选)
     * @since [产品/模块版本](可选)
     */
    @RequestMapping("isTop")
    public void isTop(Long id, HttpServletResponse response) {
        int n = 0;
        PolicyDTO PolicyDTO = policyService.selectPolicyDTOById(id);
        PolicyDTO.setIsTop("1");
        n = policyService.updateNonEmptyPolicyDTOById(PolicyDTO);
        AjaxUtil.ajaxJsonSucMessage(response, n);
    }
    
    /**
     * 
     * 功能描述: <br>
     * 取消置顶
     *
     * @param id
     * @param response
     * @see [相关类/方法](可选)
     * @since [产品/模块版本](可选)
     */
    @RequestMapping("cacleIsTop")
    public void cacleIsTop(String id, HttpServletResponse response) {
        int n = 0;
        PolicyDTO PolicyDTO = policyService.selectPolicyDTOById(Long.parseLong(id));
        PolicyDTO.setIsTop("0");
        n = policyService.updateNonEmptyPolicyDTOById(PolicyDTO);
        AjaxUtil.ajaxJsonSucMessage(response, n);
    }
    
    /**
     * 
     * 功能描述: <br>
     * 修改/ 新增
     *
     * @param id
     * @param model
     * @return
     * @see [相关类/方法](可选)
     * @since [产品/模块版本](可选)
     */
    @RequestMapping("input")
    public String input(Long id, Model model) {
        if(id!= null && id > 0) {
            PolicyDTO PolicyDTO = policyService.selectPolicyDTOById(id);
            model.addAttribute("PolicyDTO", PolicyDTO);
        }
        model.addAttribute("typeMap", typeMap);
        return "admin/policy/input";
    }
    
    /**
     * 
     * 功能描述: <br>
     * 保存
     *
     * @param PolicyDTO
     * @param response
     * @param request
     * @see [相关类/方法](可选)
     * @since [产品/模块版本](可选)
     */
    @RequestMapping("save")
    public void save(PolicyDTO PolicyDTO, HttpServletResponse response,
            HttpServletRequest request) {
        int n = 0;
        try {
        if(StringUtils.isNotEmpty(PolicyDTO.getTitle()) && StringUtils.isNotEmpty(PolicyDTO.getContent())
                && StringUtils.isNotEmpty(PolicyDTO.getType())) {
            PolicyDTO.setUpdateTime(new Date());
            if(PolicyDTO.getId() > 0) {
                n = policyService.updateNonEmptyPolicyDTOById(PolicyDTO);
            } else {
                PolicyDTO.setIsDel("0");
                PolicyDTO.setCreateTime(new Date());
                n = policyService.insertPolicyDTO(PolicyDTO);
            }
        } else {
            n = 2;
        }
        } catch(Exception e) {
            e.printStackTrace();
            n = 3;
        }
        AjaxUtil.ajaxJsonSucMessage(response, n);
    }
    
    /**
     * 
     * 功能描述: <br>
     * 导出excel
     *
     * @param response
     * @param model
     * @return
     * @see [相关类/方法](可选)
     * @since [产品/模块版本](可选)
     */
    @RequestMapping(value = "export", method=RequestMethod.POST)
    public String exportFile(HttpServletResponse response, Model model) {
        try {
            String fileName = "金融政策"+(new Date()).getTime()+".xlsx";
            List<PolicyDTO> datas = policyService.selectPolicyDTO(null);
            for(PolicyDTO PolicyDTO : datas) {
                PolicyDTO.setContent(HTMLSpiritUtil.delHTMLTag(PolicyDTO.getContent()));
                if(PolicyDTO.getIsDel().equals("1")) {
                    PolicyDTO.setIsDel("已删除");
                } else {
                    PolicyDTO.setIsDel("未删除");
                }
                if(PolicyDTO.getIsTop().equals("1")) {
                    PolicyDTO.setIsTop("置顶");
                } else {
                    PolicyDTO.setIsTop("未置顶");
                }
                PolicyDTO.setType(typeMap.get(PolicyDTO.getType()));
            }
            new ExportExcel("金融政策", PolicyDTO.class).setDataList(datas).write(response, fileName).dispose();
            return null; 
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "redirect:show.htm";
    }
}
