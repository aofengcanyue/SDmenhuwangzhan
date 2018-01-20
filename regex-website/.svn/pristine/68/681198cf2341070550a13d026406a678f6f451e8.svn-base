package com.regex.web.controller.web;

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
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.regex.web.common.Assist;
import com.regex.web.common.dto.info.AnswerInfoDTO;
import com.regex.web.common.dto.info.ExpertAnswerDTO;
import com.regex.web.common.dto.sys.SysUser;
import com.regex.web.common.utils.Contant;
import com.regex.web.common.utils.QueryParam;
import com.regex.web.common.utils.QueryResult;
import com.regex.web.controller.BaseController;
import com.regex.web.service.info.AnswerInfoService;
import com.regex.web.service.info.ExpertAnswerService;
import com.regex.web.service.sys.SysUserService;
import com.regex.web.utils.AjaxUtil;

/**
 * 
 * 〈一句话功能简述〉<br> 
 * 专家问答
 *
 * @author admin
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
@Controller
@RequestMapping("web/expertAnswer")
public class WebExpertAnswerController extends BaseController {

    
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
     * 专家问答
     *
     * @param model
     * @param assist
     * @return
     * @see [相关类/方法](可选)
     * @since [产品/模块版本](可选)
     */
    @RequestMapping("show")
    public String show(Model model, @ModelAttribute("param") QueryParam param,@ModelAttribute("type") String type) {
        Assist assist = new Assist();  
        assist.setRowSize(Contant.NONMAL_PAGE_SIZE);
        assist.setStartRow((param.getPageNumber() - 1) * Contant.NONMAL_PAGE_SIZE);
        assist.setOrder(Assist.order("update_time", false));
        assist.setRequires(Assist.andEq("is_del", "0"));
        if(StringUtils.isNotEmpty(type)) {
            assist.setRequires(Assist.andEq("type", type));
        }
        assist.setRequires(Assist.andEq("audit", "1"));
        List<ExpertAnswerDTO> datas = ExpertAnswerService.selectExpertAnswerDTO(assist);
        for(ExpertAnswerDTO expertAnswerDTO : datas) {
            Assist assistQuery = new Assist();
            assistQuery.setRequires(Assist.andEq("answer_id", expertAnswerDTO.getId()));
            long answerCount = answerInfoService.getAnswerInfoDTORowCount(assistQuery);
            expertAnswerDTO.setAnswerCount(answerCount);
        }
        int totalCount = (int) ExpertAnswerService.getExpertAnswerDTORowCount(assist);
        QueryResult<ExpertAnswerDTO> result = new QueryResult<ExpertAnswerDTO>(totalCount, Contant.NONMAL_PAGE_SIZE, param.getPageNumber());
        result.setDatas(datas);
        model.addAttribute("result", result);
        model.addAttribute("typeMap", typeMap);
        return "web/expertAnswer/show";
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
    public String detial(@PathVariable("id") Long id, Model model,@ModelAttribute("assist") Assist assist) {
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
            
            ExpertAnswerDTO.setReadCount(ExpertAnswerDTO.getReadCount() + 1);;
            ExpertAnswerService.updateNonEmptyExpertAnswerDTOById(ExpertAnswerDTO);
        } catch (Exception e) {
            e.printStackTrace();
        }
        model.addAttribute("typeMap", typeMap);
        return "web/expertAnswer/detial";
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
     * 修改/ 新增
     *
     * @param id
     * @param model
     * @return
     * @see [相关类/方法](可选)
     * @since [产品/模块版本](可选)
     */
    @RequestMapping("input")
    public String input(String expertId,  Model model) {
        Assist assist = new Assist();
        assist.setRowSize(Contant.NONMAL_PAGE_SIZE);
        assist.setStartRow(0);
        assist.setOrder(Assist.order("read_count", false));
        assist.setOrder(Assist.order("update_time", false));
        assist.setRequires(Assist.andEq("is_del", "0"));
        assist.setRequires(Assist.andEq("audit", "1"));
        List<ExpertAnswerDTO> datas = ExpertAnswerService.selectExpertAnswerDTO(assist);
        for(ExpertAnswerDTO expertAnswerDTO : datas) {
            Assist assistQuery = new Assist();
            assistQuery.setRequires(Assist.andEq("answer_id", expertAnswerDTO.getId()));
            long answerCount = answerInfoService.getAnswerInfoDTORowCount(assistQuery);
            expertAnswerDTO.setAnswerCount(answerCount);
        }
        model.addAttribute("datas", datas);
        model.addAttribute("expertId", expertId);
        model.addAttribute("typeMap", typeMap);
        return "web/expertAnswer/input";
    }
    
    @RequestMapping("publish")
    public void publish(String expertId, String title, String content,
            String type, HttpServletResponse response) {
        int n = 0;
        if(StringUtils.isNotEmpty(title) && StringUtils.isNotEmpty(content)) {
            ExpertAnswerDTO expertAnswerDTO = new ExpertAnswerDTO();
            expertAnswerDTO.setReadCount(0);
            expertAnswerDTO.setAudit("0");
            expertAnswerDTO.setTitle(title);
            expertAnswerDTO.setIsDel("0");
            expertAnswerDTO.setUserId("3");
            expertAnswerDTO.setExpertId(expertId);
            expertAnswerDTO.setType(type);
            expertAnswerDTO.setCreateTime(new Date());
            expertAnswerDTO.setUpdateTime(new Date());
            expertAnswerDTO.setIsTop("0");
            n = ExpertAnswerService.insertExpertAnswerDTO(expertAnswerDTO);
            AnswerInfoDTO value = new AnswerInfoDTO();
            value.setAnswerId(expertAnswerDTO.getId());
            value.setContent(content);
            value.setCreateTime(new Date());
            value.setIsDel("0");
            value.setUpdateTime(new Date());
            value.setUserid("3");
            n = answerInfoService.insertAnswerInfoDTO(value);
        } else {
            n = 2;
        }
        AjaxUtil.ajaxJsonSucMessage(response, n);
    }
    
}
