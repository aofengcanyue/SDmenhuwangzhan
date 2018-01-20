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
import com.regex.web.common.dto.info.AchievementDTO;
import com.regex.web.common.utils.Contant;
import com.regex.web.common.utils.QueryParam;
import com.regex.web.common.utils.QueryResult;
import com.regex.web.common.vo.FileVO;
import com.regex.web.service.info.AchievementService;

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
@RequestMapping("web/achievement")
public class WebAchievementController {
    
    @Autowired
    private AchievementService achievementService;
    
    private static Map<String, String> typeMap = new HashMap<String, String>();
    
    static {
        typeMap.put("0", "绿色发展");
        typeMap.put("1", "节能减排");
        typeMap.put("2", "典型项目");
        typeMap.put("3", "园区循环化改造");
//        typeMap.put("4", "产业布局调整");
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
    @RequestMapping("show")
    public String show(Model model,@ModelAttribute("param") QueryParam param, String type) {
        Assist assist = new Assist();
        assist.setRowSize(Contant.NONMAL_PAGE_SIZE);
        assist.setStartRow((param.getPageNumber() - 1) * Contant.NONMAL_PAGE_SIZE);
        if(StringUtils.isEmpty(type)) {
            type = "0";
        }
        assist.setRequires(Assist.andEq("type", type));
        assist.setOrder(Assist.order("update_time", false));
        assist.setRequires(Assist.andEq("is_del", "0"));
        List<AchievementDTO> datas = achievementService.selectAchievementDTO(assist);
        int totalCount = (int) achievementService.getAchievementDTORowCount(assist);
        QueryResult<AchievementDTO> result = new QueryResult<AchievementDTO>(totalCount, Contant.NONMAL_PAGE_SIZE, param.getPageNumber());
        result.setDatas(datas);
        model.addAttribute("result", result);
        model.addAttribute("type", type);
        model.addAttribute("typeMap", typeMap);
        return "web/achievement/show";
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
    public String detial(@PathVariable("id") Long id, Model model) {
        try {
            AchievementDTO AchievementDTO = achievementService.selectAchievementDTOById(id);
            model.addAttribute("AchievementDTO", AchievementDTO);
            
            List<FileVO> List = new ArrayList<FileVO>();
            if(StringUtils.isNotEmpty(AchievementDTO.getFileUrl())) {
            String[] ary = AchievementDTO.getFileUrl().split("#");
            for(String item: ary){
                String name = item.substring(item.lastIndexOf("/")+1);
                FileVO file = new FileVO();
                file.setName(name);
                file.setUrl(item);
                List.add(file);
                
               }
            model.addAttribute("List", List);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        model.addAttribute("typeMap", typeMap);
        return "web/achievement/detial";
    }
    
}

