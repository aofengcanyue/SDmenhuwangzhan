package com.regex.web.controller.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.regex.web.common.Assist;
import com.regex.web.common.dto.info.EfficiencyDTO;
import com.regex.web.service.info.EfficiencyService;

/**
 * 
 * 〈一句话功能简述〉<br> 
 * 能效领跑者
 *
 * @author admin
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
@Controller
@RequestMapping("web/efficiency")
public class WebEfficiencyController {
    
    @Autowired
    private EfficiencyService EfficiencyService;
    
    /**
     * 
     * 功能描述: <br>
     * 企业培训列表
     *
     * @param model
     * @return
     * @see [相关类/方法](可选)
     * @since [产品/模块版本](可选)
     */
    @RequestMapping("show")
    public String show(Model model) {
        Assist assist = new Assist();
        assist.setOrder(Assist.order("sort", true));
        // assist.setOrder(Assist.order("update_time", false));
        assist.setRequires(Assist.andEq("is_del", "0"));
        assist.setOrder(Assist.order("update_time", false));
        List<EfficiencyDTO> datas = EfficiencyService.selectEfficiencyDTO(assist);
        model.addAttribute("datas", datas);
        return "web/efficiency/show";
    }

}
