/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import database.KoneksiDB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import view.PenjualanRumah;

/**
 *
 * @author andi
 */
public class DataRumah {
    private int hrgTanah,hargaBangunan,luasTanah;
    private String areaRmh;
    
    public int getHrgTanah() {
        return hrgTanah;
    }

    public void setHrgTanah(int hrgTanah) {
        this.hrgTanah = hrgTanah;
    }

    public int getHargaBangunan() {
        return hargaBangunan;
    }

    public void setHargaBangunan(int hargaBangunan) {
        this.hargaBangunan = hargaBangunan;
    }

    public int getLuasTanah() {
        return luasTanah;
    }

    public void setLuasTanah(int luasTanah) {
        this.luasTanah = luasTanah;
    }

    public String getAreaRmh() {
        return areaRmh;
    }

    public void setAreaRmh(String areaRmh) {
        this.areaRmh = areaRmh;
    }
    
   
    
    
}
