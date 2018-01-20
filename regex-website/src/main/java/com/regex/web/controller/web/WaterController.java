package com.regex.web.controller.web;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.regex.web.common.dto.info.IndustryInfoDTO;
import com.regex.web.common.dto.info.WaterDTO;
import com.regex.web.common.utils.Contant;
import com.regex.web.common.utils.QueryConditions;
import com.regex.web.common.utils.QueryResult;
import com.regex.web.service.info.IWaterService;
import com.regex.web.service.info.IndustryInfoService;

@Controller
@RequestMapping("web/water")
public class WaterController {
    
    
    
    @Autowired
    private IWaterService waterService;
    
    @Autowired
    private IndustryInfoService industryInfoService;
    
    
    
    /**
     * 
     * 功能描述: <br>
     * 查询取水定额
     *
     * @param model
     * @param params
     * @return
     * @see [相关类/方法](可选)
     * @since [产品/模块版本](可选)
     */
    @RequestMapping("show")
    public String show(Model model,@ModelAttribute("params")QueryConditions params) {
        try {
            params.setPageSize(Contant.NONMAL_PAGE_SIZE);
            params.setStartIndex((params.getPageNumber() - 1) * Contant.NONMAL_PAGE_SIZE);
            List<WaterDTO> waterList = waterService.selectByName(params);
            for(WaterDTO waterDTO : waterList) {
                
                String technical = waterDTO.getName().replaceAll(params.getName(), "<b class='search_i'>"+params.getName() +"</b>");
                waterDTO.setName(technical);
            }
            
            int count = waterService.selectCountByName(params);
            QueryResult<WaterDTO> result = new QueryResult<WaterDTO>(count, Contant.NONMAL_PAGE_SIZE, params.getPageNumber());
            result.setDatas(waterList);
            
            List<IndustryInfoDTO> industryInfoList= industryInfoService.selectIndustryInfoDTO(null);
            model.addAttribute("industryInfoList",industryInfoList);
            
            Map<String, String> typeMap = new HashMap<String, String>();
            
            
            for(IndustryInfoDTO industryInfoDTO: industryInfoList) {
                typeMap.put(industryInfoDTO.getIndustryId(), industryInfoDTO.getIndustryName());
            }
            model.addAttribute("count",count);
            model.addAttribute("typeMap1",typeMap);
            model.addAttribute("result",result);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "web/water/show";
    }
}
