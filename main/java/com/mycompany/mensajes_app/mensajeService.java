package com.mycompany.mensajes_app;

import java.util.Scanner;

public class mensajeService {
    public static void crearUsuario(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe tu nombre");
        String nombre = sc.nextLine();
        System.out.println("Escribe tu telefono ");
        int telefono = sc.nextInt();
        
        System.out.println("");
        
        Mensajes mensajes = new Mensajes();
        
        mensajes.setNombre(nombre);
        mensajes.setTelefono(telefono);
        
        MensajeDAO.crearMensajeDB(mensajes);
    }
    public static void listarMensajes(){
        MensajeDAO.leerMensajesDB();
    }
    public static void borrarMensajes(){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Indica el id a borrar");
        int  id = sc.nextInt();
        
        MensajeDAO.borrarMensajeDB(id);
    }
    public static void editarMensajes(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe tu nuevo mensaje");
        String user = sc.nextLine();
        
        System.out.println("Indica el ID del mensaje a ediar");
        int id = sc.nextInt();
        
        Mensajes actualizacion = new Mensajes();
        actualizacion.setId(id);
        actualizacion.setNombre(user);
        
        MensajeDAO.actualizarMensajeDB(actualizacion);
    }
}
