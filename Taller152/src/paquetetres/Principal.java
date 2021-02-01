/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquetetres;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Principal {
    
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        String[] libros = {"El camino a un mejor programador", 
            "Scrum & eXtreme Programming", 
            "Lógica de programación", 
            "Metodología programación orientada a objetos", 
            "Java Como Programar", 
            "Python 3 al descubierto"};
        
        String[] autores = {"Anónimo", 
            "Eugenia Bahit", 
            "Omar Iván Trejos Buriticá", 
            "López Román Leobardo", 
            "Dietel, P. y Dietel, H", 
            "Fernández Arturo"};
        
        int[] clave1 = {2, 1, 0, 2, 0, 1};
        
        int[] clave2 = {1, 1, 1, 2, 2, 0};
        
        int[][] identificativoLibro = {
            {8761, 12334, 34567},
            {65431, 43211, 7890},
            {123890, 12344, 2345}
        };
        
        int opcion;
        String cadena = "";
        
        System.out.printf("Libros a prestar:\n");
        for ( int i = 0; i < libros.length; i++){
            System.out.printf("%s opción %s\n",libros[i], i);   
        }
        opcion = entrada.nextInt();
        
        if(opcion == 0){ 
            
                cadena = String.format("%sSe le presta el libro %s cuyo autor "
                        + "es %s y tiene un identificativo de %d\n",
                        cadena,
                        libros[0],
                        autores[0],
                        identificativoLibro[clave1[0]][clave2[0]]);
                }else{
            if(opcion == 1){
                cadena = String.format("%sSe le presta el libro %s cuyo autor "
                        + "es %s y tiene un identificativo de %d\n",
                        cadena,
                        libros[1],
                        autores[1],
                        identificativoLibro[clave1[1]][clave2[1]]);
            }else{
                if(opcion == 2){
                    cadena = String.format("%sSe le presta el libro %s cuyo "
                            + "autor es %s y tiene un identificativo de %d\n",
                            cadena,
                            libros[2],
                            autores[2],
                            identificativoLibro[clave1[2]][clave2[2]]);
                }else{
                    if(opcion == 3){ 
                        cadena = String.format("%sSe le presta el libro %s "
                            + "cuyo autor es %s y tiene un identificativo de "
                            + "%d\n",
                                cadena,
                                libros[3],
                                autores[3],
                                identificativoLibro[clave1[3]][clave2[3]]);
                    }else{
                        if (opcion == 4){
                            cadena = String.format("%sSe le presta el libro %s "
                            + "cuyo autor es %s y tiene un identificativo de "
                            + "%d\n",
                                    cadena,
                                    libros[4],
                                    autores[4],
                                    identificativoLibro[clave1[4]][clave2[4]]);
                        }else{
                            if(opcion == 5){
                                cadena = String.format("%sSe le presta el "
                                        + "libro %s cuyo autor es %s y tiene un"
                                        + " identificativo de %d\n",
                                        cadena,
                                        libros[5],
                                        autores[5],
                                        identificativoLibro[clave1[5]]
                                                [clave2[5]]);
                            }else{
                                System.out.printf("Error, número ingresado "
                                        + "fuera del rango\n");
                            }
                        }
                    }
                }
            }
        }
        EscribirArchivo.agregarRegistros(cadena);
    }
}   
        
    

