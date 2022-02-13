package com.red.cccaloriebackend.controllers;

import com.red.cccaloriebackend.beans.FoodBean;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
@RequestMapping("/api")
public class FoodController {
    @GetMapping("/all_food")
    public FoodBean[] getAllFoodInfo() {
//        return new String[]{
//                "11", "11", "11", "11"
//        };
        return new FoodBean[4];
    }
}
