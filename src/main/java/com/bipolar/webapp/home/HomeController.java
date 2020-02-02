package com.bipolar.webapp.home;

import com.bipolar.webapp.services.WebScrapingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @Autowired
    private WebScrapingService webScrapingService;

    @RequestMapping(value = {"/", "/home"})
    public String getHome() {
        return "home page";
    }
}
