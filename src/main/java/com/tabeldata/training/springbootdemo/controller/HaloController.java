/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tabeldata.training.springbootdemo.controller;

import com.tabeldata.training.springbootdemo.SpringbootDemoApplication;
import com.tabeldata.training.springbootdemo.bean.DataBean;
import org.springframework.beans.BeansException;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author dimasm93
 */
@RestController
public class HaloController implements ApplicationContextAware{

    private ApplicationContext context;
    
    @GetMapping("/halo")
    public DataBean halo(){
        DataBean bean = this.context.getBean(DataBean.class);
        System.out.println(bean.toString());
        return bean;             
    }

    @Override
    public void setApplicationContext(ApplicationContext ac) throws BeansException {
        this.context = ac;
    }
    
}
