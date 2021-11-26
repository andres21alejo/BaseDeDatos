/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaDB;

/**
 *
 * @author User
 */
import java.util.Scanner;
public class Principal {

    /**
     * @param args the command line arguments
     */
    static Scanner sc = new Scanner(System.in);
    static int Variable_eleccion;
    public static void main(String[] args) throws Exception {
        Menu();
    }
    
     public static void Menu () throws Exception {
        System.out.println("Seleccione como quiere ingresar: \nAlumno (1)\nProfesor (2)");
        Variable_eleccion = sc.nextInt();
        if (Variable_eleccion == 1){
            Alumno.menu();
        } else if (Variable_eleccion == 2){
            Profesor.menu();
        }
}
}
