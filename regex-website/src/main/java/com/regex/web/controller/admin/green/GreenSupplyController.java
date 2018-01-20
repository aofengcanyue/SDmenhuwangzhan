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
import com.regex.web.common.dto.green.GreenSupplyChainEvaluation;
import com.regex.web.service.green.GreenSupplyChainEvaluationService;
import com.regex.web.utils.AjaxUtil;

@Controller
@RequestMapping("sys/GreenSupply")
public class GreenSupplyController {

    
    @Autowired
    private GreenSupplyChainEvaluationService GreenSupplyChainEvaluationService;
    /**
     * 指标类型
     */
    private static Map<String, String> typeMap = new HashMap<String, String>();
    /**
     * 一级指标
     */
    private static Map<String, String> classAMap = new HashMap<String, String>();
    /**
     * 二级指标
     */
    private static Map<String, String> classBMap = new HashMap<String, String>();
    /**
     * 单位
     */
    private static Map<String, String> unitMap = new HashMap<String, String>();
    
    static {
        typeMap.put("2", "定性"); // 绿色供应链 指标类型
        typeMap.put("3", "定量"); // 绿色供应链 指标类型
    }
    
    static {
      unitMap.put("-", "-"); // d单位
      unitMap.put("%", "%"); // 单位 
  }
    
    static {
        classAMap.put("x1", "绿色供应链管理战略");
        classAMap.put("x2", "实施绿色供应商管理");
        classAMap.put("x3", "绿色生产");
        classAMap.put("x4", "绿色回收");
        classAMap.put("x5", "绿色信息平台建设");
        classAMap.put("x6", "绿色信息披露");
    }
    
    static {
        classBMap.put("11", "纳入公司发展规划");
        classBMap.put("12", "制定绿色供应链管理目标");
        classBMap.put("13", "设置专门管理机构");
        classBMap.put("21", "绿色采购标准制度完善");
        classBMap.put("22", "供应商认证体系完善");
        classBMap.put("23", "对供应商定期审核");
        classBMap.put("24", "供应商绩效评估制度健全");
        classBMap.put("25", "定期对供应商进行培训");
        classBMap.put("26", "低风险供应商占比");
        classBMap.put("31", "节能减排环保合规");
        classBMap.put("32", "符合有害物质限制使用管理办法");
        classBMap.put("41", "产品回收率");
        classBMap.put("42", "包装回收率");
        classBMap.put("43", "回收体系完善（含自建、与第三方联合回收）");
        classBMap.put("44", "指导下游企业回收拆解");
        classBMap.put("51", "绿色供应链管理信息平台完善");
        classBMap.put("61", "披露企业节能减排减碳信息");
        classBMap.put("62", "披露高、中风险供应商审核率及低风险供应商占比");
        classBMap.put("63", "披露供应商节能减排信息");
        classBMap.put("64", "发布企业社会责任报告（含绿色采购信息）");
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
        List<GreenSupplyChainEvaluation> datas = GreenSupplyChainEvaluationService.selectGreenSupplyChainEvaluation(assist);
        model.addAttribute("datas", datas);
        model.addAttribute("typeMap", typeMap);
        model.addAttribute("classAMap", classAMap);
        model.addAttribute("classBMap", classBMap);
        model.addAttribute("unitMap", unitMap);
        return "admin/IndexEvaluation/green_supply_chain/show";
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
        GreenSupplyChainEvaluation GreenSupplyChainEvaluationDTO = GreenSupplyChainEvaluationService.selectGreenSupplyChainEvaluationById(id);
        GreenSupplyChainEvaluationDTO.setIsDel("1");
        n = GreenSupplyChainEvaluationService.updateNonEmptyGreenSupplyChainEvaluationById(GreenSupplyChainEvaluationDTO);
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
            GreenSupplyChainEvaluation GreenSupplyChainEvaluationDTO = GreenSupplyChainEvaluationService.selectGreenSupplyChainEvaluationById(id);
            model.addAttribute("GreenSupplyChainEvaluationDTO", GreenSupplyChainEvaluationDTO);
        }
        model.addAttribute("typeMap", typeMap);
        model.addAttribute("classAMap", classAMap);
        model.addAttribute("unitMap", unitMap);
        model.addAttribute("classBMap", JSON.toJSON(classBMap).toString());
        return "admin/IndexEvaluation/green_supply_chain/input";
    }
    
    /**
     * 
     * 功能描述: <br>
     * 保存
     *
     * @param GreenSupplyChainEvaluationDTO
     * @param response
     * @param request
     * @see [相关类/方法](可选)
     * @since [产品/模块版本](可选)
     */
    @RequestMapping("save")
    public void save(GreenSupplyChainEvaluation GreenSupplyChainEvaluationDTO, HttpServletResponse response,
            HttpServletRequest request) {
        int n = 0;
        try {
        if(StringUtils.isNotEmpty(GreenSupplyChainEvaluationDTO.getClassa())
                && StringUtils.isNotEmpty(GreenSupplyChainEvaluationDTO.getClassb())
                && StringUtils.isNotEmpty(GreenSupplyChainEvaluationDTO.getMaxPoint())) {
            GreenSupplyChainEvaluationDTO.setUpdateTime(new Date());
            if(GreenSupplyChainEvaluationDTO.getId() > 0) {
                n = GreenSupplyChainEvaluationService.updateNonEmptyGreenSupplyChainEvaluationById(GreenSupplyChainEvaluationDTO);
            } else {
                GreenSupplyChainEvaluationDTO.setIsDel("0");
                GreenSupplyChainEvaluationDTO.setCreateTime(new Date());
                n = GreenSupplyChainEvaluationService.insertGreenSupplyChainEvaluation(GreenSupplyChainEvaluationDTO);
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
