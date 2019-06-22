/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mypkg;

import com.mysql.jdbc.Connection;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.sql.*;
/**
 *
 *
 */
public class DoctorStore {
    
 private Connection con;
private String url,driver,cid,cpw,id;

//storebean m se id increment ka code
//imageentry s image

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid;
    }

    public String getCpw() {
        return cpw;
    }

    public void setCpw(String cpw) {
        this.cpw = cpw;
    }
    
    public int store() throws ClassNotFoundException, SQLException
    {
        int n=0;
        Class.forName(driver);
   con=(Connection)DriverManager.getConnection(url, cid, cpw);
     Statement stmt=con.createStatement();
   
     //storebean m se id increment ka code
     
     ResultSet rs=stmt.executeQuery("select d_id from doctor");
        rs.afterLast();
        
                    
        if(!rs.previous())
        {
            id="D01";
        }
        else
        {            
            id=rs.getString(1);
            String s[]= id.split("(?<=\\D)(?=\\d)");
            id=s[0];
            int i=Integer.parseInt(s[1])+1;
            id=id+(i < 10 ? "0" : "")+i;
        }
        
       //imageentry s image
       
       

     
     
     
     
     
     return n;
    }
}
