/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tabeldata.training.springbootdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author dimasm93
 */
@Controller
public class HaloViewController {
    
    @GetMapping("/halo")
    public ModelAndView halo(
            ModelAndView view,
            @RequestParam(name = "nama", required = false) String nama){
        view.setViewName("home");
        view.addObject("namaLengkap", nama);
        return view;
    }
    
}
