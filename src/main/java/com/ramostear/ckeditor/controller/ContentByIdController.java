package com.ramostear.ckeditor.controller;

import com.alibaba.fastjson.JSONObject;
import com.ramostear.ckeditor.model.Content;
import com.ramostear.ckeditor.service.ContentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/content")
public class ContentByIdController {

    @Autowired
    ContentService contentService;

    @GetMapping("/hello")
    public String contentById(Model model, HttpServletRequest request){
        String id = request.getParameter("id");
        System.out.println(id);
        Content content1 = contentService.findById(Integer.parseInt(id));
        model.addAttribute("content2","content2");
        System.out.println(content1);
        return "hello";
        }

}
