package com.regex.web.controller.enterprise;

import java.util.Date;
import java.util.List;

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
import com.regex.web.common.dto.info.FinancingDTO;
import com.regex.web.common.dto.sys.SysUser;
import com.regex.web.controller.BaseController;
import com.regex.web.controller.vo.PageVO;
import com.regex.web.service.info.FinancingService;
import com.regex.web.utils.AjaxUtil;

/**
 * 
 * 〈一句话功能简述〉<br> 
 * 融资项目
 *
 * @author admin
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
@Controller
@RequestMapping("ent/Financing")
public class EntFinancingController extends BaseController {

    
    @Autowired
    private FinancingService FinancingService;
    
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
        return "enterprise/my_financing/show";
    }
    
    @RequestMapping(value = "getPage", method = RequestMethod.POST)
    @ResponseBody
    public void getPage(Model model, @ModelAttribute("assist") Assist assist, HttpServletResponse response, int sEcho,
            String columns, String iDisplayStart, String iDisplayLength, String sSearch,
            HttpServletRequest request) {
        SysUser user = getCurrentUser(request);
        assist.setRequires(Assist.andEq("user_id", user.getUserId()));
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
        List<FinancingDTO> datas = FinancingService.selectFinancingDTO(assist);
        
        long totalCount = FinancingService.getFinancingDTORowCount(assist);
        model.addAttribute("data", datas);
        PageVO<FinancingDTO> mData = new PageVO<FinancingDTO>();
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
    public String detial(Long id, Model model) {
        try {
            FinancingDTO FinancingDTO = FinancingService.selectFinancingDTOById(id);
            model.addAttribute("FinancingDTO", FinancingDTO);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "enterprise/my_financing/detial";
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
        FinancingDTO FinancingDTO = FinancingService.selectFinancingDTOById(id);
        FinancingDTO.setIsDel("1");
        n = FinancingService.updateNonEmptyFinancingDTOById(FinancingDTO);
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
            FinancingDTO FinancingDTO = FinancingService.selectFinancingDTOById(id);
            model.addAttribute("FinancingDTO", FinancingDTO);
        }
        return "enterprise/my_financing/input";
    }
    
    /**
     * 
     * 功能描述: <br>
     * 保存
     *
     * @param FinancingDTO
     * @param response
     * @param request
     * @see [相关类/方法](可选)
     * @since [产品/模块版本](可选)
     */
    @RequestMapping("save")
    public void save(FinancingDTO FinancingDTO, HttpServletResponse response,
            HttpServletRequest request) {
        int n = 0;
        SysUser user = getCurrentUser(request);
        try {
        if(StringUtils.isNotEmpty(FinancingDTO.getCompany()) && StringUtils.isNotEmpty(FinancingDTO.getContact())
                && StringUtils.isNotEmpty(FinancingDTO.getPhone())) {
            FinancingDTO.setUpdateTime(new Date());
            if(FinancingDTO.getId() > 0) {
                n = FinancingService.updateNonEmptyFinancingDTOById(FinancingDTO);
            } else {
                FinancingDTO.setIsDel("0");
                FinancingDTO.setCreateTime(new Date());
                FinancingDTO.setUserId(user.getUserId());
                n = FinancingService.insertFinancingDTO(FinancingDTO);
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
