package com.bipolar.webapp.home;

import com.bipolar.webapp.services.WebScrapingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @Autowired
    private WebScrapingService webScrapingService;

    @RequestMapping(value = {"/", "/home"})
    public String getHome(Model model) {
        model.addAttribute("message", "in progress");
        return "home";
    }
}