package com.regex.web.controller.web;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.regex.web.common.Assist;
import com.regex.web.common.dto.info.TrainingDTO;
import com.regex.web.common.utils.Contant;
import com.regex.web.common.utils.QueryParam;
import com.regex.web.common.utils.QueryResult;
import com.regex.web.service.info.TrainingService;
/**
 * 
 * 〈一句话功能简述〉<br> 
 * 企业培训
 *
 * @author Administrator
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
@Controller
@RequestMapping("web/training")
public class WebTrainingController {
    
    @Autowired
    private TrainingService trainingService;
    
    private static Map<String, String> typeMap = new HashMap<String, String>();
    
    static {
        typeMap.put("0", "能源管理体系");
        typeMap.put("1", "能源审计");
        typeMap.put("2", "清洁生产审核");
       
    }
    
    /**
     * 
     * 功能描述: <br>
     * 企业培训列表
     *
     * @param model
     * @return
     * @see [相关类/方法](可选)
     * @since [产品/模块版本](可选)
     */
    @RequestMapping("show")
    public String show(Model model,@ModelAttribute("param") QueryParam param, String type) {
        Assist assist = new Assist();
        assist.setRowSize(Contant.NONMAL_PAGE_SIZE);
        assist.setStartRow((param.getPageNumber() - 1) * Contant.NONMAL_PAGE_SIZE);
        if(StringUtils.isEmpty(type)) {
            type = "0";
        }
        assist.setRequires(Assist.andEq("type", type));
        assist.setOrder(Assist.order("update_time", false));
        assist.setRequires(Assist.andEq("is_del", "0"));
        List<TrainingDTO> datas = trainingService.selectTrainingDTO(assist);
        int totalCount = (int) trainingService.getTrainingDTORowCount(assist);
        QueryResult<TrainingDTO> result = new QueryResult<TrainingDTO>(totalCount, Contant.NONMAL_PAGE_SIZE, param.getPageNumber());
        result.setDatas(datas);
        model.addAttribute("result", result);
        model.addAttribute("type", type);
        model.addAttribute("typeMap", typeMap);
        return "web/training/show";
    }
    
    
    
}
