/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tabeldata.training.springbootdemo.api;

import com.tabeldata.training.springbootdemo.dto.RequestHalo;
import com.tabeldata.training.springbootdemo.dto.ResponseHalo;
import org.springframework.http.ResponseEntity;
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
@RequestMapping("/api/halo")
public class HaloController {
    
    @GetMapping(
            path = "/findByName")
    public ResponseEntity<ResponseHalo> halo(
            @RequestParam(name = "nama", required = false) 
                    String param){
       if(param.trim().isEmpty()){
           return ResponseEntity.noContent().build();
       }
       
       return ResponseEntity.ok(new ResponseHalo(param, null));
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
