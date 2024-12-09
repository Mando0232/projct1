/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projctmad;

import java.sql.*;
import oracle.jdbc.OracleDriver;

/**
 *
 * @author mica
 */
public class connection {
    public static Connection con() throws SQLException{
        DriverManager.registerDriver(new OracleDriver());
        Connection c = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "hr", "hr");
        return c;
        
        
        
        
    }
}
