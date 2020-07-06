package com.luo.wiley.springbootdemo.controller;

import com.luo.wiley.springbootdemo.opensource.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "resource/")
public class ResourceController {

    @Autowired
    private Resource resource;

    @GetMapping("/ftl/index")
    public String indexftl(ModelMap map) {
        map.put("name", resource.getName());
        map.put("website", resource.getWebsite());
        map.put("language", resource.getLanguage());
        map.addAttribute("resource", resource);
        return "freemarker/index";
    }

    @GetMapping("/thyme/index")
    public String indexthyme(ModelMap map) {
        map.put("name", resource.getName());
        map.put("website", resource.getWebsite());
        map.put("language", resource.getLanguage());
        map.addAttribute("resource", resource);
        return "thymeleaf/index.html";
    }
}
