package com.regex.web.controller;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.alibaba.fastjson.JSON;
import com.regex.web.common.dto.sys.SysUser;
import com.regex.web.controller.vo.ImageVO;
import com.regex.web.utils.SaveUploadFile;

@Controller
public class IndexController extends BaseController {
    
    private static Logger LOGGER = LoggerFactory.getLogger(IndexController.class);
    
	@RequestMapping("index")
	public String index(HttpServletRequest request) {
	    SysUser sysUser = getCurrentUser(request);
	    if("ROLE_USER".equals(sysUser.getRights())) {
	        return "redirect:web/index.htm";
	    }
		return "index";
	}
	
	@RequestMapping(value = "uploadImage", method = RequestMethod.POST)
    @ResponseBody
    public String uploadImage(MultipartFile fileField, HttpServletResponse response,
            HttpServletRequest request) {
        String fileName=fileField.getOriginalFilename();
        UUID.randomUUID();
        String fileNameArray[] = fileName.split("\\.");
        fileName = UUID.randomUUID() + "." + fileNameArray[fileNameArray.length - 1];
        String url = "";
        try {
            url = SaveUploadFile.savePic(fileField, request, fileName, "");
        } catch (Exception e) {
            LOGGER.error("upload is fail!");
        }
        LOGGER.error(url);
        ImageVO imageVO = new ImageVO();
        imageVO.setImageName(fileName);
        imageVO.setImageUrl(url);
        String s = JSON.toJSONString(imageVO);
        System.out.println(s);
        return s;
    }
	
	@RequestMapping(value = "uploadFile", method = RequestMethod.POST)
    @ResponseBody
    public void uploadFile(MultipartFile fileField1, HttpServletResponse response,
            HttpServletRequest request) {
        String fileName=fileField1.getOriginalFilename();
        UUID.randomUUID();
        String fileNameArray[] = fileName.split("\\.");
        fileName = fileName.replaceAll("." + fileNameArray[fileNameArray.length - 1], "");
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHH");
        
        fileName = fileName + "_"+ sdf.format(new Date()) + "." + fileNameArray[fileNameArray.length - 1];
        String url = "";
        try {
            url = SaveUploadFile.savePic(fileField1, request, fileName, "");
        } catch (Exception e) {
            LOGGER.error("upload is fail!");
        }
        LOGGER.error(url);
        ImageVO imageVO = new ImageVO();
        imageVO.setImageName(fileName);
        imageVO.setImageUrl(url);
//        String s = JSON.toJSONString(imageVO);
//        System.out.println(s);
        Map<String, String> map = new HashMap<String, String>();
        map.put("imageVO", JSON.toJSONString(imageVO));
        response.setContentType("application/json;charset=UTF-8");
        response.setHeader("Pragma", "No-cache");
        response.setHeader("Cache-Control", "no-cache");
        response.setDateHeader("Expires", 0);
        try {
            response.getWriter().write(JSON.toJSONString(map));
            response.getWriter().flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
	
	@RequestMapping(value = "uploadImages", method = RequestMethod.POST)
    @ResponseBody
    public String uploadImages(MultipartFile[] fileFields, HttpServletResponse response, HttpServletRequest request) {
        List<ImageVO> imageList = new ArrayList<ImageVO>();
        for(MultipartFile fileField : fileFields) {
            String fileName=fileField.getOriginalFilename();
            UUID.randomUUID();
            String fileNameArray[] = fileName.split("\\.");
            fileName = UUID.randomUUID() + "." + fileNameArray[fileNameArray.length - 1];
            String url = "";
            try {
                url = SaveUploadFile.savePic(fileField, request, fileName, "");
            } catch (Exception e) {
                LOGGER.error("upload is fail!");
            }
            LOGGER.error(url);
            ImageVO imageVO = new ImageVO();
            imageVO.setImageName(fileName);
            imageVO.setImageUrl(url);
            imageList.add(imageVO);
        }
        String s = JSON.toJSONString(imageList);
//      System.out.println(s);
        return s;
    }
    
	
}
