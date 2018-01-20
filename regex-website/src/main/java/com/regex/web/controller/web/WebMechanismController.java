package com.regex.web.controller.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.regex.web.common.Assist;
import com.regex.web.common.dto.info.MechanismDTO;
import com.regex.web.common.dto.info.NoticeDTO;
import com.regex.web.common.utils.Contant;
import com.regex.web.common.utils.QueryParam;
import com.regex.web.common.utils.QueryResult;
import com.regex.web.service.info.MechanismService;
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
@RequestMapping("web/Mechanism")
public class WebMechanismController {
    @Autowired
    private MechanismService MechanismService;
    
    /**
     * 
     * 功能描述: <br>
     * 金融机构展示
     *
     * @param model
     * @param assist
     * @return
     * @see [相关类/方法](可选)
     * @since [产品/模块版本](可选)
     */
    @RequestMapping("show")
    public String show(Model model,QueryParam param) {
        Assist assist = new Assist();
        assist.setRowSize(Contant.NONMAL_PAGE_SIZE);
        assist.setStartRow((param.getPageNumber() - 1) * Contant.NONMAL_PAGE_SIZE);
        assist.setRequires(Assist.andEq("is_del", "0"));
        assist.setOrder(Assist.order("update_time", false));
        List<MechanismDTO> datas = MechanismService.selectMechanismDTO(assist);
        for(MechanismDTO MechanismDTO : datas) {
            MechanismDTO.setContent(HTMLSpiritUtil.delHTMLTag(MechanismDTO.getContent()));
        }
        int totalCount = (int) MechanismService.getMechanismDTORowCount(assist);
        QueryResult<MechanismDTO> result = new QueryResult<MechanismDTO>(totalCount, Contant.NONMAL_PAGE_SIZE, param.getPageNumber());
        result.setDatas(datas);
        model.addAttribute("result", result);
        return "web/Mechanism/show";
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
    /*@RequestMapping("detial")
    public String detial(Long id, Model model) {
        try {
            MechanismDTO MechanismDTO = MechanismService.selectMechanismDTOById(id);
            model.addAttribute("MechanismDTO", MechanismDTO);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "web/Mechanism/detial";
    }*/
    
}
