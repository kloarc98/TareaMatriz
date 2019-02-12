/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareamatriz;
import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author alumno
 */
public class TAREAMATRIZ {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
        //variables ramdom
        Random Naleatorio= new Random();
        int aleatorioS=1000+ Naleatorio.nextInt(2000);
        //inicializacion de matriz
         final int FILAS = 10, COLUMNAS = 6;
        Scanner sc = new Scanner(System.in);
        
        int i, j;
        String [][] A = new String[FILAS][COLUMNAS];
        
        
        System.out.println("Lectura de elementos de la matriz: ");
        //matriz de ingrreso
        for (i = 0; i < FILAS; i++) {
            System.out.print("Nombre =");
            A[i][0]=sc.next();
            for (j = 0; j < COLUMNAS; j++) {
                
            }
        }
        //matriz de vista de valores
        
        System.out.println("valores introducidos:");
        for (i = 0; i < A.length; i++) { 
            System.out.print(A[i][0] + " ");
            for (j = 0; j < A[i].length; j++) {
                System.out.print(aleatorioS+" ");
                
            }
            System.out.println();
        }
        
    }
    }
    

