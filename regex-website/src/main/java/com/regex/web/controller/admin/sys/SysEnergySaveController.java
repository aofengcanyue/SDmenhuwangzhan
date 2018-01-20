package com.regex.web.controller.admin.sys;

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
import com.regex.web.common.dto.info.EnergySaveDTO;
import com.regex.web.common.utils.AjaxUtil;
import com.regex.web.common.utils.Contant;
import com.regex.web.common.utils.QueryConditions;
import com.regex.web.common.utils.QueryResult;
import com.regex.web.controller.vo.PageVO;
import com.regex.web.excel.ExportExcel;
import com.regex.web.service.info.IEnergySaveService;
import com.regex.web.utils.HTMLSpiritUtil;
/**
 * 
 * 〈一句话功能简述〉<br> 
 * 节能技术
 *
 * @author Administrator
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
@Controller
@RequestMapping("sys/energySave")
public class SysEnergySaveController {
    
    @Autowired
    private IEnergySaveService iEnergySaveService;
     
    
    private static Map<String, String> typeMap = new HashMap<String, String>();
    
        static {
            
            typeMap.put("1", "节能部分");
            typeMap.put("2", "低碳部分");
            
    }
    
    @RequestMapping("input")
    public String input(Model model,@ModelAttribute("id")String id) {
        if(StringUtils.isNotEmpty(id)) {
        EnergySaveDTO energySaveDTO = iEnergySaveService.selectById(Long.parseLong(id));
        model.addAttribute("energySaveDTO",energySaveDTO);
        }
        model.addAttribute("typeMap",typeMap);
        return "admin/energySave/input";
    }
    /**
     * 
     * 功能描述: <br>
     * 后台添加节能低碳技术
     *
     * @param response
     * @param energySaveDTO
     * @see [相关类/方法](可选)
     * @since [产品/模块版本](可选)
     */
    @RequestMapping("insert")
    public void insert(HttpServletResponse response,EnergySaveDTO energySaveDTO) {
        int n = 0;
        if(energySaveDTO.getId()>0) {
            try {
                energySaveDTO.setUpdateTime(new Date());
                n= iEnergySaveService.updateById(energySaveDTO);
                
            } catch (Exception e) {
              e.printStackTrace();
            }
        }else {
            
            energySaveDTO.setIsDel("0");
            energySaveDTO.setCreateTime(new Date());
            energySaveDTO.setUpdateTime(new Date());
            n = iEnergySaveService.insert(energySaveDTO);
        }
        AjaxUtil.ajaxJsonSucMessage(response, n);
    }
    
    
    /**
     * 
     * 功能描述: <br>
     * 修改信息
     *
     * @param response
     * @param eliminationDTO
     * @param id
     * @see [相关类/方法](可选)
     * @since [产品/模块版本](可选)
     */
    @RequestMapping("update")
    public void update(HttpServletResponse response,EnergySaveDTO energySaveDTO,String id) {
        int n = 0;
        energySaveDTO.setId(Long.parseLong(id));
        energySaveDTO.setUpdateTime(new Date());
        n = iEnergySaveService.updateById(energySaveDTO);
        
        AjaxUtil.ajaxJsonSucMessage(response, n);
    }
    /**
     * 
     * 功能描述: <br>
     * 删除
     *
     * @param response
     * @param id
     * @see [相关类/方法](可选)
     * @since [产品/模块版本](可选)
     */
    @RequestMapping("delete")
    public void del(HttpServletResponse response,String id) {
        int n = 0;
        
        n = iEnergySaveService.del(Long.parseLong(id));
        
        AjaxUtil.ajaxJsonSucMessage(response, n);
    }
    /**
     * 
     * 功能描述: <br>
     * 节能低碳技术目录查询
     *
     * @param model
     * @return
     * @see [相关类/方法](可选)
     * @since [产品/模块版本](可选)
     */
    @RequestMapping("queryTechnology")
    public String queryTechnology(Model model,QueryConditions params) {
        
        params.setPageSize(Contant.NONMAL_PAGE_SIZE);
        params.setStartIndex((params.getPageNumber() - 1) * Contant.NONMAL_PAGE_SIZE);
        List<EnergySaveDTO> energySaveList = iEnergySaveService.selectByName(params);
        int count = iEnergySaveService.selectCountByName(params);
        QueryResult<EnergySaveDTO> result = new QueryResult<EnergySaveDTO>(count, Contant.NONMAL_PAGE_SIZE, params.getPageNumber());
        result.setDatas(energySaveList);
        return "";
    }
    
    /**
     * 
     * 功能描述: <br>
     * 节能低碳技术列表
     *
     * @param model
     * @return
     * @see [相关类/方法](可选)
     * @since [产品/模块版本](可选)
     */
   /* @RequestMapping("show")
    public String show(Model model) {
           
        List<EnergySaveDTO> energySaveList = iEnergySaveService.selectAll();
        
        model.addAttribute("energySaveList",energySaveList);
        
        return "admin/energySave/show";
    }*/
    
    @RequestMapping("show")
    public String show() {
        return "admin/energySave/show";
    }
    
    @RequestMapping(value = "getPage", method = RequestMethod.POST)
    @ResponseBody
    public void getPage(Model model, @ModelAttribute("assist") Assist assist, HttpServletResponse response, int sEcho,
            String columns, String iDisplayStart, String iDisplayLength, String sSearch) {
        
        assist.setRequires(Assist.andNeq("is_del", "1"));
        if(StringUtils.isEmpty(iDisplayLength)) {
            iDisplayLength = "10";
        }
        assist.setRowSize(Integer.parseInt(iDisplayLength));
        if(StringUtils.isEmpty(iDisplayStart)) {
            iDisplayStart = "0";
        }
        if(StringUtils.isNotEmpty(sSearch)) {
            assist.setRequires(Assist.customRequire("and technical like concat('%',", sSearch, ",'%')"));
        }
        assist.setStartRow(Integer.parseInt(iDisplayStart));
        List<EnergySaveDTO> energySaveList = iEnergySaveService.selectEnergySaveDTO(assist);
        
        long totalCount = iEnergySaveService.getEnergySaveDTORowCount(assist);
        model.addAttribute("data", energySaveList);
        PageVO<EnergySaveDTO> mData = new PageVO<EnergySaveDTO>();
        mData.setAaData(energySaveList);
        mData.setsEcho(sEcho);
        mData.setiTotalRecords(totalCount);
        mData.setiTotalDisplayRecords(totalCount);
        AjaxUtil.ajaxJsonSucMessage(response, mData);
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
            String fileName = "节能技术"+(new Date()).getTime()+".xlsx";
            List<EnergySaveDTO> datas = iEnergySaveService.selectEnergySaveDTO(null);
            for(EnergySaveDTO EnergySaveDTO : datas) {
                EnergySaveDTO.setTechnicalContent(HTMLSpiritUtil.delHTMLTag(EnergySaveDTO.getTechnicalContent()));
                if(EnergySaveDTO.getIsDel().equals("1")) {
                    EnergySaveDTO.setIsDel("已删除");
                } else {
                    EnergySaveDTO.setIsDel("未删除");
                }
                EnergySaveDTO.setType(typeMap.get(EnergySaveDTO.getType()));
            }
            new ExportExcel("节能技术", EnergySaveDTO.class).setDataList(datas).write(response, fileName).dispose();
            return null; 
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "redirect:show.htm";
    }
    
    
}
