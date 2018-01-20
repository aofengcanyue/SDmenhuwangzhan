package com.regex.web.controller.admin.sys;

import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.regex.web.common.dto.info.NoticeDTO;
import com.regex.web.service.info.INoticeService;
import com.regex.web.utils.AjaxUtil;

/**
 * 
 * 〈一句话功能简述〉<br> 
 * 关于我们
 *
 * @author admin
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
@Controller
@RequestMapping("sys/aboutUs")
public class SysAboutUsController {
    
    @Autowired
    private INoticeService noticeService;
    
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
        NoticeDTO noticeDTO = noticeService.selectNoticeDTOById(Long.parseLong("1"));
        model.addAttribute("noticeDTO", noticeDTO);
        return "admin/aboutUs/input";
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
        noticeDTO.setId(1l);
        if(StringUtils.isNotEmpty(noticeDTO.getTitle())) {
            if(noticeDTO.getId() > 0) {
                noticeDTO.setIsDel("1");
                noticeDTO.setType("7");
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

}
