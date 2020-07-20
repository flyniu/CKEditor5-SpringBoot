package com.ramostear.ckeditor.controller;

import com.alibaba.fastjson.JSONObject;
import com.ramostear.ckeditor.model.Content;
import com.ramostear.ckeditor.service.ContentService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

@RestController
@RequestMapping("/content")
public class ContentController {

    @Autowired
    ContentService contentService;

    @PostMapping("/content2")
    public JSONObject image(@RequestParam(name = "content") String content){
        JSONObject json = new JSONObject();
        Content content1 = new Content();
        content1.setText(content);
        contentService.save(content1);
        json.put("content",content);
        json.put("state","success");
        System.out.println(content);
        return json;
        }

}
