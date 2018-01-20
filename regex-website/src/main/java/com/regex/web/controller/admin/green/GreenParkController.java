package com.regex.web.controller.admin.green;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
import com.regex.web.common.dto.green.GreenParkDTO;
import com.regex.web.common.dto.green.ParkAssessmentDTO;
import com.regex.web.common.dto.info.ParkAccordDTO;
import com.regex.web.controller.vo.PageVO;
import com.regex.web.excel.ExportExcel;
import com.regex.web.service.green.GreenParkService;
import com.regex.web.service.green.ParkAssessmentService;
import com.regex.web.service.info.ParkAccordService;
import com.regex.web.utils.AjaxUtil;

@Controller
@RequestMapping("sys/greenPark")
public class GreenParkController {
    
    @Autowired
    private GreenParkService greenParkService;
    
    @Autowired
    private ParkAssessmentService parkAssessmentService;
    
    @Autowired
    private ParkAccordService parkAccordService;
    
    
    private static Map<String, String> TypeMap = new HashMap<String, String>();
    
    
    static {
        TypeMap.put("0", "国家级"); 
        TypeMap.put("1", "省级"); 
        TypeMap.put("2", "市级");
     
  }
    
    /*@RequestMapping("show")
    public String show(Model model, Assist assist) {
        
        assist.setRequires(Assist.andEq("is_del", "0"));
        List<GreenParkDTO> List = greenParkService.selectGreenParkDTO(assist);
        model.addAttribute("List",List);
        
        return "admin/greenPark/show";
    }*/
    
    
    @RequestMapping("show")
    public String show() {
        return "admin/greenPark/show";
    }
    
    @RequestMapping(value = "getPage", method = RequestMethod.POST)
    @ResponseBody
    public void getPage(Model model, @ModelAttribute("assist") Assist assist, HttpServletResponse response, int sEcho,
            String columns, String iDisplayStart, String iDisplayLength, String sSearch) {
        
        assist.setRequires(Assist.andEq("is_del", "0"));
        if(StringUtils.isEmpty(iDisplayLength)) {
            iDisplayLength = "10";
        }
        assist.setRowSize(Integer.parseInt(iDisplayLength));
        if(StringUtils.isEmpty(iDisplayStart)) {
            iDisplayStart = "0";
        }
        if(StringUtils.isNotEmpty(sSearch)) {
            assist.setRequires(Assist.customRequire("and name like concat('%',", sSearch, ",'%')"));
        }
        assist.setStartRow(Integer.parseInt(iDisplayStart));
        List<GreenParkDTO> List = greenParkService.selectGreenParkDTO(assist);
        
        long totalCount = greenParkService.getGreenParkDTORowCount(assist);
        model.addAttribute("data", List);
        PageVO<GreenParkDTO> mData = new PageVO<GreenParkDTO>();
        mData.setAaData(List);
        mData.setsEcho(sEcho);
        mData.setiTotalRecords(totalCount);
        mData.setiTotalDisplayRecords(totalCount);
        AjaxUtil.ajaxJsonSucMessage(response, mData);
    }
    
    @RequestMapping("input")
    public String input(Long id, Model model) {
        
        GreenParkDTO greenParkDTO = greenParkService.selectGreenParkDTOById(id);
        model.addAttribute("greenPark",greenParkDTO);
        model.addAttribute("TypeMap",TypeMap);
        return "admin/greenPark/input";
    }
    
    /**
     * 
     * 功能描述: <br>
     * 指标性评价
     *
     * @param id
     * @param model
     * @param assist
     * @return
     * @see [相关类/方法](可选)
     * @since [产品/模块版本](可选)
     */
    @RequestMapping("detail")
    public String detail(String id, Model model,Assist assist) {
        
        assist.setRequires(Assist.andEq("name", id));
        
        List<ParkAssessmentDTO> parkAssessmentList = parkAssessmentService.selectParkAssessmentDTO(assist);
        
        ParkAssessmentDTO list = new ParkAssessmentDTO();//2015
        ParkAssessmentDTO list1 = new ParkAssessmentDTO();//2016
        ParkAssessmentDTO list2 = new ParkAssessmentDTO();//2017
        
        for(ParkAssessmentDTO assessmentDTO : parkAssessmentList) {
            
            if(assessmentDTO.getYears().equals("2015")) {
                list = assessmentDTO;
            }else if(assessmentDTO.getYears().equals("2016")) {
                list1 = assessmentDTO;
            }else if(assessmentDTO.getYears().equals("2017")) {
                list2 = assessmentDTO;
            }
        }
        model.addAttribute("list",list);
        model.addAttribute("list1",list1);
        model.addAttribute("list2",list2);
        
        return "admin/greenPark/detail";
    }
    
    /**
     * 
     * 功能描述: <br>
     * 符合性评价
     *
     * @param id
     * @param model
     * @param assist
     * @return
     * @see [相关类/方法](可选)
     * @since [产品/模块版本](可选)
     */
    @RequestMapping("detail1")
    public String detail1(String id, Model model,Assist assist) {
        try {
            
            assist.setRequires(Assist.andEq("park_id", id));
            
            List<ParkAccordDTO> parkAccordList = parkAccordService.selectParkAccordDTO(assist);
            ParkAccordDTO list = new ParkAccordDTO();//2015
            ParkAccordDTO list1 = new ParkAccordDTO();//2016
            ParkAccordDTO list2 = new ParkAccordDTO();//2017
            
            for(ParkAccordDTO parkAccordDTO : parkAccordList) {
                
                if(parkAccordDTO.getYear().equals("2015")) {
                    list = parkAccordDTO;
                }else if(parkAccordDTO.getYear().equals("2016")) {
                    list1 = parkAccordDTO;
                }else if(parkAccordDTO.getYear().equals("2017")) {
                    list2 = parkAccordDTO;
                }
            }
            model.addAttribute("list",list);
            model.addAttribute("list1",list1);
            model.addAttribute("list2",list2);
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        
        return "admin/greenPark/detail1";
    
    }
    
    /**
     * 
     * 功能描述: <br>
     * 导出excel
     *
     * @param response
     * @param model
     * @return
     * @see [相关类/方法](可选)
     * @since [产品/模块版本](可选)
     */
    @RequestMapping(value = "export", method=RequestMethod.POST)
    public String exportFile(HttpServletResponse response, Model model) {
        try {
            String fileName = "绿色园区"+(new Date()).getTime()+".xlsx";
            List<GreenParkDTO> datas = greenParkService.selectGreenParkDTO(null);
            for(GreenParkDTO GreenParkDTO : datas) {
                if(GreenParkDTO.getIsDel().equals("1")) {
                    GreenParkDTO.setIsDel("已删除");
                } else {
                    GreenParkDTO.setIsDel("未删除");
                }
                GreenParkDTO.setType(TypeMap.get(GreenParkDTO.getType()));
            }
            new ExportExcel("绿色园区", GreenParkDTO.class).setDataList(datas).write(response, fileName).dispose();
            return null; 
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "redirect:show.htm";
    }
}
