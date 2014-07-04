/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package config;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Rous
 */
public class Conexion {
    public static String url="jdbc:mysql://localhost/LP_biblioteca";
    public static   String usuario="root";
    public static   String clave="root";
    public static Connection conex =null;
    
   public static Connection getConnection(){
       try {
            if(conex==null){
            Class.forName("com.mysql.jdbc.Driver");
            conex= DriverManager.getConnection(url,usuario,clave);
                }
       } catch (Exception e) {
       }
                    return conex;
            }
}
