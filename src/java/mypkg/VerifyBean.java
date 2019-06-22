/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mypkg;

/**
 *
 * 
 */
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.mysql.jdbc.Connection;
/**
 *
 * @author Kunal Awasthi
 */
public class VerifyBean {
    public String userid,password;
    Connection con;
public String url,driver,cid,cpw;
    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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
   

   public String verify() throws ClassNotFoundException, SQLException
   {   String a;
    
   Class.forName(driver);
   con=(Connection)DriverManager.getConnection(url, cid, cpw);
    String qr= "select d_id from doctor where d_id=? and password=?";
    PreparedStatement ps=con.prepareStatement(qr);
                ps.setString(1,userid);
                ps.setString(2,password);
                ResultSet rs=ps.executeQuery();
                boolean b=rs.next();
                if(b)
                {
                     a="DoctorHome.jsp";
                }
                else
                {
                     a="invalid.jsp";
                }
          
return a;
                
   }
}
