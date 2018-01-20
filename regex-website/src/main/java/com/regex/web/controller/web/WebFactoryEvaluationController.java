package com.regex.web.controller.web;

import java.text.DecimalFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.regex.web.common.Assist;
import com.regex.web.common.dto.evaluation.EvaluationFiveDTO;
import com.regex.web.common.dto.evaluation.EvaluationFourDTO;
import com.regex.web.common.dto.evaluation.EvaluationOneDTO;
import com.regex.web.common.dto.evaluation.EvaluationResultDTO;
import com.regex.web.common.dto.evaluation.EvaluationSixDTO;
import com.regex.web.common.dto.evaluation.EvaluationThreeDTO;
import com.regex.web.common.dto.evaluation.EvaluationTwoDTO;
import com.regex.web.common.dto.evaluation.EvaluationZeroDTO;
import com.regex.web.common.dto.green.IndexEvaluationDTO;
import com.regex.web.common.dto.info.CommonAccordEvaluateDTO;
import com.regex.web.common.utils.AjaxUtil;
import com.regex.web.service.evaluation.EvaluationFiveService;
import com.regex.web.service.evaluation.EvaluationFourService;
import com.regex.web.service.evaluation.EvaluationOneService;
import com.regex.web.service.evaluation.EvaluationResultService;
import com.regex.web.service.evaluation.EvaluationSixService;
import com.regex.web.service.evaluation.EvaluationThreeService;
import com.regex.web.service.evaluation.EvaluationTwoService;
import com.regex.web.service.evaluation.EvaluationZeroService;
import com.regex.web.service.green.IndexEvaluationService;
import com.regex.web.service.info.CommonAccordEvaluateService;

@Controller
@RequestMapping("web/factoryEvaluation")
public class WebFactoryEvaluationController {

    @Autowired
    private IndexEvaluationService IndexEvaluationService;
    
    @Autowired
    private CommonAccordEvaluateService CommonAccordEvaluateService;
    
    @Autowired
    private EvaluationZeroService evaluationZeroService;
    
    @Autowired
    private EvaluationOneService evaluationOneService;
    
    @Autowired
    private EvaluationTwoService evaluationTwoService;
    
    @Autowired
    private EvaluationThreeService evaluationThreeService;
    
    @Autowired
    private EvaluationFourService evaluationFourService;
    
    @Autowired
    private EvaluationFiveService evaluationFiveService;
    
    @Autowired
    private EvaluationSixService evaluationSixService;
    
    @Autowired
    private EvaluationResultService evaluationResultService;
    
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
     * 符合性评价
     *
     * @param model
     * @param assist
     * @return
     * @see [相关类/方法](可选)
     * @since [产品/模块版本](可选)
     */
    @RequestMapping("accord")
    public String accord(Model model, @ModelAttribute("assist") Assist assist) {
        assist.setRequires(Assist.andEq("is_del", "0"));
        assist.setRequires(Assist.andEq("evaluate_type", "0"));
        assist.setOrder(Assist.order("update_time", false));
        List<CommonAccordEvaluateDTO> datas = CommonAccordEvaluateService.selectCommonAccordEvaluateDTO(assist);
        model.addAttribute("datas", datas);
        model.addAttribute("typeMap", typeMap);
        Calendar now = Calendar.getInstance();  
        model.addAttribute("nowYear", now.get(Calendar.YEAR));
        return "web/green/factory/evaluate";
    }
    
    /**
     * 
     * 功能描述: <br>
     * 符合性评价
     *
     * @param selectedValue
     * @param response
     * @see [相关类/方法](可选)
     * @since [产品/模块版本](可选)
     */
    @RequestMapping("saveZero")
    public void submitZero(String selectedValue, HttpServletResponse response,
            HttpServletRequest request) {
        int n = 0;
        try {
//        request.getSession().setAttribute("year", year);
        String uuid = UUID.randomUUID().toString(); 
        String name = uuid.replaceAll("-", "");
        request.getSession().setAttribute("name", name);
        String[] selectedValueArry = selectedValue.split("#");
        EvaluationZeroDTO evaluationZeroDTO = new EvaluationZeroDTO();
        for(int i=0; i< selectedValueArry.length; i++) {
            switch(i) {
                case 0:
                    evaluationZeroDTO.setValueOne(selectedValueArry[i]);
                    break;
                case 1:
                    evaluationZeroDTO.setValueTwo(selectedValueArry[i]);
                    break;
                case 2:
                    evaluationZeroDTO.setValueThree(selectedValueArry[i]);
                    break;
                case 3:
                    evaluationZeroDTO.setValue(selectedValueArry[i]);
                    break;
                case 4:
                    evaluationZeroDTO.setValueFive(selectedValueArry[i]);
                    break;
                case 5:
                    evaluationZeroDTO.setValueSix(selectedValueArry[i]);
                    break;
                case 6:
                    evaluationZeroDTO.setValueSeven(selectedValueArry[i]);
                    break;
            }
        }
        evaluationZeroDTO.setName(name);
        evaluationZeroDTO.setIsDel("0");
        evaluationZeroDTO.setCreateTime(new Date());
        evaluationZeroDTO.setUpdateTime(new Date());
        n = evaluationZeroService.insertEvaluationZeroDTO(evaluationZeroDTO);
        } catch (Exception e) {
            e.printStackTrace();
        }
        AjaxUtil.ajaxJsonSucMessage(response, n);
    }
    
    @RequestMapping("index1")
    public String index1(@ModelAttribute("assist") Assist assist, Model model) {
        assist.setRequires(Assist.andEq("is_del", "0"));
        assist.setRequires(Assist.andEq("class_a", "1"));
        assist.setOrder(Assist.order("update_time", true));
        List<IndexEvaluationDTO> datas = IndexEvaluationService.selectIndexEvaluationDTO(assist);
        model.addAttribute("datas", datas);
        model.addAttribute("typeMap", typeMap);
        model.addAttribute("classAMap", classAMap);
        model.addAttribute("classBMap", classBMap);
        return "web/green/factory/index_1";
    }
    
