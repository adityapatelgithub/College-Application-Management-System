/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package college.application.system;

import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Brijenkumar
 */
public class JavaConnect {
/*Purpose of this class is to connect the project to SQL file*/    
//NOTE: If you cloned this repository from GitHub, you need to change the location of SQL below
    Connection Conn;
    
    public static Connection ConnecrDb(){
        try{
            Class.forName("org.sqlite.JDBC");
            //the SQL was located at the below location (after jdbc:sqlite)
            Connection conn = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\Brijenkumar\\Documents\\NetBeansProjects\\College Application System\\college_application.sqlite");
            return conn;
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }
}
