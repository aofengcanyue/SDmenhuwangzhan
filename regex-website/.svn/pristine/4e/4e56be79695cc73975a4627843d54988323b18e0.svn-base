package com.regex.web.controller.admin.sys;

import java.util.Date;
import java.util.List;

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
import com.regex.web.common.dto.info.SupplyDemandDTO;
import com.regex.web.controller.vo.PageVO;
import com.regex.web.excel.ExportExcel;
import com.regex.web.service.info.SupplyDemandService;
import com.regex.web.utils.AjaxUtil;

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
@RequestMapping("sys/supply")
public class SysSupplyController {
    
    @Autowired
    private SupplyDemandService supplyDemandService;
    
    @RequestMapping("show")
    public String show() {
        return "admin/supply/show";
    }
    
    @RequestMapping(value = "getPage", method = RequestMethod.POST)
    @ResponseBody
    public void getPage(Model model, @ModelAttribute("assist") Assist assist, HttpServletResponse response, int sEcho,
            String columns, String iDisplayStart, String iDisplayLength, String sSearch) {
        assist.setRequires(Assist.andNeq("is_del", "1"));
        assist.setRequires(Assist.andEq("type", "0"));
        assist.setOrder(Assist.order("update_time", false));
        if(StringUtils.isEmpty(iDisplayLength)) {
            iDisplayLength = "10";
        }
        assist.setRowSize(Integer.parseInt(iDisplayLength));
        if(StringUtils.isEmpty(iDisplayStart)) {
            iDisplayStart = "0";
        }
        if(StringUtils.isNotEmpty(sSearch)) {
            assist.setRequires(Assist.customRequire("and name like concat('%',", sSearch, ",'%')"));
        }
        assist.setStartRow(Integer.parseInt(iDisplayStart));
        List<SupplyDemandDTO> datas = supplyDemandService.selectSupplyDemandDTO(assist);
        long totalCount = supplyDemandService.getSupplyDemandDTORowCount(assist);
        model.addAttribute("data", datas);
        PageVO<SupplyDemandDTO> mData = new PageVO<SupplyDemandDTO>();
        mData.setAaData(datas);
        mData.setsEcho(sEcho);
        mData.setiTotalRecords(totalCount);
        mData.setiTotalDisplayRecords(totalCount);
        AjaxUtil.ajaxJsonSucMessage(response, mData);
    }
    
    @RequestMapping("detial")
    public String detial(Long id, Model model) {
        try {
            SupplyDemandDTO supplyDemandDTO = supplyDemandService.selectSupplyDemandDTOById(id);
            model.addAttribute("supplyDemandDTO", supplyDemandDTO);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "admin/supply/detial";
    }
    
    /**
     * 
     * 功能描述: <br>
     * 审核通过
     *
     * @param id
     * @param response
     * @see [相关类/方法](可选)
     * @since [产品/模块版本](可选)
     */
    @RequestMapping("audit")
    public void audit(Long id, HttpServletResponse response) {
        int n = 0;
        SupplyDemandDTO supplyDemandDTO = supplyDemandService.selectSupplyDemandDTOById(id);
        supplyDemandDTO.setAudit("1");
        n = supplyDemandService.updateNonEmptySupplyDemandDTOById(supplyDemandDTO);
        AjaxUtil.ajaxJsonSucMessage(response, n);
    }
    
    /**
     * 
     * 功能描述: <br>
     * 驳回
     *
     * @param id
     * @param response
     * @see [相关类/方法](可选)
     * @since [产品/模块版本](可选)
     */
    @RequestMapping("reject")
    public void reject(Long id, HttpServletResponse response) {
        int n = 0;
        SupplyDemandDTO supplyDemandDTO = supplyDemandService.selectSupplyDemandDTOById(id);
        supplyDemandDTO.setAudit("2");
        n = supplyDemandService.updateNonEmptySupplyDemandDTOById(supplyDemandDTO);
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
            String fileName = "供应信息"+(new Date()).getTime()+".xlsx";
            Assist assist = new Assist();
            assist.setRequires(Assist.andEq("type", "0"));
            List<SupplyDemandDTO> datas = supplyDemandService.selectSupplyDemandDTO(assist);
            for(SupplyDemandDTO SupplyDemandDTO : datas) {
//                SupplyDemandDTO.setContent(HTMLSpiritUtil.delHTMLTag(SupplyDemandDTO.getContent()));
                if(SupplyDemandDTO.getIsDel().equals("1")) {
                    SupplyDemandDTO.setIsDel("已删除");
                } else {
                    SupplyDemandDTO.setIsDel("未删除");
                }
                if(SupplyDemandDTO.getType().equals("0")) {
                    SupplyDemandDTO.setType("供应信息");
                } else {
                    SupplyDemandDTO.setType("求购信息");
                }
                if(SupplyDemandDTO.getAudit().equals("1")) {
                    SupplyDemandDTO.setAudit("审核通过");
                } else if(SupplyDemandDTO.getAudit().equals("2")) {
                    SupplyDemandDTO.setAudit("驳回");
                } else {
                    SupplyDemandDTO.setAudit("待审核");
                }
            }
            new ExportExcel("供应信息", SupplyDemandDTO.class).setDataList(datas).write(response, fileName).dispose();
            return null; 
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "redirect:show.htm";
    }
}
