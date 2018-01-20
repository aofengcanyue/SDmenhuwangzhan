package com.regex.web.controller.admin.notice;

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
import com.regex.web.common.dto.info.NoticeDTO;
import com.regex.web.common.dto.info.NoticeTypeDTO;
import com.regex.web.controller.vo.PageVO;
import com.regex.web.excel.ExportExcel;
import com.regex.web.service.info.INoticeService;
import com.regex.web.service.info.NoticeTypeService;
import com.regex.web.utils.AjaxUtil;
import com.regex.web.utils.HTMLSpiritUtil;
/**
 * 
 * 〈一句话功能简述〉<br> 
 * 新闻资讯controller
 *
 * @author admin
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
@Controller
@RequestMapping("admin/notice")
public class AdminNoticeController {
    
    @Autowired
    private INoticeService noticeService;
    
    @Autowired
    private NoticeTypeService noticeTypeService;
    
    /**
     * 
     * 功能描述: <br>
     * 列表
     *
     * @param model
     * @return
     * @see [相关类/方法](可选)
     * @since [产品/模块版本](可选)
     */
    @RequestMapping("show")
    public String show() {
        return "admin/notice/show";
    }
    
    @RequestMapping(value = "getPage", method = RequestMethod.POST)
    @ResponseBody
    public void getPage(Model model, @ModelAttribute("assist") Assist assist, HttpServletResponse response, int sEcho,
            String columns, String iDisplayStart, String iDisplayLength, String sSearch) {
        assist.setOrder(Assist.order("is_top", false));
        assist.setRequires(Assist.andNeq("is_del", "1"));
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
        List<NoticeDTO> noticeList = noticeService.selectNoticeDTO(assist);
        for(NoticeDTO noticeDTO : noticeList) {
            noticeDTO.setContent("1");
        }
        long totalCount = noticeService.getNoticeDTORowCount(assist);
        model.addAttribute("data", noticeList);
        PageVO<NoticeDTO> mData = new PageVO<NoticeDTO>();
        mData.setAaData(noticeList);
        mData.setsEcho(sEcho);
        mData.setiTotalRecords(totalCount);
        mData.setiTotalDisplayRecords(totalCount);
        AjaxUtil.ajaxJsonSucMessage(response, mData);
    }
    
    /**
     * 
     * 功能描述: <br>
     * 去修改 /新增
     *
     * @param id
     * @param model
     * @return
     * @see [相关类/方法](可选)
     * @since [产品/模块版本](可选)
     */
    @RequestMapping("input")
    public String input(String id, Model model) {
        if(StringUtils.isNotEmpty(id)) {
            NoticeDTO noticeDTO = noticeService.selectNoticeDTOById(Long.parseLong(id));
            model.addAttribute("noticeDTO", noticeDTO);
        } 
        Assist assist = new Assist();
        assist.setOrder(Assist.order("update_time", false));
        assist.setRequires(Assist.andNeq("is_del", "1"));
        List<NoticeTypeDTO> noticeTypeList = noticeTypeService.selectNoticeTypeDTO(assist);
        model.addAttribute("noticeTypeList", noticeTypeList);
        return "admin/notice/input";
    }
    
    /**
     * 
     * 功能描述: <br>
     * 修改/ 新增
     *
     * @param noticeDTO
     * @param response
     * @see [相关类/方法](可选)
     * @since [产品/模块版本](可选)
     */
    @RequestMapping("save")
    public void save(NoticeDTO noticeDTO, HttpServletResponse response) {
        int n = 0;
        try {
        if(StringUtils.isNotEmpty(noticeDTO.getTitle())) {
            if(noticeDTO.getId() > 0) {
                n = noticeService.updateNonEmptyNoticeDTOById(noticeDTO);
            } else {
                noticeDTO.setAudit("0");
                noticeDTO.setIsDel("0");
                n = noticeService.insertNoticeDTO(noticeDTO);
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
     * 删除
     *
     * @param id
     * @param response
     * @see [相关类/方法](可选)
     * @since [产品/模块版本](可选)
     */
    @RequestMapping("del")
    public void del(String id, HttpServletResponse response) {
        int n = 0;
        NoticeDTO noticeDTO = noticeService.selectNoticeDTOById(Long.parseLong(id));
        noticeDTO.setIsDel("1");
        n = noticeService.updateNonEmptyNoticeDTOById(noticeDTO);
        AjaxUtil.ajaxJsonSucMessage(response, n);
    }
    
    /**
     * 
     * 功能描述: <br>
     * 置顶
     *
     * @param id
     * @param response
     * @see [相关类/方法](可选)
     * @since [产品/模块版本](可选)
     */
    @RequestMapping("isTop")
    public void isTop(String id, HttpServletResponse response) {
        int n = 0;
        NoticeDTO noticeDTO = noticeService.selectNoticeDTOById(Long.parseLong(id));
        noticeDTO.setIsTop("1");
        n = noticeService.updateNonEmptyNoticeDTOById(noticeDTO);
        AjaxUtil.ajaxJsonSucMessage(response, n);
    }
    
    @RequestMapping("cacleIsTop")
    public void cacleIsTop(String id, HttpServletResponse response) {
        int n = 0;
        NoticeDTO noticeDTO = noticeService.selectNoticeDTOById(Long.parseLong(id));
        noticeDTO.setIsTop("0");
        n = noticeService.updateNonEmptyNoticeDTOById(noticeDTO);
        AjaxUtil.ajaxJsonSucMessage(response, n);
    }
    
    @RequestMapping(value = "export", method=RequestMethod.POST)
    public String exportFile(HttpServletResponse response, Model model) {
        try {
            String fileName = "信息"+(new Date()).getTime()+".xlsx";
            List<NoticeDTO> noticeList = noticeService.selectNoticeDTO(null);
            for(NoticeDTO noticeDTO : noticeList) {
                noticeDTO.setContent(HTMLSpiritUtil.delHTMLTag(noticeDTO.getContent()));
                if(noticeDTO.getIsDel().equals("1")) {
                    noticeDTO.setIsDel("已删除");
                } else {
                    noticeDTO.setIsDel("未删除");
                }
                if(noticeDTO.getIsTop().equals("1")) {
                    noticeDTO.setIsTop("置顶");
                } else {
                    noticeDTO.setIsTop("未置顶");
                }
                NoticeTypeDTO noticeTypeDTO = noticeTypeService.selectNoticeTypeDTOById(Long.parseLong(noticeDTO.getType()));
                if(noticeTypeDTO!=null) {
                    noticeDTO.setType(noticeTypeDTO.getName());
                } else {
                    noticeDTO.setType("信息展示");
                }
            }
            new ExportExcel("信息数据", NoticeDTO.class).setDataList(noticeList).write(response, fileName).dispose();
            return null; 
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "redirect:show.htm";
    }
    
    @RequestMapping("push")
    public String push(Model model,String id) {
        
        NoticeDTO noticeDTO = noticeService.selectNoticeDTOById(Long.parseLong(id));
        model.addAttribute("notice", noticeDTO);
        return "admin/notice/push";
    }
}
