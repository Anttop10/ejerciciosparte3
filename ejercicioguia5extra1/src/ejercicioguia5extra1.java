
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
public class ejercicioguia5extra1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner leer = new Scanner(System.in);
      System.out.println("Ingrese el tamaño del vector");
      int suma = 0; 
      int n = leer.nextInt();
      int[] vector = new int[n];
      System.out.println("Ingrese los valores");
      for (int i = 0; i < n ; i++) {
      vector[i] = leer.nextInt();    
      suma+=vector[i];
        }
        for (int i = 0; i < n; i++) {
            System.out.print(vector[i] + " / ");
        }
        System.out.println("");
        System.out.println("La suma del vector es: " + suma );
    }
    }
        
        
