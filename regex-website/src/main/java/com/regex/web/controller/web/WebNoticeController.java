package com.regex.web.controller.web;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.regex.web.common.Assist;
import com.regex.web.common.dto.info.NoticeDTO;
import com.regex.web.common.dto.info.NoticeTypeDTO;
import com.regex.web.common.utils.Contant;
import com.regex.web.common.utils.QueryParam;
import com.regex.web.common.utils.QueryResult;
import com.regex.web.common.vo.FileVO;
import com.regex.web.service.info.INoticeService;
import com.regex.web.service.info.NoticeTypeService;
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
@RequestMapping("web/notice")
public class WebNoticeController {
    
    @Autowired
    private INoticeService noticeService;
    
    @Autowired
    private NoticeTypeService noticeTypeService;
    
    /**
     * 
     * 功能描述: <br>
     * 新闻列表
     *
     * @param model
     * @param param
     * @param type
     * @return
     * @see [相关类/方法](可选)
     * @since [产品/模块版本](可选)
     */
    @RequestMapping("show")
    public String show(Model model, QueryParam param,@ModelAttribute("type") String type) {
        Assist assist = new Assist();
        assist.setRowSize(Contant.NONMAL_PAGE_SIZE);
        assist.setStartRow((param.getPageNumber() - 1) * Contant.NONMAL_PAGE_SIZE);
        assist.setRequires(Assist.andEq("is_del", "0"));
        if(StringUtils.isNotEmpty(type)) {
            assist.setRequires(Assist.andEq("type", type));
            NoticeTypeDTO obj = noticeTypeService.selectNoticeTypeDTOById(Long.parseLong(type));
            model.addAttribute("obj", obj);
        }
        assist.setOrder(Assist.order("is_top", false));
        assist.setOrder(Assist.order("update_time", false));
        List<NoticeDTO> datas = noticeService.selectNoticeDTO(assist);
        for(NoticeDTO NoticeDTO : datas) {
            NoticeDTO.setContent(HTMLSpiritUtil.delHTMLTag(NoticeDTO.getContent()));
        }
        int totalCount = (int) noticeService.getNoticeDTORowCount(assist);
        QueryResult<NoticeDTO> result = new QueryResult<NoticeDTO>(totalCount, Contant.NONMAL_PAGE_SIZE, param.getPageNumber());
        result.setDatas(datas);
        model.addAttribute("result", result);
        
        Assist assistType = new Assist();
        assistType.setOrder(Assist.order("update_time", false));
        assistType.setRequires(Assist.andNeq("is_del", "1"));
        List<NoticeTypeDTO> noticeTypeList = noticeTypeService.selectNoticeTypeDTO(assistType);
        Map<String, String> noticeTypeMap = new HashMap<String, String>();
        for(NoticeTypeDTO noticeTypeDTO : noticeTypeList) {
            noticeTypeMap.put(noticeTypeDTO.getId() + "", noticeTypeDTO.getName());
        }
        model.addAttribute("noticeTypeMap", noticeTypeMap);
        return "web/notice/show";
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
    @RequestMapping("detial_{id}")
    public String detial(@PathVariable("id") String id, Model model) {
        if(StringUtils.isNotEmpty(id)) {
            NoticeDTO noticeDTO = noticeService.selectNoticeDTOById(Long.parseLong(id));
            model.addAttribute("noticeDTO", noticeDTO);
            noticeDTO.setReaadCount(noticeDTO.getReaadCount() + 1);;
            noticeService.updateNonEmptyNoticeDTOById(noticeDTO);
            
            List<FileVO> List = new ArrayList<FileVO>();
            if(StringUtils.isNotEmpty(noticeDTO.getFileUrl())) {
            String[] ary = noticeDTO.getFileUrl().split("#");
            for(String item: ary){
                String name = item.substring(item.lastIndexOf("/")+1);
                FileVO file = new FileVO();
                file.setName(name);
                file.setUrl(item);
                List.add(file);
                
               }
            model.addAttribute("List", List);
            }
        } 
        Assist assist = new Assist();
        assist.setOrder(Assist.order("update_time", false));
        assist.setRequires(Assist.andNeq("is_del", "1"));
        List<NoticeTypeDTO> noticeTypeList = noticeTypeService.selectNoticeTypeDTO(assist);
        model.addAttribute("noticeTypeList", noticeTypeList);
        
        
        return "web/notice/detial";
    }
    
    @RequestMapping("aboutUs")
    public String aboutUs(Model model,NoticeDTO dto) {
        dto.setIsDel("1");
        dto.setType("7");
        NoticeDTO notice = noticeService.selectNoticeDTOByObj(dto);
        model.addAttribute("notice", notice);
        return "web/aboutUs/show";
    }
}
