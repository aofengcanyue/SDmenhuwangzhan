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

import com.regex.web.common.Assist;
import com.regex.web.common.dto.info.CommonAccordEvaluateDTO;
import com.regex.web.service.info.CommonAccordEvaluateService;
import com.regex.web.utils.AjaxUtil;

/**
 * 
 * 〈一句话功能简述〉<br> 
 * 一般复合性评价
 *
 * @author admin
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
@Controller
@RequestMapping("sys/CommonAccordEvaluate")
public class CommonAccordEvaluateController {

    
    @Autowired
    private CommonAccordEvaluateService CommonAccordEvaluateService;
    
    private static Map<String, String> typeMap = new HashMap<String, String>();
    
    static {
        typeMap.put("0", "绿色工厂评价");
        typeMap.put("1", "绿色供应链企业评价");
        typeMap.put("2", "绿色园区评价");
    }
    
    /**
     * 
     * 功能描述: <br>
     * 成果展示
     *
     * @param model
     * @param assist
     * @return
     * @see [相关类/方法](可选)
     * @since [产品/模块版本](可选)
     */
    @RequestMapping("show")
    public String show(Model model, @ModelAttribute("assist") Assist assist) {
        assist.setRequires(Assist.andEq("is_del", "0"));
        assist.setOrder(Assist.order("update_time", false));
        List<CommonAccordEvaluateDTO> datas = CommonAccordEvaluateService.selectCommonAccordEvaluateDTO(assist);
        model.addAttribute("datas", datas);
        model.addAttribute("typeMap", typeMap);
        return "admin/CommonAccordEvaluate/show";
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
            CommonAccordEvaluateDTO CommonAccordEvaluateDTO = CommonAccordEvaluateService.selectCommonAccordEvaluateDTOById(id);
            model.addAttribute("CommonAccordEvaluateDTO", CommonAccordEvaluateDTO);
        } catch (Exception e) {
            e.printStackTrace();
        }
        model.addAttribute("typeMap", typeMap);
        return "admin/CommonAccordEvaluate/detial";
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
        CommonAccordEvaluateDTO CommonAccordEvaluateDTO = CommonAccordEvaluateService.selectCommonAccordEvaluateDTOById(id);
        CommonAccordEvaluateDTO.setIsDel("1");
        n = CommonAccordEvaluateService.updateNonEmptyCommonAccordEvaluateDTOById(CommonAccordEvaluateDTO);
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
            CommonAccordEvaluateDTO CommonAccordEvaluateDTO = CommonAccordEvaluateService.selectCommonAccordEvaluateDTOById(id);
            model.addAttribute("CommonAccordEvaluateDTO", CommonAccordEvaluateDTO);
        }
        model.addAttribute("typeMap", typeMap);
        return "admin/CommonAccordEvaluate/input";
    }
    
    /**
     * 
     * 功能描述: <br>
     * 保存
     *
     * @param CommonAccordEvaluateDTO
     * @param response
     * @param request
     * @see [相关类/方法](可选)
     * @since [产品/模块版本](可选)
     */
    @RequestMapping("save")
    public void save(CommonAccordEvaluateDTO CommonAccordEvaluateDTO, HttpServletResponse response,
            HttpServletRequest request) {
        int n = 0;
        try {
        if(StringUtils.isNotEmpty(CommonAccordEvaluateDTO.getContent()) 
                && StringUtils.isNotEmpty(CommonAccordEvaluateDTO.getEvaluateType())) {
            CommonAccordEvaluateDTO.setUpdateTime(new Date());
            if(CommonAccordEvaluateDTO.getId() > 0) {
                n = CommonAccordEvaluateService.updateNonEmptyCommonAccordEvaluateDTOById(CommonAccordEvaluateDTO);
            } else {
                CommonAccordEvaluateDTO.setIsDel("0");
                CommonAccordEvaluateDTO.setCreateTime(new Date());
                n = CommonAccordEvaluateService.insertCommonAccordEvaluateDTO(CommonAccordEvaluateDTO);
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

}
