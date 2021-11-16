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
                    restauranteService.crearUsuario();
                    break;
                case 2: 
                    restauranteService.listarUsuario();
                    break;
                case 3: 
                    restauranteService.editarUsuario();
                    break;
                case 4:
                    restauranteService.borrarUsuario();
                    break;
                default:
                    break;
            }
        }while(opcion != 5);
    
    }
    
}
