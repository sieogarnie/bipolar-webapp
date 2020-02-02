package com.bipolar.webapp.foodtrucks;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FoodTruckController {

    @RequestMapping("/foodtrucks")
    public String getFoodTrucksPage() {
        return "food trucks";
    }
}
