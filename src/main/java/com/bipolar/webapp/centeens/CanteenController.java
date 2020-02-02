package com.bipolar.webapp.centeens;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CanteenController {

    @RequestMapping("canteens")
    public String getCanteensPage() {
        return "canteens";
    }
}
