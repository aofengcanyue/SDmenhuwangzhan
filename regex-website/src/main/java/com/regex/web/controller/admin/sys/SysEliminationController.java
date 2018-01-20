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
import com.regex.web.common.dto.info.EliminationDTO;
import com.regex.web.common.utils.AjaxUtil;
import com.regex.web.controller.vo.PageVO;
import com.regex.web.excel.ExportExcel;
import com.regex.web.service.info.IEliminationService;
/**
 * 淘汰设备
 * 〈一句话功能简述〉<br> 
 * 〈功能详细描述〉
 *
 * @author Administrator
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
@Controller
@RequestMapping("sys/elimination")
public class SysEliminationController {
    
    @Autowired
    private IEliminationService eliminationService;
    
    @RequestMapping("input")
    public String input(Model model,@ModelAttribute("id")String id) {
        
        if(StringUtils.isNotEmpty(id)) {
        EliminationDTO eliminationDTO = eliminationService.selectById(Long.parseLong(id));
        
        model.addAttribute("elimination",eliminationDTO);
        }
        return "admin/elimination/input";
    }
    /**
     * 
     * 功能描述: <br>
     * 落后机电设备列表
     *
     * @param model
     * @return
     * @see [相关类/方法](可选)
     * @since [产品/模块版本](可选)
     */
   /* @RequestMapping("show")
    public String show(Model model) {
           
        List<EliminationDTO> eliminationList = eliminationService.selectAll();
        
        model.addAttribute("eliminationList",eliminationList);
        
        return "admin/elimination/show";
    }*/
    
    /**
     * 
     * 功能描述: <br>
     * 后台添加淘汰设备
     *
     * @param response
     * @param eliminationDTO
     * @see [相关类/方法](可选)
     * @since [产品/模块版本](可选)
     */
    @RequestMapping("insert")
    public void insert(HttpServletResponse response,EliminationDTO eliminationDTO) {
        int n = 0;
        if(eliminationDTO.getId()>0) {
            
            eliminationDTO.setUpdateTime(new Date());
            n= eliminationService.updateById(eliminationDTO);
            
        }else {
            
            eliminationDTO.setIsDel("0");
            eliminationDTO.setCreateTime(new Date());
            eliminationDTO.setUpdateTime(new Date());
            n = eliminationService.insert(eliminationDTO);
        }
        
        AjaxUtil.ajaxJsonSucMessage(response, n);
    }
    
    /**
     * 
     * 功能描述: <br>
     * 修改信息
     *
     * @param response
     * @param eliminationDTO
     * @param id
     * @see [相关类/方法](可选)
     * @since [产品/模块版本](可选)
     */
    @RequestMapping("update")
    public void update(HttpServletResponse response,EliminationDTO eliminationDTO,String id) {
        int n = 0;
        eliminationDTO.setId(Long.parseLong(id));
        eliminationDTO.setUpdateTime(new Date());
        n = eliminationService.updateById(eliminationDTO);
        
        AjaxUtil.ajaxJsonSucMessage(response, n);
    }
    /**
     * 
     * 功能描述: <br>
     * 删除
     *
     * @param response
     * @param id
     * @see [相关类/方法](可选)
     * @since [产品/模块版本](可选)
     */
    @RequestMapping("delete")
    public void del(HttpServletResponse response,String id) {
        int n = 0;
        
        n = eliminationService.del(Long.parseLong(id));
        
        AjaxUtil.ajaxJsonSucMessage(response, n);
    }
 
    @RequestMapping("show")
    public String show() {
        return "admin/elimination/show";
    }
    
    @RequestMapping(value = "getPage", method = RequestMethod.POST)
    @ResponseBody
    public void getPage(Model model, @ModelAttribute("assist") Assist assist, HttpServletResponse response, int sEcho,
            String columns, String iDisplayStart, String iDisplayLength, String sSearch) {
        
        assist.setRequires(Assist.andNeq("is_del", "1"));
        if(StringUtils.isEmpty(iDisplayLength)) {
            iDisplayLength = "10";
        }
        assist.setRowSize(Integer.parseInt(iDisplayLength));
        if(StringUtils.isEmpty(iDisplayStart)) {
            iDisplayStart = "0";
        }
        if(StringUtils.isNotEmpty(sSearch)) {
            assist.setRequires(Assist.customRequire("and model like concat('%',", sSearch, ",'%')"));
        }
        assist.setStartRow(Integer.parseInt(iDisplayStart));
        List<EliminationDTO> eliminationList = eliminationService.selectEliminationDTO(assist);
        
        long totalCount = eliminationService.getEliminationDTORowCount(assist);
        model.addAttribute("data", eliminationList);
        PageVO<EliminationDTO> mData = new PageVO<EliminationDTO>();
        mData.setAaData(eliminationList);
        mData.setsEcho(sEcho);
        mData.setiTotalRecords(totalCount);
        mData.setiTotalDisplayRecords(totalCount);
        AjaxUtil.ajaxJsonSucMessage(response, mData);
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
            String fileName = "落后淘汰设备"+(new Date()).getTime()+".xlsx";
            List<EliminationDTO> datas = eliminationService.selectEliminationDTO(null);
            for(EliminationDTO EliminationDTO : datas) {
//                EliminationDTO.setTechnicalContent(HTMLSpiritUtil.delHTMLTag(EliminationDTO.getTechnicalContent()));
                if(EliminationDTO.getIsDel().equals("1")) {
                    EliminationDTO.setIsDel("已删除");
                } else {
                    EliminationDTO.setIsDel("未删除");
                }
                /**
                 * 设备类型 0电动机 1变压器 2风机 3水泵 4锅炉 5落后工艺、设备和产品 6 电焊机、电阻炉
                 */
                if("0".equals(EliminationDTO.getType())) {
                    EliminationDTO.setType("电动机");
                } else if("1".equals(EliminationDTO.getType())) {
                    EliminationDTO.setType("变压器");
                } else if("2".equals(EliminationDTO.getType())) {
                    EliminationDTO.setType("风机");
                } else if("3".equals(EliminationDTO.getType())) {
                    EliminationDTO.setType("水泵");
                } else if("4".equals(EliminationDTO.getType())) {
                    EliminationDTO.setType("锅炉");
                } else if("5".equals(EliminationDTO.getType())) {
                    EliminationDTO.setType("落后工艺、设备和产品");
                } else if("6".equals(EliminationDTO.getType())) {
                    EliminationDTO.setType("电焊机、电阻炉");
                }
            }
            new ExportExcel("落后淘汰设备", EliminationDTO.class).setDataList(datas).write(response, fileName).dispose();
            return null; 
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "redirect:show.htm";
    }
}
