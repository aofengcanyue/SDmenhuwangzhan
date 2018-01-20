package com.regex.web.controller.admin.sys;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
import com.regex.web.common.dto.info.AchievementDTO;
import com.regex.web.controller.vo.PageVO;
import com.regex.web.excel.ExportExcel;
import com.regex.web.service.info.AchievementService;
import com.regex.web.utils.AjaxUtil;
import com.regex.web.utils.HTMLSpiritUtil;

/**
 * 
 * 〈一句话功能简述〉<br> 
 * 成果展示
 *
 * @author admin
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
@Controller
@RequestMapping("sys/achievement")
public class AchievementController {
    
    @Autowired
    private AchievementService achievementService;
    
    private static Map<String, String> typeMap = new HashMap<String, String>();
    
    static {
        typeMap.put("0", "绿色发展");
        typeMap.put("1", "节能减排");
        typeMap.put("2", "典型项目");
        typeMap.put("3", "园区循环化改造");
        typeMap.put("4", "产业布局调整");
    }
    
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
        List<AchievementDTO> datas = achievementService.selectAchievementDTO(assist);
        model.addAttribute("datas", datas);
        model.addAttribute("typeMap", typeMap);
        return "admin/achievement/show";
    }*/
    
    @RequestMapping("show")
    public String show() {
        return "admin/achievement/show";
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
        List<AchievementDTO> achievementList = achievementService.selectAchievementDTO(assist);
        
        long totalCount = achievementService.getAchievementDTORowCount(assist);
        model.addAttribute("data", achievementList);
        PageVO<AchievementDTO> mData = new PageVO<AchievementDTO>();
        mData.setAaData(achievementList);
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
            AchievementDTO AchievementDTO = achievementService.selectAchievementDTOById(id);
            model.addAttribute("AchievementDTO", AchievementDTO);
        } catch (Exception e) {
            e.printStackTrace();
        }
        model.addAttribute("typeMap", typeMap);
        return "admin/achievement/detial";
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
        AchievementDTO AchievementDTO = achievementService.selectAchievementDTOById(id);
        AchievementDTO.setIsDel("1");
        n = achievementService.updateNonEmptyAchievementDTOById(AchievementDTO);
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
            AchievementDTO achievementDTO = achievementService.selectAchievementDTOById(id);
            model.addAttribute("achievementDTO", achievementDTO);
        }
        model.addAttribute("typeMap", typeMap);
        return "admin/achievement/input";
    }
    
    /**
     * 
     * 功能描述: <br>
     * 保存
     *
     * @param AchievementDTO
     * @param response
     * @param request
     * @see [相关类/方法](可选)
     * @since [产品/模块版本](可选)
     */
    @RequestMapping("save")
    public void save(AchievementDTO AchievementDTO, HttpServletResponse response,
            HttpServletRequest request) {
        int n = 0;
        try {
        if(StringUtils.isNotEmpty(AchievementDTO.getTitle()) && StringUtils.isNotEmpty(AchievementDTO.getContent())
                && StringUtils.isNotEmpty(AchievementDTO.getType())) {
            AchievementDTO.setUpdateTime(new Date());
            if(AchievementDTO.getId() > 0) {
                n = achievementService.updateNonEmptyAchievementDTOById(AchievementDTO);
            } else {
                AchievementDTO.setIsDel("0");
                AchievementDTO.setCreateTime(new Date());
                n = achievementService.insertAchievementDTO(AchievementDTO);
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
    
    @RequestMapping(value = "export", method=RequestMethod.POST)
    public String exportFile(HttpServletResponse response, Model model) {
        try {
            String fileName = "成果展示"+(new Date()).getTime()+".xlsx";
            List<AchievementDTO> datas = achievementService.selectAchievementDTO(null);
            for(AchievementDTO achievementDTO : datas) {
                achievementDTO.setContent(HTMLSpiritUtil.delHTMLTag(achievementDTO.getContent()));
                if(achievementDTO.getIsDel().equals("1")) {
                    achievementDTO.setIsDel("已删除");
                } else {
                    achievementDTO.setIsDel("未删除");
                }
//                if(achievementDTO.getIsTop().equals("1")) {
//                    noticeDTO.setIsTop("置顶");
//                } else {
//                    noticeDTO.setIsTop("未置顶");
//                }
                achievementDTO.setType(typeMap.get(achievementDTO.getType()));
            }
            new ExportExcel("成果展示", AchievementDTO.class).setDataList(datas).write(response, fileName).dispose();
            return null; 
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "redirect:show.htm";
    }
}
