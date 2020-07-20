package com.ramostear.ckeditor.controller;

import com.ramostear.ckeditor.model.Content;
import com.ramostear.ckeditor.service.ContentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @author :       ramostear/树下魅狐
 * <p>This java file was created by ramostear in 2020/7/8 0008 0:38.
 * The following is the description information about this file:</p>
 * <p>description:</p>
 */
@Controller
public class HelloController {

    @Autowired
    ContentService contentService;

    @GetMapping("/hello")
    public String hello(Model model, HttpServletRequest request){
        List<Content> contents = contentService.findAll();
        System.out.println(contents);
        String id = request.getParameter("id");
        if (id != null){
            Content content1 = contentService.findById(Integer.parseInt(id));
            model.addAttribute("content2",content1);
        }
        model.addAttribute("contents",contents);
        model.addAttribute("message","Hello CKEditor5");
        return "hello";
    }
}
