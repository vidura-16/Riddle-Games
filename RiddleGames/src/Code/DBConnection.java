   /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Code;


import java.sql.*;

/**
 *
 * @author vidur
 */
public class DBConnection {
//encapculation
    
    
    static final String url = "jdbc:mysql://localhost/riddlegames";
    static final String User = "root";
    static final String Pass ="";
   
    
    public static Connection connectDB(){
        Connection conn = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(url,User,Pass);
            return conn;
        } catch (Exception e) {
            System.err.println("DB connetion error");
            return null;
        }
            
    }
}
  

    
    
  