    @RequestMapping("saveIndex1")
    public void saveIndex1(String point1Arr, String itemIdArr, HttpServletResponse response,
            HttpServletRequest request) {
        int n = 0;
        String[] selectedValueArry = point1Arr.split("#");
        EvaluationOneDTO evaluationOneDTO = new EvaluationOneDTO();
        for(int i=0; i< selectedValueArry.length; i++) {
            switch(i) {
                case 0:
                    evaluationOneDTO.setValueOne(selectedValueArry[i]);
                    break;
                case 1:
                    evaluationOneDTO.setValueTwo(selectedValueArry[i]);
                    break;
                case 2:
                    evaluationOneDTO.setValueThree(selectedValueArry[i]);
                    break;
                case 3:
                    evaluationOneDTO.setValue(selectedValueArry[i]);
                    break;
                case 4:
                    evaluationOneDTO.setValueFive(selectedValueArry[i]);
                    break;
                case 5:
                    evaluationOneDTO.setValueSix(selectedValueArry[i]);
                    break;
                case 6:
                    evaluationOneDTO.setValueSeven(selectedValueArry[i]);
                    break;
                case 7:
                    evaluationOneDTO.setValueEight(selectedValueArry[i]);
                    break;
                case 8:
                    evaluationOneDTO.setValueNine(selectedValueArry[i]);
                    break;
                case 9:
                    evaluationOneDTO.setValueTen(selectedValueArry[i]);
                    break;
                case 10:
                    evaluationOneDTO.setValueEleven(selectedValueArry[i]);
                    break;
                case 11:
                    evaluationOneDTO.setValueTwelve(selectedValueArry[i]);
                    break;
                case 12:
                    evaluationOneDTO.setValueThirteen(selectedValueArry[i]);
                    break;
            }
        }
        evaluationOneDTO.setIsDel("0");
        evaluationOneDTO.setCreateTime(new Date());
        evaluationOneDTO.setUpdateTime(new Date());
        String name = (String) request.getSession().getAttribute("name");
        evaluationOneDTO.setName(name);
        EvaluationOneDTO obj = new EvaluationOneDTO();
        obj.setName(name);
        EvaluationOneDTO evaluationOneDTOTmp = evaluationOneService.selectEvaluationOneDTOByObj(obj);
        if(evaluationOneDTOTmp==null) {
            n = evaluationOneService.insertEvaluationOneDTO(evaluationOneDTO);
        } else {
            evaluationOneDTO.setId(evaluationOneDTOTmp.getId());
            n = evaluationOneService.updateEvaluationOneDTOById(evaluationOneDTO);
        }
        AjaxUtil.ajaxJsonSucMessage(response, n);
    }
    
    
    @RequestMapping("index2")
    public String index2(@ModelAttribute("assist") Assist assist, Model model) {
        assist.setRequires(Assist.andEq("is_del", "0"));
        assist.setRequires(Assist.andEq("class_a", "2"));
        assist.setOrder(Assist.order("update_time", true));
        List<IndexEvaluationDTO> datas = IndexEvaluationService.selectIndexEvaluationDTO(assist);
        model.addAttribute("datas", datas);
        model.addAttribute("typeMap", typeMap);
        model.addAttribute("classAMap", classAMap);
        model.addAttribute("classBMap", classBMap);
        return "web/green/factory/index_2";
    }
    
    @RequestMapping("saveIndex2")
    public void saveIndex2(String point2Arr, String itemIdArr, HttpServletResponse response,
            HttpServletRequest request) {
        int n = 0;
        String[] selectedValueArry = point2Arr.split("#");
        EvaluationTwoDTO evaluationTwoDTO = new EvaluationTwoDTO();
        for(int i=0; i< selectedValueArry.length; i++) {
            switch(i) {
                case 0:
                    evaluationTwoDTO.setValueOne(selectedValueArry[i]);
                    break;
                case 1:
                    evaluationTwoDTO.setValueTwo(selectedValueArry[i]);
                    break;
                case 2:
                    evaluationTwoDTO.setValueThree(selectedValueArry[i]);
                    break;
                case 3:
                    evaluationTwoDTO.setValue(selectedValueArry[i]);
                    break;
                case 4:
                    evaluationTwoDTO.setValueFive(selectedValueArry[i]);
                    break;
                case 5:
                    evaluationTwoDTO.setValueSix(selectedValueArry[i]);
                    break;
                case 6:
                    evaluationTwoDTO.setValueSeven(selectedValueArry[i]);
                    break;
                case 7:
                    evaluationTwoDTO.setValueEight(selectedValueArry[i]);
                    break;
                case 8:
                    evaluationTwoDTO.setValueNine(selectedValueArry[i]);
                    break;
            }
        }
        evaluationTwoDTO.setIsDel("0");
        evaluationTwoDTO.setCreateTime(new Date());
        evaluationTwoDTO.setUpdateTime(new Date());
        String name = (String) request.getSession().getAttribute("name");
        evaluationTwoDTO.setName(name);
        EvaluationTwoDTO obj = new EvaluationTwoDTO();
        obj.setName(name);
        EvaluationTwoDTO evaluationTwoDTOTmp = evaluationTwoService.selectEvaluationTwoDTOByObj(obj);
        if(evaluationTwoDTOTmp==null) {
            n = evaluationTwoService.insertEvaluationTwoDTO(evaluationTwoDTO);
        } else {
            evaluationTwoDTO.setId(evaluationTwoDTOTmp.getId());
            n = evaluationTwoService.updateEvaluationTwoDTOById(evaluationTwoDTO);
        }
        AjaxUtil.ajaxJsonSucMessage(response, n);
    }
    
    @RequestMapping("index3")
    public String index3(@ModelAttribute("assist") Assist assist, Model model) {
        assist.setRequires(Assist.andEq("is_del", "0"));
        assist.setRequires(Assist.andEq("class_a", "3"));
        assist.setOrder(Assist.order("update_time", true));
        List<IndexEvaluationDTO> datas = IndexEvaluationService.selectIndexEvaluationDTO(assist);
        model.addAttribute("datas", datas);
        model.addAttribute("typeMap", typeMap);
        model.addAttribute("classAMap", classAMap);
        model.addAttribute("classBMap", classBMap);
        return "web/green/factory/index_3";
    }
    
