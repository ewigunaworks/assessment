/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.assessment.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author erwin.wiguna
 */
@Controller
public class HomeController {
    @RequestMapping(path = "/", method = RequestMethod.GET)
    public String openHomePage(){
        return "index";
    }
}