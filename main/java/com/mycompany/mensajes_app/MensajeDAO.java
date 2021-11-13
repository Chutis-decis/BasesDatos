package com.mycompany.mensajes_app;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MensajeDAO {
    
    
    public static void crearMensajeDB(Mensajes mensajes){
        Conexion db_conect = new Conexion();
        
        try (Connection conexion=db_conect.get_Conection()){
            //Este metodo nos dice que ya encontro la conexion en el metodo getConection()
            
            PreparedStatement p = null;
            try{
                String query="INSERT INTO persona(nombre,telefono) VALUES (?,?)";
                p=conexion.prepareStatement(query);
                p.setString(1, mensajes.getNombre()); // el 1 parametro va hacer el nombre
                p.setInt(2, mensajes.getTelefono());// el 2 parametro serra el telefono 
                p.executeUpdate(); //ejecutar actualizaciones
                System.out.println("Usuaro creado ");
            }catch(Exception e){
                System.out.println(e);
            }
            
        }catch(SQLException e){
            System.out.println(e);
        }
    }
    public static void leerMensajesDB(){
      Conexion db_connect = new Conexion();
      PreparedStatement p =null;
      ResultSet rs = null;
      
      try(Connection conexion = db_connect.get_Conection()){
          String query ="SELECT * FROM persona";
          p=conexion.prepareStatement(query);//querry = coonsulta
          rs=p.executeQuery();/*Ejecuta la consulta pero es muy difierente  al sql date dado a 
          que no tiene transaccion, debido a que no estamos insertando, editanndo la base de datos*/
          
          while(rs.next()){ //Miientras el objeto re tenga datos
              System.out.println("ID: " +rs.getInt("id"));
              System.out.println("Usuario: " + rs.getString("nombre"));
              System.out.println("Telefono: " +rs.getInt("telefono"));
          }
          
      }catch(SQLException e){
          System.out.println("No se pudieron recuperar los mnsajes");
            System.out.println(e);
        }
    }
    public static void borrarMensajeDB(int id_mensaje){
        Conexion db_conect = new Conexion();
        
        try(Connection conexion = db_conect.get_Conection()){
           PreparedStatement p = null; 
           
           try{
               String query ="DELETE FROM persona WHERE id=? ";
               p=conexion.prepareStatement(query);
               p.setInt(1, id_mensaje);
               p.executeUpdate();
               System.out.println("El mensaje fue borrado");
           }catch(SQLException e){
               System.out.println(e);
               System.out.println("No se pudo eliminar al usuario");
           }
        }catch(SQLException e){
            System.out.println(e);
        }
    }
    public static void actualizarMensajeDB(Mensajes mensajes){
        Conexion db_conect = new Conexion();
        
        try(Connection conexion = db_conect.get_Conection()){
            PreparedStatement p = null;
            
            try{
               String query = "UPDATE persona SET nombre = ? WHERE id = ?";
               p=conexion.prepareStatement(query);
               p.setString(1, mensajes.getNombre());
               p.setInt(2, mensajes.getId());
               p.executeUpdate();
               
                System.out.println("El mensaje se actualizo correctanente");
            }catch(SQLException ex){
                    System.out.println("Noo se pudo actualizar el mensaje" +ex);
            }
        }catch(SQLException e){
            System.out.println(e);
        }
    }
}
