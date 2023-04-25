
import java.util.Random;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author personal
 */
public class ejercicioguia5practico2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Random numale = new Random();
        System.out.println("Ingrese el tamaño del vector: ");
        int n = leer.nextInt();
        int[] vector = new int[n]; 
        for (int i = 0; i <n; i++) {
        vector[i] = numale.nextInt(9);
        System.out.print("[" + vector[i] + "]"); 
    }
     System.out.println("Ingrese el numero a buscar en el vector: ");
        int numb = leer.nextInt();
        int contadorv= 0;
        int contador= 0;
         for (int i = 0; i < n; i++) {
            contador++;
            if (vector[i] == numb) {
               contadorv=contador ;
            }
        }  
         if (contador== 0) {
            System.out.println("El numero no pertenece al vector");
        }else{  
            System.out.println("El numero pertenece al vector ");
        }
    if (contador>1 ) {
            System.out.println("El numero se repite ");
        }else{  
            System.out.println("El numero no se repite");
    
    }
 }
}