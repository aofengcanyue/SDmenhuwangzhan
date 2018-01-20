package com.regex.web.controller.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.regex.web.common.dto.info.EliminationDTO;
import com.regex.web.common.utils.Contant;
import com.regex.web.common.utils.QueryConditions;
import com.regex.web.common.utils.QueryResult;
import com.regex.web.service.info.IEliminationService;
/**
 * 
 * 〈一句话功能简述〉<br> 
 * 前台落后设备
 *
 * @author Administrator
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
@Controller
@RequestMapping("web/elimination")
public class EliminationController {

    
    @Autowired
    private IEliminationService eliminationService;
    
    
    /**
     * 
     * 功能描述: <br>
     * 淘汰设备查询
     *
     * @param model
     * @return
     * @see [相关类/方法](可选)
     * @since [产品/模块版本](可选)
     */
    @RequestMapping("show")
    public String show(Model model,@ModelAttribute("params")QueryConditions params) {
        
        params.setPageSize(Contant.NONMAL_PAGE_SIZE);
        params.setStartIndex((params.getPageNumber() - 1) * Contant.NONMAL_PAGE_SIZE);
        List<EliminationDTO> eliminationList = eliminationService.selectByModel(params);
        
        for(EliminationDTO eliminationDTO : eliminationList) {
            
            String technical = eliminationDTO.getModel().replaceAll(params.getModel(), "<b class='search_i'>"+params.getModel() +"</b>");
            eliminationDTO.setModel(technical);
            }
       
        int count = eliminationService.selectCountByModel(params);
        QueryResult<EliminationDTO> result = new QueryResult<EliminationDTO>(count, Contant.NONMAL_PAGE_SIZE, params.getPageNumber());
        result.setDatas(eliminationList);
        model.addAttribute("count",count);
        model.addAttribute("result",result);
        return "web/elimination/show";
    }
}
