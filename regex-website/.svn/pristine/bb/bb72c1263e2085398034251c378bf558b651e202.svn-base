package com.regex.web.controller.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.regex.web.common.Assist;
import com.regex.web.common.dto.info.SupplyDemandDTO;
import com.regex.web.common.utils.Contant;
import com.regex.web.common.utils.QueryParam;
import com.regex.web.common.utils.QueryResult;
import com.regex.web.service.info.SupplyDemandService;

/**
 * 
 * 〈一句话功能简述〉<br> 
 * 供应信息
 *
 * @author admin
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
@Controller
@RequestMapping("web")
public class WebSupplyDemandController {
    
    @Autowired
    private SupplyDemandService supplyDemandService;
    
    /**
     * 
     * 功能描述: <br>
     * 供应
     *
     * @param model
     * @param param
     * @return
     * @see [相关类/方法](可选)
     * @since [产品/模块版本](可选)
     */
    @RequestMapping("supplyShow")
    public String supplyShow(Model model,QueryParam param) {
        Assist assist = new Assist();
        assist.setRowSize(Contant.NONMAL_PAGE_SIZE);
        assist.setStartRow((param.getPageNumber() - 1) * Contant.NONMAL_PAGE_SIZE);
        assist.setRequires(Assist.andEq("type", "0"));
        assist.setOrder(Assist.order("update_time", false));
        assist.setRequires(Assist.andEq("audit", "1"));
        assist.setRequires(Assist.andEq("is_del", "0"));
        List<SupplyDemandDTO> datas = supplyDemandService.selectSupplyDemandDTO(assist);
        int totalCount = (int) supplyDemandService.getSupplyDemandDTORowCount(assist);
        QueryResult<SupplyDemandDTO> result = new QueryResult<SupplyDemandDTO>(totalCount, Contant.NONMAL_PAGE_SIZE, param.getPageNumber());
        result.setDatas(datas);
        String type="0";
        model.addAttribute("result", result);
        model.addAttribute("type", type);
        return "web/supplyDemand/show";
    }
    
    /**
     * 
     * 功能描述: <br>
     * 求购
     *
     * @param model
     * @param param
     * @return
     * @see [相关类/方法](可选)
     * @since [产品/模块版本](可选)
     */
    @RequestMapping("demandShow")
    public String demandShow(Model model,QueryParam param) {
        Assist assist = new Assist();
        assist.setRowSize(Contant.NONMAL_PAGE_SIZE);
        assist.setStartRow((param.getPageNumber() - 1) * Contant.NONMAL_PAGE_SIZE);
        assist.setRequires(Assist.andEq("type", "1"));
        assist.setOrder(Assist.order("update_time", false));
        assist.setRequires(Assist.andEq("audit", "1"));
        assist.setRequires(Assist.andEq("is_del", "0"));
        List<SupplyDemandDTO> datas = supplyDemandService.selectSupplyDemandDTO(assist);
        int totalCount = (int) supplyDemandService.getSupplyDemandDTORowCount(assist);
        QueryResult<SupplyDemandDTO> result = new QueryResult<SupplyDemandDTO>(totalCount, Contant.NONMAL_PAGE_SIZE, param.getPageNumber());
        result.setDatas(datas);
        String type="1";
        model.addAttribute("result", result);
        model.addAttribute("type", type);
        return "web/supplyDemand/show";
    }
    
}
