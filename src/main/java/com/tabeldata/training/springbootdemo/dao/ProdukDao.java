/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tabeldata.training.springbootdemo.dao;

import com.tabeldata.training.springbootdemo.entity.Produk;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

/**
 *
 * @author dimasm93
 */
@Repository
public class ProdukDao {
    
    @Autowired
    private JdbcTemplate jdbcTemplate;
    
    public Produk findById(String id) throws EmptyResultDataAccessException{
        String query = "select id as kode_unique, kode, nama, harga, qty from produk where id = ?";
        Produk produk = jdbcTemplate.queryForObject(query, new RowMapper<Produk>(){
            @Override
            public Produk mapRow(ResultSet rs, int i) throws SQLException {
                return new Produk(
                        rs.getString("kode_unique"),
                        rs.getString("kode"), 
                        rs.getString("nama"),
                        rs.getBigDecimal("harga"), 
                        rs.getInt("qty"));
            }
            
        }, id);
        return produk;
    }
   
    public List<Produk> findAll(){
        String query = "select id as kode_unique, kode, nama, harga, qty from produk";
        List<Produk> list = jdbcTemplate.query(query, new RowMapper<Produk>(){
            @Override
            public Produk mapRow(ResultSet rs, int i) throws SQLException {
                return new Produk(
                        rs.getString("kode_unique"),
                        rs.getString("kode"), 
                        rs.getString("nama"),
                        rs.getBigDecimal("harga"), 
                        rs.getInt("qty"));
            }
        });
        return list;
    }
    
}
