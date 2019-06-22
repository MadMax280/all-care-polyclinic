/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mypkg;

import com.mysql.jdbc.Connection;
import java.sql.*;

/**
 *
 * 
 */
public class EnquiryStore {
    Connection con;
  private String url,driver,cid,cpw;
  private String name,address,emailid,mobile,problem;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmailid() {
        return emailid;
    }

    public void setEmailid(String emailid) {
        this.emailid = emailid;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getProblem() {
        return problem;
    }

    public void setProblem(String problem) {
        this.problem = problem;
    }
  

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
    
   
   //to fetch current date.
    
            java.util.Date date=new java.util.Date();
            
            java.sql.Date Date=new java.sql.Date(date.getTime());
   
    String qr= "insert into enquiry values(?,?,?,?,?,?)";
    PreparedStatement ps=con.prepareStatement(qr);
    ps.setString(1,name);
    ps.setString(2,address);
    ps.setString(3,mobile);
    ps.setString(4,emailid);
    ps.setString(5,problem);
    ps.setDate(6, Date);
    
    
    
    n=ps.executeUpdate();
    
    
    
    return n;
}
    
    
    
    
    
}
