package com.regex.web.controller.expert;

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
import com.regex.web.common.dto.info.AnswerInfoDTO;
import com.regex.web.common.dto.info.ExpertAnswerDTO;
import com.regex.web.common.dto.sys.SysUser;
import com.regex.web.controller.BaseController;
import com.regex.web.controller.vo.PageVO;
import com.regex.web.service.info.AnswerInfoService;
import com.regex.web.service.info.ExpertAnswerService;
import com.regex.web.service.sys.SysUserService;
import com.regex.web.utils.AjaxUtil;

/**
 * 
 * 〈一句话功能简述〉<br> 
 * 专家问答
 *
 * @author expert
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
@Controller
@RequestMapping("expert/ExpertAnswer")
public class ExpertExpertAnswerController extends BaseController {

    
    @Autowired
    private ExpertAnswerService ExpertAnswerService;
    
    @Autowired
    private AnswerInfoService answerInfoService;
    
    @Autowired
    private SysUserService sysUserService;
    
    private static Map<String, String> typeMap = new HashMap<String, String>();
    
    static {
        typeMap.put("0", "能源计量与信息化");
        typeMap.put("1", "通用技术节能");
        typeMap.put("2", "循环经济与清洁生产");
        typeMap.put("3", "节能咨询");
        typeMap.put("4", "政策咨询");
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
    public String show() {
        return "expert/ExpertAnswer/show";
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
        List<ExpertAnswerDTO> datas = ExpertAnswerService.selectExpertAnswerDTO(assist);
        
        long totalCount = ExpertAnswerService.getExpertAnswerDTORowCount(assist);
        model.addAttribute("data", datas);
        PageVO<ExpertAnswerDTO> mData = new PageVO<ExpertAnswerDTO>();
        mData.setAaData(datas);
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
    public String detial(Long id, Model model,@ModelAttribute("assist") Assist assist) {
        try {
            ExpertAnswerDTO ExpertAnswerDTO = ExpertAnswerService.selectExpertAnswerDTOById(id);
            model.addAttribute("ExpertAnswerDTO", ExpertAnswerDTO);
            
            assist.setRequires(Assist.andEq("is_del", "0"));
            assist.setOrder(Assist.order("update_time", true));
            assist.setRequires(Assist.andEq("answer_id", ExpertAnswerDTO.getId()));
            List<AnswerInfoDTO> dataList = answerInfoService.selectAnswerInfoDTO(assist);
            for(AnswerInfoDTO AnswerInfoDTO : dataList) {
                SysUser userTmp = sysUserService.selectSysUserById(AnswerInfoDTO.getUserid());
                AnswerInfoDTO.setUserid(userTmp.getName());
            }
            model.addAttribute("dataList", dataList);
        } catch (Exception e) {
            e.printStackTrace();
        }
        model.addAttribute("typeMap", typeMap);
        return "expert/ExpertAnswer/detial";
    }
    
    /**
     * 
     * 功能描述: <br>
     * input
     *
     * @param id
     * @param model
     * @param assist
     * @return
     * @see [相关类/方法](可选)
     * @since [产品/模块版本](可选)
     */
    @RequestMapping("input")
    public String input(Long id, Model model,@ModelAttribute("assist") Assist assist) {
        try {
            ExpertAnswerDTO ExpertAnswerDTO = ExpertAnswerService.selectExpertAnswerDTOById(id);
            model.addAttribute("ExpertAnswerDTO", ExpertAnswerDTO);
            
            assist.setRequires(Assist.andEq("is_del", "0"));
            assist.setOrder(Assist.order("update_time", true));
            assist.setRequires(Assist.andEq("answer_id", ExpertAnswerDTO.getId()));
            List<AnswerInfoDTO> dataList = answerInfoService.selectAnswerInfoDTO(assist);
            for(AnswerInfoDTO AnswerInfoDTO : dataList) {
                SysUser userTmp = sysUserService.selectSysUserById(AnswerInfoDTO.getUserid());
                AnswerInfoDTO.setUserid(userTmp.getName());
            }
            model.addAttribute("dataList", dataList);
        } catch (Exception e) {
            e.printStackTrace();
        }
        model.addAttribute("typeMap", typeMap);
        return "expert/ExpertAnswer/input";
    }
    
    /**
     * 
     * 功能描述: <br>
     * 回复
     *
     * @param id
     * @param content
     * @param response
     * @see [相关类/方法](可选)
     * @since [产品/模块版本](可选)
     */
    @RequestMapping("save")
   public void save(Long id,String content, HttpServletResponse response, HttpServletRequest request) {
        SysUser user = getCurrentUser(request);
        ExpertAnswerDTO ExpertAnswerDTO = ExpertAnswerService.selectExpertAnswerDTOById(id);
        int n = 0;
        if("0".equals(ExpertAnswerDTO.getIsDel())) {
            AnswerInfoDTO value = new AnswerInfoDTO();
            value.setAnswerId(id);
            value.setContent(content);
            value.setCreateTime(new Date());
            value.setIsDel("0");
            value.setUpdateTime(new Date());
            value.setUserid(user.getUserId());
            n = answerInfoService.insertAnswerInfoDTO(value);
        } else {
            n = 2;
        }
        AjaxUtil.ajaxJsonSucMessage(response, n);
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
        ExpertAnswerDTO ExpertAnswerDTO = ExpertAnswerService.selectExpertAnswerDTOById(id);
        ExpertAnswerDTO.setIsDel("1");
        n = ExpertAnswerService.updateNonEmptyExpertAnswerDTOById(ExpertAnswerDTO);
        AjaxUtil.ajaxJsonSucMessage(response, n);
    }
    
}