    @RequestMapping("saveIndex3")
    public void saveIndex3(String point3Arr, String itemIdArr, HttpServletResponse response,
            HttpServletRequest request) {
        int n = 0;
        String[] selectedValueArry = point3Arr.split("#");
        EvaluationThreeDTO evaluationThreeDTO = new EvaluationThreeDTO();
        for(int i=0; i< selectedValueArry.length; i++) {
            switch(i) {
                case 0:
                    evaluationThreeDTO.setValueOne(selectedValueArry[i]);
                    break;
                case 1:
                    evaluationThreeDTO.setValueTwo(selectedValueArry[i]);
                    break;
                case 2:
                    evaluationThreeDTO.setValueThree(selectedValueArry[i]);
                    break;
                case 3:
                    evaluationThreeDTO.setValue(selectedValueArry[i]);
                    break;
                case 4:
                    evaluationThreeDTO.setValueFive(selectedValueArry[i]);
                    break;
                case 5:
                    evaluationThreeDTO.setValueSix(selectedValueArry[i]);
                    break;
                case 6:
                    evaluationThreeDTO.setValueSeven(selectedValueArry[i]);
                    break;
                case 7:
                    evaluationThreeDTO.setValueEight(selectedValueArry[i]);
                    break;
                case 8:
                    evaluationThreeDTO.setValueNine(selectedValueArry[i]);
                    break;
                case 9:
                    evaluationThreeDTO.setValueTen(selectedValueArry[i]);
                    break;
                case 10:
                    evaluationThreeDTO.setValueEleven(selectedValueArry[i]);
                    break;
                case 11:
                    evaluationThreeDTO.setValueTwelve(selectedValueArry[i]);
                    break;
                case 12:
                    evaluationThreeDTO.setValueThirteen(selectedValueArry[i]);
                    break;
                case 13:
                    evaluationThreeDTO.setValueFourteen(selectedValueArry[i]);
                    break;
            }
        }
        evaluationThreeDTO.setIsDel("0");
        evaluationThreeDTO.setCreateTime(new Date());
        evaluationThreeDTO.setUpdateTime(new Date());
        String name = (String) request.getSession().getAttribute("name");
        evaluationThreeDTO.setName(name);
        EvaluationThreeDTO obj = new EvaluationThreeDTO();
        obj.setName(name);
        EvaluationThreeDTO evaluationThreeDTOTmp = evaluationThreeService.selectEvaluationThreeDTOByObj(obj);
        if(evaluationThreeDTOTmp==null) {
            n = evaluationThreeService.insertEvaluationThreeDTO(evaluationThreeDTO);
        } else {
            evaluationThreeDTO.setId(evaluationThreeDTOTmp.getId());
            n = evaluationThreeService.updateEvaluationThreeDTOById(evaluationThreeDTO);
        }
        AjaxUtil.ajaxJsonSucMessage(response, n);
    }
    
    
    @RequestMapping("index4")
    public String index4(@ModelAttribute("assist") Assist assist, Model model) {
        assist.setRequires(Assist.andEq("is_del", "0"));
        assist.setRequires(Assist.andEq("class_a", "4"));
        assist.setOrder(Assist.order("update_time", true));
        List<IndexEvaluationDTO> datas = IndexEvaluationService.selectIndexEvaluationDTO(assist);
        model.addAttribute("datas", datas);
        model.addAttribute("typeMap", typeMap);
        model.addAttribute("classAMap", classAMap);
        model.addAttribute("classBMap", classBMap);
        return "web/green/factory/index_4";
    }
    
    @RequestMapping("saveIndex4")
    public void saveIndex4(String point4Arr, String itemIdArr, HttpServletResponse response,
            HttpServletRequest request) {
        int n = 0;
        String[] selectedValueArry = point4Arr.split("#");
        EvaluationFourDTO evaluationFourDTO = new EvaluationFourDTO();
        for(int i=0; i< selectedValueArry.length; i++) {
            switch(i) {
                case 0:
                    evaluationFourDTO.setValueOne(selectedValueArry[i]);
                    break;
                case 1:
                    evaluationFourDTO.setValueTwo(selectedValueArry[i]);
                    break;
                case 2:
                    evaluationFourDTO.setValueThree(selectedValueArry[i]);
                    break;
                case 3:
                    evaluationFourDTO.setValue(selectedValueArry[i]);
                    break;
                case 4:
                    evaluationFourDTO.setValueFive(selectedValueArry[i]);
                    break;
                case 5:
                    evaluationFourDTO.setValueSix(selectedValueArry[i]);
                    break;
                case 6:
                    evaluationFourDTO.setValueSeven(selectedValueArry[i]);
                    break;
                case 7:
                    evaluationFourDTO.setValueEight(selectedValueArry[i]);
                    break;
            }
        }
        evaluationFourDTO.setIsDel("0");
        evaluationFourDTO.setCreateTime(new Date());
        evaluationFourDTO.setUpdateTime(new Date());
        String name = (String) request.getSession().getAttribute("name");
        evaluationFourDTO.setName(name);
        EvaluationFourDTO obj = new EvaluationFourDTO();
        obj.setName(name);
        EvaluationFourDTO evaluationFourDTOTmp = evaluationFourService.selectEvaluationFourDTOByObj(obj);
        if(evaluationFourDTOTmp==null) {
            n = evaluationFourService.insertEvaluationFourDTO(evaluationFourDTO);
        } else {
            evaluationFourDTO.setId(evaluationFourDTOTmp.getId());
            n = evaluationFourService.updateEvaluationFourDTOById(evaluationFourDTO);
        }
        AjaxUtil.ajaxJsonSucMessage(response, n);
    }
    
    @RequestMapping("index5")
    public String index5(@ModelAttribute("assist") Assist assist, Model model) {
        assist.setRequires(Assist.andEq("is_del", "0"));
        assist.setRequires(Assist.andEq("class_a", "5"));
        assist.setOrder(Assist.order("update_time", true));
        List<IndexEvaluationDTO> datas = IndexEvaluationService.selectIndexEvaluationDTO(assist);
        model.addAttribute("datas", datas);
        model.addAttribute("typeMap", typeMap);
        model.addAttribute("classAMap", classAMap);
        model.addAttribute("classBMap", classBMap);
        return "web/green/factory/index_5";
    }
    
    @RequestMapping("saveIndex5")
    public void saveIndex5(String point5Arr, String itemIdArr, HttpServletResponse response,
            HttpServletRequest request) {
        int n = 0;
        String[] selectedValueArry = point5Arr.split("#");
        EvaluationFiveDTO evaluationFiveDTO = new EvaluationFiveDTO();
        for(int i=0; i< selectedValueArry.length; i++) {
            switch(i) {
                case 0:
                    evaluationFiveDTO.setValueOne(selectedValueArry[i]);
                    break;
                case 1:
                    evaluationFiveDTO.setValueTwo(selectedValueArry[i]);
                    break;
                case 2:
                    evaluationFiveDTO.setValueThree(selectedValueArry[i]);
                    break;
                case 3:
                    evaluationFiveDTO.setValue(selectedValueArry[i]);
                    break;
                case 4:
                    evaluationFiveDTO.setValueFive(selectedValueArry[i]);
                    break;
                case 5:
                    evaluationFiveDTO.setValueSix(selectedValueArry[i]);
                    break;
                case 6:
                    evaluationFiveDTO.setValueSeven(selectedValueArry[i]);
                    break;
                case 7:
                    evaluationFiveDTO.setValueEight(selectedValueArry[i]);
                    break;
                case 8:
                    evaluationFiveDTO.setValueNine(selectedValueArry[i]);
                    break;
            }
        }
        evaluationFiveDTO.setIsDel("0");
        evaluationFiveDTO.setCreateTime(new Date());
        evaluationFiveDTO.setUpdateTime(new Date());
        String name = (String) request.getSession().getAttribute("name");
        evaluationFiveDTO.setName(name);
        EvaluationFiveDTO obj = new EvaluationFiveDTO();
        obj.setName(name);
        EvaluationFiveDTO evaluationFiveDTOTmp = evaluationFiveService.selectEvaluationFiveDTOByObj(obj);
        if(evaluationFiveDTOTmp==null) {
            n = evaluationFiveService.insertEvaluationFiveDTO(evaluationFiveDTO);
        } else {
            evaluationFiveDTO.setId(evaluationFiveDTOTmp.getId());
            n = evaluationFiveService.updateEvaluationFiveDTOById(evaluationFiveDTO);
        }
        AjaxUtil.ajaxJsonSucMessage(response, n);
    }
    
