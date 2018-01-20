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
import com.regex.web.common.dto.info.MechanismDTO;
import com.regex.web.controller.vo.PageVO;
import com.regex.web.excel.ExportExcel;
import com.regex.web.service.info.MechanismService;
import com.regex.web.utils.AjaxUtil;
import com.regex.web.utils.HTMLSpiritUtil;
/**
 * 
 * 〈一句话功能简述〉<br> 
 * 金融机构
 *
 * @author admin
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
@Controller
@RequestMapping("sys/Mechanism")
public class MechanismController {
    @Autowired
    private MechanismService MechanismService;
    
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
    public String show() {
        return "admin/Mechanism/show";
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
        List<MechanismDTO> datas = MechanismService.selectMechanismDTO(assist);
        
        long totalCount = MechanismService.getMechanismDTORowCount(assist);
        model.addAttribute("data", datas);
        PageVO<MechanismDTO> mData = new PageVO<MechanismDTO>();
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
            MechanismDTO MechanismDTO = MechanismService.selectMechanismDTOById(id);
            model.addAttribute("MechanismDTO", MechanismDTO);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "admin/Mechanism/detial";
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
        MechanismDTO MechanismDTO = MechanismService.selectMechanismDTOById(id);
        MechanismDTO.setIsDel("1");
        n = MechanismService.updateNonEmptyMechanismDTOById(MechanismDTO);
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
            MechanismDTO MechanismDTO = MechanismService.selectMechanismDTOById(id);
            model.addAttribute("MechanismDTO", MechanismDTO);
        }
        return "admin/Mechanism/input";
    }
    
    /**
     * 
     * 功能描述: <br>
     * 保存
     *
     * @param MechanismDTO
     * @param response
     * @param request
     * @see [相关类/方法](可选)
     * @since [产品/模块版本](可选)
     */
    @RequestMapping("save")
    public void save(MechanismDTO MechanismDTO, HttpServletResponse response,
            HttpServletRequest request) {
        int n = 0;
        try {
        if(StringUtils.isNotEmpty(MechanismDTO.getTitle()) && StringUtils.isNotEmpty(MechanismDTO.getContent())) {
            MechanismDTO.setUpdateTime(new Date());
            if(MechanismDTO.getId() > 0) {
                n = MechanismService.updateNonEmptyMechanismDTOById(MechanismDTO);
            } else {
                MechanismDTO.setIsDel("0");
                MechanismDTO.setCreateTime(new Date());
                n = MechanismService.insertMechanismDTO(MechanismDTO);
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
            String fileName = "金融机构"+(new Date()).getTime()+".xlsx";
            List<MechanismDTO> datas = MechanismService.selectMechanismDTO(null);
            for(MechanismDTO MechanismDTO : datas) {
                MechanismDTO.setContent((HTMLSpiritUtil.delHTMLTag(MechanismDTO.getContent())));
                if(MechanismDTO.getIsDel().equals("1")) {
                    MechanismDTO.setIsDel("已删除");
                } else {
                    MechanismDTO.setIsDel("未删除");
                }
            }
            new ExportExcel("金融机构", MechanismDTO.class).setDataList(datas).write(response, fileName).dispose();
            return null; 
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "redirect:show.htm";
    }
}
