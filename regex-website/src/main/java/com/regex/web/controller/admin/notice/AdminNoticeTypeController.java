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

import com.regex.web.common.Assist;
import com.regex.web.common.dto.info.NoticeTypeDTO;
import com.regex.web.service.info.NoticeTypeService;
import com.regex.web.utils.AjaxUtil;
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
@RequestMapping("admin/noticeType")
public class AdminNoticeTypeController {
    
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
    public String show(Model model, @ModelAttribute("assist") Assist assist) {
//        Assist assist = new Assist();
        // is_top 倒叙排序
        assist.setOrder(Assist.order("update_time", false));
        assist.setRequires(Assist.andNeq("is_del", "1"));
        List<NoticeTypeDTO> datas = noticeTypeService.selectNoticeTypeDTO(assist);
        model.addAttribute("datas", datas);
        return "admin/noticeType/show";
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
            NoticeTypeDTO noticeTypeDTO = noticeTypeService.selectNoticeTypeDTOById(Long.parseLong(id));
            model.addAttribute("noticeTypeDTO", noticeTypeDTO);
        } 
        return "admin/noticeType/input";
    }
    
    /**
     * 
     * 功能描述: <br>
     * 修改/ 新增
     *
     * @param NoticeTypeDTO
     * @param response
     * @see [相关类/方法](可选)
     * @since [产品/模块版本](可选)
     */
    @RequestMapping("save")
    public void save(NoticeTypeDTO NoticeTypeDTO, HttpServletResponse response) {
        int n = 0;
        try {
        if(StringUtils.isNotEmpty(NoticeTypeDTO.getName())) {
            NoticeTypeDTO.setUpdateTime(new Date());
            if(NoticeTypeDTO.getId() > 0) {
                n = noticeTypeService.updateNonEmptyNoticeTypeDTOById(NoticeTypeDTO);
            } else {
                NoticeTypeDTO.setIsDel("0");
                NoticeTypeDTO.setCreateTime(new Date());
                n = noticeTypeService.insertNoticeTypeDTO(NoticeTypeDTO);
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
        NoticeTypeDTO NoticeTypeDTO = noticeTypeService.selectNoticeTypeDTOById(Long.parseLong(id));
        NoticeTypeDTO.setIsDel("1");
        n = noticeTypeService.updateNonEmptyNoticeTypeDTOById(NoticeTypeDTO);
        AjaxUtil.ajaxJsonSucMessage(response, n);
    }

}
