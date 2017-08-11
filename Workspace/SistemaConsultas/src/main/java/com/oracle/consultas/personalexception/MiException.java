/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oracle.consultas.personalexception;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Oracle
 */
public class MiException extends Exception{

    private int code;
    private String description;
    private Date date;
    
    public MiException() {
    }
    
    public MiException(int code, String description, Date date, String mensaje){
        super(mensaje);
        this.code = code;
        this.description = description;
        this.date = date;           
    }

    public MiException(String string) {
        super(string);
    }

    public MiException(String string, Throwable thrwbl) {
        super(string, thrwbl);
    }

    public MiException(Throwable thrwbl) {
        super(thrwbl);
    }

    public MiException(String string, Throwable thrwbl, boolean bln, boolean bln1) {
        super(string, thrwbl, bln, bln1);
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDate() {
        DateFormat fecha = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return fecha.format(date);
    }

    public void setDate(Date date) {
        this.date = date;
    }
    
    
    
}
