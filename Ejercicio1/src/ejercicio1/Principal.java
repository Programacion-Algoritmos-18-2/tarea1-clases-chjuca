/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

import java.util.Scanner;

/**
 *
 * @author Carlos Juca
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Inicializacion de Vaiables
        String nombre;
        String paralelo;
        int edad;
        Estudiante[] lista_est = new Estudiante[2];
        // Intanciar el Scanner
        Scanner entrada = new Scanner(System.in);
        // Pedir que el Usuario Ingrese Datos
        for (int i = 0; i < lista_est.length; i++) {
            Estudiante e = new Estudiante();
            System.out.printf("Ingrese Datos del ESTUDIANTE #%d\n",i+1);
            System.out.printf("__________________________________\n");
            System.out.println("Ingrese el Nombre del Estudiante :");
            nombre = entrada.nextLine();
            System.out.println("Ingrese el paralelo del Estudiante");
            paralelo = entrada.nextLine();
            System.out.println("Ingrese la Edad del Estudiante");
            edad = entrada.nextInt();
        //Eviar las Variables al Obejto
            e.nombres = nombre;
            e.paralelo = paralelo;
            e.edad = edad;
            lista_est[i] = e;
            entrada.nextLine();
        }
        // Presesntar los Datos Guardados
        System.out.println("DATOS DEL ESTUDIANTE");
        System.out.printf("%s\t\t%s\t%s\n", "Nombre", "Paralelo", "Edad");
        for (int i = 0; i < lista_est.length; i++) {
            System.out.printf("%s\t\t%s\t\t%d\n", lista_est[i].nombres, lista_est[i].paralelo, lista_est[i].edad);
        }
    }
}
