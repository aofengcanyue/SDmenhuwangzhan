package com.regex.web.controller.admin.sys;

import java.util.Date;
import java.util.List;

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
import com.regex.web.common.dto.info.FinancingDTO;
import com.regex.web.controller.vo.PageVO;
import com.regex.web.excel.ExportExcel;
import com.regex.web.service.info.FinancingService;
import com.regex.web.utils.AjaxUtil;
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
@RequestMapping("sys/Financing")
public class FinancingController {

    
    @Autowired
    private FinancingService FinancingService;
    
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
    /*@RequestMapping("show")
    public String show(Model model, @ModelAttribute("assist") Assist assist) {
        assist.setRequires(Assist.andEq("is_del", "0"));
        assist.setOrder(Assist.order("update_time", false));
        List<FinancingDTO> datas = FinancingService.selectFinancingDTO(assist);
        model.addAttribute("datas", datas);
        return "admin/Financing/show";
    }*/
    
    @RequestMapping("show")
    public String show() {
        return "admin/Financing/show";
    }
    
    @RequestMapping(value = "getPage", method = RequestMethod.POST)
    @ResponseBody
    public void getPage(Model model, @ModelAttribute("assist") Assist assist, HttpServletResponse response, int sEcho,
            String columns, String iDisplayStart, String iDisplayLength, String sSearch) {
        
        assist.setRequires(Assist.andEq("is_del", "0"));
        assist.setOrder(Assist.order("update_time", false));
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
        List<FinancingDTO> datas = FinancingService.selectFinancingDTO(assist);
        
        long totalCount = FinancingService.getFinancingDTORowCount(assist);
        model.addAttribute("data", datas);
        PageVO<FinancingDTO> mData = new PageVO<FinancingDTO>();
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
            FinancingDTO FinancingDTO = FinancingService.selectFinancingDTOById(id);
            model.addAttribute("FinancingDTO", FinancingDTO);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "admin/Financing/detial";
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
        FinancingDTO FinancingDTO = FinancingService.selectFinancingDTOById(id);
        FinancingDTO.setIsDel("1");
        n = FinancingService.updateNonEmptyFinancingDTOById(FinancingDTO);
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
            FinancingDTO FinancingDTO = FinancingService.selectFinancingDTOById(id);
            model.addAttribute("FinancingDTO", FinancingDTO);
        }
        return "admin/Financing/input";
    }
    
    /**
     * 
     * 功能描述: <br>
     * 保存
     *
     * @param FinancingDTO
     * @param response
     * @param request
     * @see [相关类/方法](可选)
     * @since [产品/模块版本](可选)
     */
    @RequestMapping("save")
    public void save(FinancingDTO FinancingDTO, HttpServletResponse response,
            HttpServletRequest request) {
        int n = 0;
        try {
        if(StringUtils.isNotEmpty(FinancingDTO.getCompany()) && StringUtils.isNotEmpty(FinancingDTO.getContact())
                && StringUtils.isNotEmpty(FinancingDTO.getPhone())) {
            FinancingDTO.setUpdateTime(new Date());
            if(FinancingDTO.getId() > 0) {
                n = FinancingService.updateNonEmptyFinancingDTOById(FinancingDTO);
            } else {
                FinancingDTO.setIsDel("0");
                FinancingDTO.setCreateTime(new Date());
                n = FinancingService.insertFinancingDTO(FinancingDTO);
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
     * 审核
     *
     * @param id
     * @param response
     * @see [相关类/方法](可选)
     * @since [产品/模块版本](可选)
     */
    @RequestMapping("audit")
    public void audit(String id, HttpServletResponse response) {
        int n = 0;
        FinancingDTO FinancingDTO = FinancingService.selectFinancingDTOById(Long.parseLong(id));
        FinancingDTO.setAudit("1");
        n = FinancingService.updateNonEmptyFinancingDTOById(FinancingDTO);
        AjaxUtil.ajaxJsonSucMessage(response, n);
    }
    
    @RequestMapping("reject")
    public void reject(String id, HttpServletResponse response) {
        int n = 0;
        FinancingDTO FinancingDTO = FinancingService.selectFinancingDTOById(Long.parseLong(id));
        FinancingDTO.setAudit("2");
        n = FinancingService.updateNonEmptyFinancingDTOById(FinancingDTO);
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
            String fileName = "融资项目"+(new Date()).getTime()+".xlsx";
            List<FinancingDTO> datas = FinancingService.selectFinancingDTO(null);
            for(FinancingDTO FinancingDTO : datas) {
                FinancingDTO.setIntroduction(HTMLSpiritUtil.delHTMLTag(FinancingDTO.getIntroduction()));
                if(FinancingDTO.getIsDel().equals("1")) {
                    FinancingDTO.setIsDel("已删除");
                } else {
                    FinancingDTO.setIsDel("未删除");
                }
                if(FinancingDTO.getAudit().equals("1")) {
                    FinancingDTO.setAudit("审核通过");
                } else if(FinancingDTO.getAudit().equals("2")) {
                    FinancingDTO.setAudit("驳回");
                } else {
                    FinancingDTO.setAudit("待审核");
                }
//                FinancingDTO.setType(typeMap.get(FinancingDTO.getType()));
            }
            new ExportExcel("融资项目", FinancingDTO.class).setDataList(datas).write(response, fileName).dispose();
            return null; 
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "redirect:show.htm";
    }

}
