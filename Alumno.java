/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaDB;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Alumno {
    public static int id;
    public static String nombre;
    static Scanner sc = new Scanner(System.in);
    public static int eleccion;
    
    public static void menu(){
        System.out.println("Selecccione que desea hacer\nRegistrar(1)\nModificar(2)\nEliminar(3)\nLstar(4)");
         eleccion = sc.nextInt();
        if (eleccion == 1){
            Registrar();
        } else if (eleccion == 2){
            Modificar();
        } else if (eleccion == 3){
            Eliminar();
        } else if (eleccion == 4){
            Listar();
        }
    }
    
    public static void Registrar(){
        System.out.println("Ingrese el nombre que desea registrar");
        nombre = sc.next();
        Alumno alumno = new Alumno();
        alumno.setNombre(nombre);
        try {
            interfadao dao = new DAOimpl();
            dao.registrar(alumno);
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
        
        System.out.println("¿Desea realizar otra acción?\nSí (1)\nNo(2)");
        eleccion = sc.nextInt();
        
        if (eleccion == 1){
            menu();
        }
            
    }
    public static void Modificar(){
        System.out.println("Ingrese el id que desea modificar");
        id = sc.nextInt();
        System.out.println("Ingrese el nombre por el que lo desea modificar");
        nombre = sc.next();
        Alumno alumno = new Alumno();
        alumno.setNombre(nombre);
        alumno.setId(id);
        try {
            interfadao dao = new DAOimpl();
              dao.modificar(alumno);
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
        
        System.out.println("¿Desea realizar otra acción?\nSí (1)\nNo(2)");
        eleccion = sc.nextInt();
        
        if (eleccion == 1){
            menu();
        }
    }
    public static void Eliminar(){
        System.out.println("Ingrese el id que desea eliminar");
        id = sc.nextInt();
        Alumno alumno = new Alumno();
        alumno.setNombre(nombre);
        alumno.setId(id);
        try {
            interfadao dao = new DAOimpl();
              dao.eliminar(alumno);
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
        
        System.out.println("¿Desea realizar otra acción?\nSí (1)\nNo(2)");
        eleccion = sc.nextInt();
        
        if (eleccion == 1){
            menu();
        }
    }
    public static void Listar(){
        Alumno alumno = new Alumno();
        alumno.setNombre(nombre);
        alumno.setId(id);
        try {
            interfadao dao = new DAOimpl();
                for(Alumno listado : dao.listar()){
                    System.out.println(listado.getNombre());
                }
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println("¿Desea realizar otra acción?\nSí (1)\nNo(2)");
        eleccion = sc.nextInt();
        
        if (eleccion == 1){
           menu();
        }
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
}
    

