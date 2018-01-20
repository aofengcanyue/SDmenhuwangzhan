package com.regex.web.controller.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.regex.web.common.Assist;
import com.regex.web.common.dto.info.FinancingDTO;
import com.regex.web.common.utils.Contant;
import com.regex.web.common.utils.QueryParam;
import com.regex.web.common.utils.QueryResult;
import com.regex.web.service.info.FinancingService;
import com.regex.web.utils.HTMLSpiritUtil;

/**
 * 
 * 〈一句话功能简述〉<br> 
 * 融资项目
 *
 * @author admin
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
@Controller
@RequestMapping("web/financing")
public class WebFinancingController {
    
    @Autowired
    private FinancingService FinancingService;
    
    /**
     * 
     * 功能描述: <br>
     * 融资项目
     *
     * @param model
     * @param param
     * @return
     * @see [相关类/方法](可选)
     * @since [产品/模块版本](可选)
     */
    @RequestMapping("show")
    public String show(Model model, QueryParam param) {
        Assist assist = new Assist();
        assist.setRowSize(Contant.NONMAL_PAGE_SIZE);
        assist.setStartRow((param.getPageNumber() - 1) * Contant.NONMAL_PAGE_SIZE);
        assist.setRequires(Assist.andEq("is_del", "0"));
        assist.setRequires(Assist.andEq("audit", "1"));
        assist.setOrder(Assist.order("update_time", false));
        List<FinancingDTO> datas = FinancingService.selectFinancingDTO(assist);
        for(FinancingDTO financingDTO : datas) {
            financingDTO.setIntroduction(HTMLSpiritUtil.delHTMLTag(financingDTO.getIntroduction()));
        }
        int totalCount = (int) FinancingService.getFinancingDTORowCount(assist);
        QueryResult<FinancingDTO> result = new QueryResult<FinancingDTO>(totalCount, Contant.NONMAL_PAGE_SIZE, param.getPageNumber());
        result.setDatas(datas);
        model.addAttribute("result", result);
        return "web/financing/show";
    }
    
    @RequestMapping("detial_{id}")
    public String detial(Model model,@PathVariable("id") String id) {
        FinancingDTO financingDTO = FinancingService.selectFinancingDTOById(Long.parseLong(id));
        model.addAttribute("financingDTO", financingDTO);
        return "web/financing/detial";
    }

}
