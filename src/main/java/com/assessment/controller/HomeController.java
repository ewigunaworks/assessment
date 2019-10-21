/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.assessment.controller;

import com.assessment.service.TwitterTimelineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author erwin.wiguna
 */
@Controller
public class HomeController {
    @Autowired
    private TwitterTimelineService twitterTimelineService;
    
    @Value("${fixed.rate.timer}")
    private String timer;
    
    @RequestMapping(path = "/", method = RequestMethod.GET)
    public String openHomePage(Model model){
        model.addAttribute("timer", timer);
        model.addAttribute("timelines", twitterTimelineService.getHomeTimeline());
        return "index";
    }
}
