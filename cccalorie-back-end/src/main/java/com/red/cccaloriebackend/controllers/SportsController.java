package com.red.cccaloriebackend.controllers;

import com.red.cccaloriebackend.beans.SportsBean;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@CrossOrigin
@RestController
@RequestMapping("/api")
public class SportsController {
    @GetMapping("/all_sports")
    public SportsBean[] getAllSportsInfo(){
        return new SportsBean[4];
    }
}