    @RequestMapping("index6")
    public String index6(@ModelAttribute("assist") Assist assist, Model model) {
        assist.setRequires(Assist.andEq("is_del", "0"));
        assist.setRequires(Assist.andEq("class_a", "6"));
        assist.setOrder(Assist.order("update_time", true));
        List<IndexEvaluationDTO> datas = IndexEvaluationService.selectIndexEvaluationDTO(assist);
        model.addAttribute("datas", datas);
        model.addAttribute("typeMap", typeMap);
        model.addAttribute("classAMap", classAMap);
        model.addAttribute("classBMap", classBMap);
        return "web/green/factory/index_6";
    }
    
    @RequestMapping("saveIndex6")
    public void saveIndex6(String point6Arr, String itemIdArr, HttpServletResponse response,
            HttpServletRequest request) {
        int n = 0;
        String[] selectedValueArry = point6Arr.split("#");
        EvaluationSixDTO evaluationSixDTO = new EvaluationSixDTO();
        for(int i=0; i< selectedValueArry.length; i++) {
            switch(i) {
                case 0:
                    evaluationSixDTO.setValueOne(selectedValueArry[i]);
                    break;
                case 1:
                    evaluationSixDTO.setValueTwo(selectedValueArry[i]);
                    break;
                case 2:
                    evaluationSixDTO.setValueThree(selectedValueArry[i]);
                    break;
                case 3:
                    evaluationSixDTO.setValue(selectedValueArry[i]);
                    break;
                case 4:
                    evaluationSixDTO.setValueFive(selectedValueArry[i]);
                    break;
                case 5:
                    evaluationSixDTO.setValueSix(selectedValueArry[i]);
                    break;
                case 6:
                    evaluationSixDTO.setValueSeven(selectedValueArry[i]);
                    break;
                case 7:
                    evaluationSixDTO.setValueEight(selectedValueArry[i]);
                    break;
                case 8:
                    evaluationSixDTO.setValueNine(selectedValueArry[i]);
                    break;
                case 9:
                    evaluationSixDTO.setValueTen(selectedValueArry[i]);
                    break;
                case 10:
                    evaluationSixDTO.setValueEleven(selectedValueArry[i]);
                    break;
                case 11:
                    evaluationSixDTO.setValueTwelve(selectedValueArry[i]);
                    break;
                case 12:
                    evaluationSixDTO.setValueThirteen(selectedValueArry[i]);
                    break;
                case 13:
                    evaluationSixDTO.setValueFourteen(selectedValueArry[i]);
                    break;
                case 14:
                    evaluationSixDTO.setValueFifteen(selectedValueArry[i]);
                    break;
                case 15:
                    evaluationSixDTO.setValueSixteen(selectedValueArry[i]);
                    break;
                case 16:
                    evaluationSixDTO.setValueSeventeen(selectedValueArry[i]);
                    break;
                case 17:
                    evaluationSixDTO.setValueEighteen(selectedValueArry[i]);
                    break;
                case 18:
                    evaluationSixDTO.setValueNineteen(selectedValueArry[i]);
                    break;
                case 19:
                    evaluationSixDTO.setValueTwenty(selectedValueArry[i]);
                    break;
            }
        }
        evaluationSixDTO.setIsDel("0");
        evaluationSixDTO.setCreateTime(new Date());
        evaluationSixDTO.setUpdateTime(new Date());
        String name = (String) request.getSession().getAttribute("name");
        evaluationSixDTO.setName(name);
        EvaluationSixDTO obj = new EvaluationSixDTO();
        obj.setName(name);
        EvaluationSixDTO evaluationSixDTOTmp = evaluationSixService.selectEvaluationSixDTOByObj(obj);
        if(evaluationSixDTOTmp==null) {
            n = evaluationSixService.insertEvaluationSixDTO(evaluationSixDTO);
        } else {
            evaluationSixDTO.setId(evaluationSixDTOTmp.getId());
            n = evaluationSixService.updateEvaluationSixDTOById(evaluationSixDTO);
        }
        AjaxUtil.ajaxJsonSucMessage(response, n);
    }
    
