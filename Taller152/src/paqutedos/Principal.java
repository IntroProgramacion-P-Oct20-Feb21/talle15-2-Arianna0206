/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paqutedos;

import java.util.ArrayList;
import java.util.Scanner;


/**
 *
 * @author reroes
 */
public class Principal {
    public static void main(String args[]) {
        
        ArrayList<String> ListaEquipos = new ArrayList<>();
        Scanner entrada = new Scanner(System.in);
        String nombres;
        double presupuestoAnual;
        String estadio;
        String cadena = "";
        int dato;
        boolean bandera = true;
    
    
        while (bandera) { 
            
            System.out.println("Ingrese el nombre del equipo");
                nombres = entrada.nextLine();
            System.out.println("Ingrese el presupuesto anual");
                presupuestoAnual = entrada.nextDouble();
            System.out.println("Ingrese el nombre del estadio");
                entrada.nextLine();
                estadio = entrada.nextLine();
            System.out.printf("%s\n", "Ingrese el número 2"
                    + " para terminar el proceso: ");
            dato = entrada.nextInt();
            if (dato == 2) {
                bandera = false;
    
            
}
            entrada.nextLine();
            cadena = String.format("%s%s , presupuesto %.1f; estadio %s\n ",
                cadena, nombres, presupuestoAnual, estadio);
    
}
        for(int i = 0; i < ListaEquipos.size(); i++){
            System.out.printf("%s\n", ListaEquipos.get(i));
        }
         EscribirArchivo.agregarRegistros(cadena);
    }
}
    

