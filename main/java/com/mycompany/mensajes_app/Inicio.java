package com.mycompany.mensajes_app;

import java.sql.Connection;

public class Inicio {
    public static void main(String[] args) {
        Conexion cone = new Conexion();
        
        try(Connection cnx = cone.getConection()){
            
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