    @RequestMapping("success")
    public String success(HttpServletRequest request, Model model) {
        try {
            
        
//        String year = (String) request.getSession().getAttribute("year");
        String name = (String) request.getSession().getAttribute("name");
        EvaluationOneDTO obj1 = new EvaluationOneDTO();
        obj1.setName(name);
//        obj1.setYears(year);
        EvaluationOneDTO evaluationOneDTOTmp = evaluationOneService.selectEvaluationOneDTOByObj(obj1);
        Assist assist = new Assist();
        assist.setRequires(Assist.andEq("is_del", "0"));
        assist.setRequires(Assist.andEq("class_a", "1"));
        assist.setOrder(Assist.order("update_time", true));
        List<IndexEvaluationDTO> datas = IndexEvaluationService.selectIndexEvaluationDTO(assist);
        double totalPoint = 0;
        for (int i = 0;i < datas.size(); i++) {
            switch(i) {
                case 0:
                    totalPoint = totalPoint + Integer.parseInt(datas.get(i).getWeight()) * Double.parseDouble(evaluationOneDTOTmp.getValueOne());
                    break;
                case 1:
                    totalPoint = totalPoint + Integer.parseInt(datas.get(i).getWeight()) * Double.parseDouble(evaluationOneDTOTmp.getValueTwo());
                    break;
                case 2:
                    totalPoint = totalPoint + Integer.parseInt(datas.get(i).getWeight()) * Double.parseDouble(evaluationOneDTOTmp.getValueThree());
                    break;
                case 3:
                    totalPoint = totalPoint + Integer.parseInt(datas.get(i).getWeight()) * Double.parseDouble(evaluationOneDTOTmp.getValue());
                    break;
                case 4:
                    totalPoint = totalPoint + Integer.parseInt(datas.get(i).getWeight()) * Double.parseDouble(evaluationOneDTOTmp.getValueFive());
                    break;
                case 5:
                    totalPoint = totalPoint + Integer.parseInt(datas.get(i).getWeight()) * Double.parseDouble(evaluationOneDTOTmp.getValueSix());
                    break;
                case 6:
                    totalPoint = totalPoint + Integer.parseInt(datas.get(i).getWeight()) * Double.parseDouble(evaluationOneDTOTmp.getValueSeven());
                    break;
                case 7:
                    totalPoint = totalPoint + Integer.parseInt(datas.get(i).getWeight()) * Double.parseDouble(evaluationOneDTOTmp.getValueEight());
                    break;
                case 8:
                    totalPoint = totalPoint + Integer.parseInt(datas.get(i).getWeight()) * Double.parseDouble(evaluationOneDTOTmp.getValueNine());
                    break;
                case 9:
                    totalPoint = totalPoint + Integer.parseInt(datas.get(i).getWeight()) * Double.parseDouble(evaluationOneDTOTmp.getValueTen());
                    break;
                case 10:
                    totalPoint = totalPoint + Integer.parseInt(datas.get(i).getWeight()) * Double.parseDouble(evaluationOneDTOTmp.getValueEleven());
                    break;
                case 11:
                    totalPoint = totalPoint + Integer.parseInt(datas.get(i).getWeight()) * Double.parseDouble(evaluationOneDTOTmp.getValueTwelve());
                    break;
                case 12:
                    totalPoint = totalPoint + Integer.parseInt(datas.get(i).getWeight()) * Double.parseDouble(evaluationOneDTOTmp.getValueThirteen());
                    break;
            } 
        }
        
        EvaluationTwoDTO obj2 = new EvaluationTwoDTO();
        obj2.setName(name);
//        obj2.setYears(year);
        EvaluationTwoDTO evaluationTwoDTOTmp = evaluationTwoService.selectEvaluationTwoDTOByObj(obj2);
        assist = new Assist();
        assist.setRequires(Assist.andEq("is_del", "0"));
        assist.setRequires(Assist.andEq("class_a", "2"));
        assist.setOrder(Assist.order("update_time", true));
        List<IndexEvaluationDTO> datas2 = IndexEvaluationService.selectIndexEvaluationDTO(assist);
        for (int i = 0;i < datas2.size(); i++) {
            switch(i) {
                case 0:
                    totalPoint = totalPoint + Integer.parseInt(datas2.get(i).getWeight()) * Double.parseDouble(evaluationTwoDTOTmp.getValueOne());
                    break;
                case 1:
                    totalPoint = totalPoint + Integer.parseInt(datas2.get(i).getWeight()) * Double.parseDouble(evaluationTwoDTOTmp.getValueTwo());
                    break;
                case 2:
                    totalPoint = totalPoint + Integer.parseInt(datas2.get(i).getWeight()) * Double.parseDouble(evaluationTwoDTOTmp.getValueThree());
                    break;
                case 3:
                    totalPoint = totalPoint + Integer.parseInt(datas2.get(i).getWeight()) * Double.parseDouble(evaluationTwoDTOTmp.getValue());
                    break;
                case 4:
                    totalPoint = totalPoint + Integer.parseInt(datas2.get(i).getWeight()) * Double.parseDouble(evaluationTwoDTOTmp.getValueFive());
                    break;
                case 5:
                    totalPoint = totalPoint + Integer.parseInt(datas2.get(i).getWeight()) * Double.parseDouble(evaluationTwoDTOTmp.getValueSix());
                    break;
                case 6:
                    totalPoint = totalPoint + Integer.parseInt(datas2.get(i).getWeight()) * Double.parseDouble(evaluationTwoDTOTmp.getValueSeven());
                    break;
                case 7:
                    totalPoint = totalPoint + Integer.parseInt(datas2.get(i).getWeight()) * Double.parseDouble(evaluationTwoDTOTmp.getValueEight());
                    break;
                case 8:
                    totalPoint = totalPoint + Integer.parseInt(datas2.get(i).getWeight()) * Double.parseDouble(evaluationTwoDTOTmp.getValueNine());
                    break;
            } 
        }
        
        EvaluationThreeDTO obj3 = new EvaluationThreeDTO();
        obj3.setName(name);
//        obj3.setYears(year);
        EvaluationThreeDTO evaluationThreeDTOTmp = evaluationThreeService.selectEvaluationThreeDTOByObj(obj3);
        assist = new Assist();
        assist.setRequires(Assist.andEq("is_del", "0"));
        assist.setRequires(Assist.andEq("class_a", "3"));
        assist.setOrder(Assist.order("update_time", true));
        List<IndexEvaluationDTO> datas3 = IndexEvaluationService.selectIndexEvaluationDTO(assist);
        for (int i = 0;i < datas3.size(); i++) {
            switch(i) {
                case 0:
                    totalPoint = totalPoint + Integer.parseInt(datas3.get(i).getWeight()) * Double.parseDouble(evaluationThreeDTOTmp.getValueOne());
                    break;
                case 1:
                    totalPoint = totalPoint + Integer.parseInt(datas3.get(i).getWeight()) * Double.parseDouble(evaluationThreeDTOTmp.getValueTwo());
                    break;
                case 2:
                    totalPoint = totalPoint + Integer.parseInt(datas3.get(i).getWeight()) * Double.parseDouble(evaluationThreeDTOTmp.getValueThree());
                    break;
                case 3:
                    totalPoint = totalPoint + Integer.parseInt(datas3.get(i).getWeight()) * Double.parseDouble(evaluationThreeDTOTmp.getValue());
                    break;
                case 4:
                    totalPoint = totalPoint + Integer.parseInt(datas3.get(i).getWeight()) * Double.parseDouble(evaluationThreeDTOTmp.getValueFive());
                    break;
                case 5:
                    totalPoint = totalPoint + Integer.parseInt(datas3.get(i).getWeight()) * Double.parseDouble(evaluationThreeDTOTmp.getValueSix());
                    break;
                case 6:
                    totalPoint = totalPoint + Integer.parseInt(datas3.get(i).getWeight()) * Double.parseDouble(evaluationThreeDTOTmp.getValueSeven());
                    break;
                case 7:
                    totalPoint = totalPoint + Integer.parseInt(datas3.get(i).getWeight()) * Double.parseDouble(evaluationThreeDTOTmp.getValueEight());
                    break;
                case 8:
                    totalPoint = totalPoint + Integer.parseInt(datas3.get(i).getWeight()) * Double.parseDouble(evaluationThreeDTOTmp.getValueNine());
                    break;
                case 9:
                    totalPoint = totalPoint + Integer.parseInt(datas3.get(i).getWeight()) * Double.parseDouble(evaluationThreeDTOTmp.getValueTen());
                    break;
                case 10:
                    totalPoint = totalPoint + Integer.parseInt(datas3.get(i).getWeight()) * Double.parseDouble(evaluationThreeDTOTmp.getValueEleven());
                    break;
                case 11:
                    totalPoint = totalPoint + Integer.parseInt(datas3.get(i).getWeight()) * Double.parseDouble(evaluationThreeDTOTmp.getValueTwelve());
                    break;
                case 12:
                    totalPoint = totalPoint + Integer.parseInt(datas3.get(i).getWeight()) * Double.parseDouble(evaluationThreeDTOTmp.getValueThirteen());
                    break;
                case 13:
                    totalPoint = totalPoint + Integer.parseInt(datas3.get(i).getWeight()) * Double.parseDouble(evaluationThreeDTOTmp.getValueFourteen());
                    break;
            } 
        }
        
        EvaluationFourDTO obj4 = new EvaluationFourDTO();
        obj4.setName(name);
//        obj4.setYears(year);
        EvaluationFourDTO evaluationFourDTOTmp = evaluationFourService.selectEvaluationFourDTOByObj(obj4);
        assist = new Assist();
        assist.setRequires(Assist.andEq("is_del", "0"));
        assist.setRequires(Assist.andEq("class_a", "4"));
        assist.setOrder(Assist.order("update_time", true));
        List<IndexEvaluationDTO> datas4 = IndexEvaluationService.selectIndexEvaluationDTO(assist);
        for (int i = 0;i < datas4.size(); i++) {
            switch(i) {
                case 0:
                    totalPoint = totalPoint + Integer.parseInt(datas4.get(i).getWeight()) * Double.parseDouble(evaluationFourDTOTmp.getValueOne());
                    break;
                case 1:
                    totalPoint = totalPoint + Integer.parseInt(datas4.get(i).getWeight()) * Double.parseDouble(evaluationFourDTOTmp.getValueTwo());
                    break;
                case 2:
                    totalPoint = totalPoint + Integer.parseInt(datas4.get(i).getWeight()) * Double.parseDouble(evaluationFourDTOTmp.getValueThree());
                    break;
                case 3:
                    totalPoint = totalPoint + Integer.parseInt(datas4.get(i).getWeight()) * Double.parseDouble(evaluationFourDTOTmp.getValue());
                    break;
                case 4:
                    totalPoint = totalPoint + Integer.parseInt(datas4.get(i).getWeight()) * Double.parseDouble(evaluationFourDTOTmp.getValueFive());
                    break;
                case 5:
                    totalPoint = totalPoint + Integer.parseInt(datas4.get(i).getWeight()) * Double.parseDouble(evaluationFourDTOTmp.getValueSix());
                    break;
                case 6:
                    totalPoint = totalPoint + Integer.parseInt(datas4.get(i).getWeight()) * Double.parseDouble(evaluationFourDTOTmp.getValueSeven());
                    break;
                case 7:
                    totalPoint = totalPoint + Integer.parseInt(datas4.get(i).getWeight()) * Double.parseDouble(evaluationFourDTOTmp.getValueEight());
                    break;
            } 
        }
        
        EvaluationFiveDTO obj5 = new EvaluationFiveDTO();
        obj5.setName(name);
//        obj5.setYears(year);
        EvaluationFiveDTO evaluationFiveDTOTmp = evaluationFiveService.selectEvaluationFiveDTOByObj(obj5);
        assist = new Assist();
        assist.setRequires(Assist.andEq("is_del", "0"));
        assist.setRequires(Assist.andEq("class_a", "5"));
        assist.setOrder(Assist.order("update_time", true));
        List<IndexEvaluationDTO> datas5 = IndexEvaluationService.selectIndexEvaluationDTO(assist);
        for (int i = 0;i < datas5.size(); i++) {
            switch(i) {
                case 0:
                    totalPoint = totalPoint + Integer.parseInt(datas5.get(i).getWeight()) * Double.parseDouble(evaluationFiveDTOTmp.getValueOne());
                    break;
                case 1:
                    totalPoint = totalPoint + Integer.parseInt(datas5.get(i).getWeight()) * Double.parseDouble(evaluationFiveDTOTmp.getValueTwo());
                    break;
                case 2:
                    totalPoint = totalPoint + Integer.parseInt(datas5.get(i).getWeight()) * Double.parseDouble(evaluationFiveDTOTmp.getValueThree());
                    break;
                case 3:
                    totalPoint = totalPoint + Integer.parseInt(datas5.get(i).getWeight()) * Double.parseDouble(evaluationFiveDTOTmp.getValue());
                    break;
                case 4:
                    totalPoint = totalPoint + Integer.parseInt(datas5.get(i).getWeight()) * Double.parseDouble(evaluationFiveDTOTmp.getValueFive());
                    break;
                case 5:
                    totalPoint = totalPoint + Integer.parseInt(datas5.get(i).getWeight()) * Double.parseDouble(evaluationFiveDTOTmp.getValueSix());
                    break;
                case 6:
                    totalPoint = totalPoint + Integer.parseInt(datas5.get(i).getWeight()) * Double.parseDouble(evaluationFiveDTOTmp.getValueSeven());
                    break;
                case 7:
                    totalPoint = totalPoint + Integer.parseInt(datas5.get(i).getWeight()) * Double.parseDouble(evaluationFiveDTOTmp.getValueEight());
                    break;
                case 8:
                    totalPoint = totalPoint + Integer.parseInt(datas5.get(i).getWeight()) * Double.parseDouble(evaluationFiveDTOTmp.getValueNine());
                    break;
            } 
        }
        
        EvaluationSixDTO obj6 = new EvaluationSixDTO();
        obj6.setName(name);
//        obj6.setYears(year);
        EvaluationSixDTO evaluationSixDTOTmp = evaluationSixService.selectEvaluationSixDTOByObj(obj6);
        assist = new Assist();
        assist.setRequires(Assist.andEq("is_del", "0"));
        assist.setRequires(Assist.andEq("class_a", "6"));
        assist.setOrder(Assist.order("update_time", true));
        List<IndexEvaluationDTO> datas6 = IndexEvaluationService.selectIndexEvaluationDTO(assist);
        for (int i = 0;i < datas6.size(); i++) {
            switch(i) {
                case 0:
                    totalPoint = totalPoint + Integer.parseInt(datas6.get(i).getWeight()) * Double.parseDouble(evaluationSixDTOTmp.getValueOne());
                    break;
                case 1:
                    totalPoint = totalPoint + Integer.parseInt(datas6.get(i).getWeight()) * Double.parseDouble(evaluationSixDTOTmp.getValueTwo());
                    break;
                case 2:
                    totalPoint = totalPoint + Integer.parseInt(datas6.get(i).getWeight()) * Double.parseDouble(evaluationSixDTOTmp.getValueThree());
                    break;
                case 3:
                    totalPoint = totalPoint + Integer.parseInt(datas6.get(i).getWeight()) * Double.parseDouble(evaluationSixDTOTmp.getValue());
                    break;
                case 4:
                    totalPoint = totalPoint + Integer.parseInt(datas6.get(i).getWeight()) * Double.parseDouble(evaluationSixDTOTmp.getValueFive());
                    break;
                case 5:
                    totalPoint = totalPoint + Integer.parseInt(datas6.get(i).getWeight()) * Double.parseDouble(evaluationSixDTOTmp.getValueSix());
                    break;
                case 6:
                    totalPoint = totalPoint + Integer.parseInt(datas6.get(i).getWeight()) * Double.parseDouble(evaluationSixDTOTmp.getValueSeven());
                    break;
                case 7:
                    totalPoint = totalPoint + Integer.parseInt(datas6.get(i).getWeight()) * Double.parseDouble(evaluationSixDTOTmp.getValueEight());
                    break;
                case 8:
                    totalPoint = totalPoint + Integer.parseInt(datas6.get(i).getWeight()) * Double.parseDouble(evaluationSixDTOTmp.getValueNine());
                    break;
                case 9:
                    totalPoint = totalPoint + Integer.parseInt(datas6.get(i).getWeight()) * Double.parseDouble(evaluationSixDTOTmp.getValueTen());
                    break;
                case 10:
                    totalPoint = totalPoint + Integer.parseInt(datas6.get(i).getWeight()) * Double.parseDouble(evaluationSixDTOTmp.getValueEleven());
                    break;
                case 11:
                    totalPoint = totalPoint + Integer.parseInt(datas6.get(i).getWeight()) * Double.parseDouble(evaluationSixDTOTmp.getValueTwelve());
                    break;
                case 12:
                    totalPoint = totalPoint + Integer.parseInt(datas6.get(i).getWeight()) * Double.parseDouble(evaluationSixDTOTmp.getValueThirteen());
                    break;
                case 13:
                    totalPoint = totalPoint + Integer.parseInt(datas6.get(i).getWeight()) * Double.parseDouble(evaluationSixDTOTmp.getValueFourteen());
                    break;
                case 14:
                    totalPoint = totalPoint + Integer.parseInt(datas6.get(i).getWeight()) * Double.parseDouble(evaluationSixDTOTmp.getValueFifteen());
                    break;
                case 15:
                    totalPoint = totalPoint + Integer.parseInt(datas6.get(i).getWeight()) * Double.parseDouble(evaluationSixDTOTmp.getValueSixteen());
                    break;
                case 16:
                    totalPoint = totalPoint + Integer.parseInt(datas6.get(i).getWeight()) * Double.parseDouble(evaluationSixDTOTmp.getValueSeventeen());
                    break;
                case 17:
                    totalPoint = totalPoint + Integer.parseInt(datas6.get(i).getWeight()) * Double.parseDouble(evaluationSixDTOTmp.getValueEighteen());
                    break;
                case 18:
                    totalPoint = totalPoint + Integer.parseInt(datas6.get(i).getWeight()) * Double.parseDouble(evaluationSixDTOTmp.getValueNineteen());
                    break;
                case 19:
                    totalPoint = totalPoint + Integer.parseInt(datas6.get(i).getWeight()) * Double.parseDouble(evaluationSixDTOTmp.getValueTwenty());
                    break;
            } 
        }
        totalPoint = totalPoint/100;
        EvaluationResultDTO value = new EvaluationResultDTO();
        value.setName(name);
//        value.setYear(year);
        value.setIsDel("0");
        value.setPoint((int)totalPoint + "");
        value.setUpdateTime(new Date());
        value.setCreateTime(new Date());
        EvaluationResultDTO value11 = new EvaluationResultDTO();
        value11.setName(name);
//        value11.setYear(year);
        value11.setIsDel("0");
        EvaluationResultDTO valueTmp = evaluationResultService.selectEvaluationResultDTOByObj(value11);
        if(valueTmp!= null) {
            evaluationResultService.updateEvaluationResultDTOById(value);
        } else {
            evaluationResultService.insertEvaluationResultDTO(value);
        }
        long totalCount = evaluationResultService.getEvaluationResultDTORowCount(null);
        Assist assistT = new Assist();
        assistT.setRequires(Assist.andLte("point", totalPoint+""));
        long selectCount = evaluationResultService.getEvaluationResultDTORowCount(assistT);
        model.addAttribute("value", value);
        DecimalFormat df=new DecimalFormat("0.00");
        String percent = df.format((float)selectCount/(float)totalCount *100);
        model.addAttribute("percent", percent);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "web/green/factory/success";
    }
    
    
    @RequestMapping("result")
    public String result(Model model, HttpServletRequest request) {
//        String year = (String) request.getSession().getAttribute("year");
        String name = (String) request.getSession().getAttribute("name");
        EvaluationZeroDTO obj0 = new EvaluationZeroDTO();
        obj0.setName(name);
//        obj0.setYears(year);
        EvaluationZeroDTO evaluationZeroDTOTmp = evaluationZeroService.selectEvaluationZeroDTOByObj(obj0);
        Assist assist = new Assist();
        assist.setRequires(Assist.andEq("is_del", "0"));
        assist.setRequires(Assist.andEq("evaluate_type", "0"));
        assist.setOrder(Assist.order("update_time", false));
        List<CommonAccordEvaluateDTO> datas0 = CommonAccordEvaluateService.selectCommonAccordEvaluateDTO(assist);
        model.addAttribute("evaluationZeroDTOTmp", evaluationZeroDTOTmp);
        model.addAttribute("datas0", datas0);

        EvaluationResultDTO EvaluationResultDTO = new EvaluationResultDTO();
        EvaluationResultDTO.setName(name);
//        EvaluationResultDTO.setYear(year);
        EvaluationResultDTO evaluationResultDTO = evaluationResultService.selectEvaluationResultDTOByObj(EvaluationResultDTO);
        long totalCount = evaluationResultService.getEvaluationResultDTORowCount(null);
        Assist assistT = new Assist();
        assistT.setRequires(Assist.andLte("point", evaluationResultDTO.getPoint()));
        long selectCount = evaluationResultService.getEvaluationResultDTORowCount(assistT);
        model.addAttribute("value", evaluationResultDTO);
        DecimalFormat df=new DecimalFormat("0.00");
        String percent = df.format((float)selectCount/(float)totalCount *100);
        model.addAttribute("percent", percent);
        
        model.addAttribute("classAMap", classAMap);
        model.addAttribute("classBMap", classBMap);
        model.addAttribute("typeMap", typeMap);
        return "web/green/factory/result1";
    }
    
    @RequestMapping("result2")
    public String result2(Model model, HttpServletRequest request) {
//        String year =  (String) request.getSession().getAttribute("year");
        String name =  (String) request.getSession().getAttribute("name");
        
        EvaluationOneDTO obj1 = new EvaluationOneDTO();
        obj1.setName(name);
//        obj1.setYears(year);
        EvaluationOneDTO evaluationOneDTOTmp = evaluationOneService.selectEvaluationOneDTOByObj(obj1);
        Assist assist1 = new Assist();
        assist1.setRequires(Assist.andEq("is_del", "0"));
        assist1.setRequires(Assist.andEq("class_a", "1"));
        assist1.setOrder(Assist.order("update_time", true));
        List<IndexEvaluationDTO> datas1 = IndexEvaluationService.selectIndexEvaluationDTO(assist1);
        model.addAttribute("evaluationOneDTOTmp", evaluationOneDTOTmp);
        model.addAttribute("datas1", datas1);
        
        EvaluationTwoDTO obj2 = new EvaluationTwoDTO();
        obj2.setName(name);
//        obj2.setYears(year);
        EvaluationTwoDTO evaluationTwoDTOTmp = evaluationTwoService.selectEvaluationTwoDTOByObj(obj2);
        Assist assist2 = new Assist();
        assist2.setRequires(Assist.andEq("is_del", "0"));
        assist2.setRequires(Assist.andEq("class_a", "2"));
        assist2.setOrder(Assist.order("update_time", true));
        List<IndexEvaluationDTO> datas2 = IndexEvaluationService.selectIndexEvaluationDTO(assist2);
        model.addAttribute("evaluationTwoDTOTmp", evaluationTwoDTOTmp);
        model.addAttribute("datas2", datas2);
        
        EvaluationThreeDTO obj3 = new EvaluationThreeDTO();
        obj3.setName(name);
//        obj3.setYears(year);
        EvaluationThreeDTO evaluationThreeDTOTmp = evaluationThreeService.selectEvaluationThreeDTOByObj(obj3);
        Assist assist3 = new Assist();
        assist3.setRequires(Assist.andEq("is_del", "0"));
        assist3.setRequires(Assist.andEq("class_a", "3"));
        assist3.setOrder(Assist.order("update_time", true));
        List<IndexEvaluationDTO> datas3 = IndexEvaluationService.selectIndexEvaluationDTO(assist3);
        model.addAttribute("evaluationThreeDTOTmp", evaluationThreeDTOTmp);
        model.addAttribute("datas3", datas3);
        
        EvaluationFourDTO obj4 = new EvaluationFourDTO();
        obj4.setName(name);
//        obj4.setYears(year);
        EvaluationFourDTO evaluationFourDTOTmp = evaluationFourService.selectEvaluationFourDTOByObj(obj4);
        Assist assist4 = new Assist();
        assist4.setRequires(Assist.andEq("is_del", "0"));
        assist4.setRequires(Assist.andEq("class_a", "4"));
        assist4.setOrder(Assist.order("update_time", true));
        List<IndexEvaluationDTO> datas4 = IndexEvaluationService.selectIndexEvaluationDTO(assist4);
        model.addAttribute("evaluationFourDTOTmp", evaluationFourDTOTmp);
        model.addAttribute("datas4", datas4);
        
        EvaluationFiveDTO obj5 = new EvaluationFiveDTO();
        obj5.setName(name);
//        obj5.setYears(year);
        EvaluationFiveDTO evaluationFiveDTOTmp = evaluationFiveService.selectEvaluationFiveDTOByObj(obj5);
        Assist assist5 = new Assist();
        assist5.setRequires(Assist.andEq("is_del", "0"));
        assist5.setRequires(Assist.andEq("class_a", "5"));
        assist5.setOrder(Assist.order("update_time", true));
        List<IndexEvaluationDTO> datas5 = IndexEvaluationService.selectIndexEvaluationDTO(assist5);
        model.addAttribute("evaluationFiveDTOTmp", evaluationFiveDTOTmp);
        model.addAttribute("datas5", datas5);
        
        EvaluationSixDTO obj6 = new EvaluationSixDTO();
        obj6.setName(name);
//        obj6.setYears(year);
        EvaluationSixDTO evaluationSixDTOTmp = evaluationSixService.selectEvaluationSixDTOByObj(obj6);
        Assist assist6 = new Assist();
        assist6.setRequires(Assist.andEq("is_del", "0"));
        assist6.setRequires(Assist.andEq("class_a", "6"));
        assist6.setOrder(Assist.order("update_time", true));
        List<IndexEvaluationDTO> datas6 = IndexEvaluationService.selectIndexEvaluationDTO(assist6);
        model.addAttribute("evaluationSixDTOTmp", evaluationSixDTOTmp);
        model.addAttribute("datas6", datas6);
        
        
        EvaluationResultDTO EvaluationResultDTO = new EvaluationResultDTO();
        EvaluationResultDTO.setName(name);
//        EvaluationResultDTO.setYear(year);
        EvaluationResultDTO evaluationResultDTO = evaluationResultService.selectEvaluationResultDTOByObj(EvaluationResultDTO);
        long totalCount = evaluationResultService.getEvaluationResultDTORowCount(null);
        Assist assistT = new Assist();
        assistT.setRequires(Assist.andLte("point", evaluationResultDTO.getPoint()));
        long selectCount = evaluationResultService.getEvaluationResultDTORowCount(assistT);
        model.addAttribute("value", evaluationResultDTO);
        DecimalFormat df=new DecimalFormat("0.00");
        String percent = df.format((float)selectCount/(float)totalCount *100);
        model.addAttribute("percent", percent);
        
        model.addAttribute("classAMap", classAMap);
        model.addAttribute("classBMap", classBMap);
        model.addAttribute("typeMap", typeMap);
        return "web/green/factory/result2";
    }
    
    
}