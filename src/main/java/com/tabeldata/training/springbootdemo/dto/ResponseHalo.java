/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tabeldata.training.springbootdemo.dto;

import java.util.UUID;
import lombok.Data;

/**
 *
 * @author dimasm93
 */
@Data
//@NoArgsConstructor
public class ResponseHalo {
    
    public ResponseHalo(String nama, String alamat){
        this.id = UUID.randomUUID().toString();
        this.nama = nama;
        this.alamat = alamat;
    }
    
    private String id;
    private String nama;
    private String alamat;
    
}
