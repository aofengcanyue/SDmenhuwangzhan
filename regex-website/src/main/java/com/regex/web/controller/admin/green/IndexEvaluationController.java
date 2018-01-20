package com.regex.web.controller.admin.green;

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

import com.alibaba.fastjson.JSON;
import com.regex.web.common.Assist;
import com.regex.web.common.dto.green.IndexEvaluationDTO;
import com.regex.web.service.green.IndexEvaluationService;
import com.regex.web.utils.AjaxUtil;
/**
 * 
 * 〈一句话功能简述〉<br> 
 * 指标性评价
 *
 * @author admin
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
@Controller
@RequestMapping("sys/IndexEvaluation")
public class IndexEvaluationController {

    
    @Autowired
    private IndexEvaluationService IndexEvaluationService;
    
    private static Map<String, String> typeMap = new HashMap<String, String>();
    /**
     * 一级指标
     */
    private static Map<String, String> classAMap = new HashMap<String, String>();
    /**
     * 二级指标
     */
    private static Map<String, String> classBMap = new HashMap<String, String>();
    
    static {
        typeMap.put("-", "-"); // 绿色工厂 要求类型  一票否决
        typeMap.put("0", "基本要求"); // 绿色工厂 要求类型 
        typeMap.put("1", "预期性要求"); // 绿色工厂 要求类型
//        typeMap.put("2", "定性"); // 绿色供应链 指标类型
//        typeMap.put("3", "定量"); // 绿色供应链 指标类型
    }
    
    static {
        classAMap.put("0", "一般要求");
        classAMap.put("1", "基础设施");
        classAMap.put("2", "管理体系");
        classAMap.put("3", "能源资源投入");
        classAMap.put("4", "产品");
        classAMap.put("5", "环境排放");
        classAMap.put("6", "绩效");
    }
    
    static {
        classBMap.put("0", "合规性与相关方要求");
        classBMap.put("1", "管理职责");
        classBMap.put("10", "建筑");
        classBMap.put("11", "计量设备");
        classBMap.put("12", "照明");
        classBMap.put("20", "管理体系基本要求");
        classBMap.put("21", "环境管理体系");
        classBMap.put("22", "能源管理体系");
        classBMap.put("23", "社会责任");
        classBMap.put("30", "能源投入");
        classBMap.put("31", "资源投入");
        classBMap.put("32", "采购");
        classBMap.put("40", "生态设计");
        classBMap.put("41", "节能");
        classBMap.put("42", "碳足迹");
        classBMap.put("43", "有害物质限制使用");
        classBMap.put("50", "污染物处理设备");
        classBMap.put("51", "大气污染物排放");
        classBMap.put("52", "水体污染物排放");
        classBMap.put("53", "固体废物排放");
        classBMap.put("54", "噪声排放");
        classBMap.put("55", "温室气体排放");
        classBMap.put("60", "用地集约化");
        classBMap.put("61", "生产洁净化");
        classBMap.put("62", "废物资源化");
        classBMap.put("63", "能源低碳化");
    }
    
    /**
     * 
     * 功能描述: <br>
     * 指标性评价展示
     *
     * @param model
     * @param assist
     * @return
     * @see [相关类/方法](可选)
     * @since [产品/模块版本](可选)
     */
    @RequestMapping("show")
    public String show(Model model, @ModelAttribute("assist") Assist assist) {
        assist.setRequires(Assist.andEq("is_del", "0"));
        assist.setOrder(Assist.order("update_time", true));
        List<IndexEvaluationDTO> datas = IndexEvaluationService.selectIndexEvaluationDTO(assist);
        model.addAttribute("datas", datas);
        model.addAttribute("typeMap", typeMap);
        model.addAttribute("classAMap", classAMap);
        model.addAttribute("classBMap", classBMap);
        return "admin/IndexEvaluation/green_factory/show";
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
        IndexEvaluationDTO IndexEvaluationDTO = IndexEvaluationService.selectIndexEvaluationDTOById(id);
        IndexEvaluationDTO.setIsDel("1");
        n = IndexEvaluationService.updateNonEmptyIndexEvaluationDTOById(IndexEvaluationDTO);
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
            IndexEvaluationDTO IndexEvaluationDTO = IndexEvaluationService.selectIndexEvaluationDTOById(id);
            model.addAttribute("IndexEvaluationDTO", IndexEvaluationDTO);
        }
        model.addAttribute("typeMap", typeMap);
        model.addAttribute("classAMap", classAMap);
        model.addAttribute("classBMap", JSON.toJSON(classBMap).toString());
        return "admin/IndexEvaluation/green_factory/input";
    }
    
    /**
     * 
     * 功能描述: <br>
     * 保存
     *
     * @param IndexEvaluationDTO
     * @param response
     * @param request
     * @see [相关类/方法](可选)
     * @since [产品/模块版本](可选)
     */
    @RequestMapping("save")
    public void save(IndexEvaluationDTO IndexEvaluationDTO, HttpServletResponse response,
            HttpServletRequest request) {
        int n = 0;
        try {
        if(StringUtils.isNotEmpty(IndexEvaluationDTO.getItem())
                && StringUtils.isNotEmpty(IndexEvaluationDTO.getClassa())
                && StringUtils.isNotEmpty(IndexEvaluationDTO.getClassb())
                && IndexEvaluationDTO.getPoint() != 0) {
            IndexEvaluationDTO.setUpdateTime(new Date());
            if(IndexEvaluationDTO.getId() > 0) {
                n = IndexEvaluationService.updateNonEmptyIndexEvaluationDTOById(IndexEvaluationDTO);
            } else {
                IndexEvaluationDTO.setIsDel("0");
                IndexEvaluationDTO.setCreateTime(new Date());
                n = IndexEvaluationService.insertIndexEvaluationDTO(IndexEvaluationDTO);
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
