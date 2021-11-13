package com.mycompany.mensajes_app;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {
    
    public Connection get_Conection (){ //Metodo que sirve  para verificar si la conexion es aprobsada
        Connection con = null;
        try{
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/usuario","root","1q2w3e4r5t6y7u8i9ol");
            
        }catch(Exception e){
            System.out.println(e);
        }
        return con;
    }
}
