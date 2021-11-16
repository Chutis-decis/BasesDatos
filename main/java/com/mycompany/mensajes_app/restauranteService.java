package com.mycompany.mensajes_app;

import java.util.Scanner;

public class restauranteService {
    public static void crearUsuario(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe tu nombre");
        String nombre = sc.nextLine();
        System.out.println("Escribe tu telefono ");
        int telefono = sc.nextInt();
        
        System.out.println("");
        
        Usuario mensajes = new Usuario();
        
        
        mensajes.setNombre(nombre);
        mensajes.setTelefono(telefono);
        
        RestauranteDAO.crearUsuarioDB(mensajes);
    }
    public static void listarUsuario(){
        RestauranteDAO.leerMensajesDB();
    }
    public static void borrarUsuario(){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Indica el id a borrar");
        int  id = sc.nextInt();
        
        RestauranteDAO.borrarMensajeDB(id);
    }
    public static void editarUsuario(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe tu nuevo mensaje");
        String user = sc.nextLine();
        
        System.out.println("Indica el ID del mensaje a ediar");
        int id = sc.nextInt();
        
        Usuario actualizacion = new Usuario();
        actualizacion.setId(id);
        actualizacion.setNombre(user);
        
        RestauranteDAO.actualizarMensajeDB(actualizacion);
    }
}
