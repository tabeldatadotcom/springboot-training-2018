/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tabeldata.training.springbootdemo.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 *
 * @author dimasm93
 */
@Component
public class DataBean {

    public DataBean() {
    }

    @Autowired
    public DataBean(OtherBean bean) {
        this.bean = bean;
    }
    
    @Value("asfsafdaf")
    private String id;
    @Value("234324234")
    private String nama;
    private OtherBean bean;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public OtherBean getBean() {
        return bean;
    }

    public void setBean(OtherBean bean) {
        this.bean = bean;
    }
    
    

    @Override
    public String toString() {
        return String.format("{%s, %s, otherBean: { %s, %s }, %s}", 
                this.id, 
                this.nama, 
                this.bean.getId(), 
                this.bean.getNama(),
                this.bean.toString()); //To change body of generated methods, choose Tools | Templates.
    }
    
}
