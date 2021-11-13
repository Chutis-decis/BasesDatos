package com.mycompany.mensajes_app;

import java.sql.Connection;
import java.util.Scanner;

public class UIMenu {
    
    Conexion conexion = new Conexion();
    
    Scanner sc = new Scanner (System.in);
    
    public void opciones(){  
        int opcion=0;
        do {
            System.out.println("*************************************************************");
            System.out.println("    Aplicacion de mensajes");
            System.out.println("1.Crear Usuario ");
            System.out.println("2.Listar Usuarios");
            System.out.println("3.Editar Usuarios");
            System.out.println("4.Eliminar Usuarios");
            System.out.println("5.Salir");
            opcion = sc.nextInt();
            
            switch(opcion){
                case 1:
                    mensajeService.crearUsuario();
                    break;
                case 2: 
                    mensajeService.listarMensajes();
                    break;
                case 3: 
                    mensajeService.editarMensajes();
                    break;
                case 4:
                    mensajeService.borrarMensajes();
                    break;
                default:
                    break;
            }
        }while(opcion != 5);
    
    }
    public static void Menu(){
        
    }
}
