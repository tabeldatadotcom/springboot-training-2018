/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tabeldata.training.springbootdemo.controller;

import com.tabeldata.training.springbootdemo.bean.DataBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author dimasm93
 */
@RestController
public class HaloController {

    @Autowired
    private DataBean data;
    
    @GetMapping("/halo")
    public DataBean halo(){
        return data;             
    }
    
}
