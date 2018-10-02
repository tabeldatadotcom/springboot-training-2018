/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tabeldata.training.springbootdemo.controller;

import com.tabeldata.training.springbootdemo.dto.RequestHalo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author dimasm93
 */
@RestController
@RequestMapping("/halo")
public class HaloController {
    
    @GetMapping(
            path = "/findByName")
    public String halo(
            @RequestParam(name = "nama", required = false) 
                    String param){
        String format = String.format("{ \"message\": \"halo ini dari spring\", \"nama\" : \"%s\" }",
                param);
        return format;
    }
    
    @PostMapping(
            path = "/findByName")
    public String haloPost(
            @RequestParam String nama, 
            @RequestBody RequestHalo request){
        String format = String.format("{ \"message\": \"halo ini dari spring\", \"nama\" : \"%s\" }", 
                request.getNama());
        return format;
    }
    
}
