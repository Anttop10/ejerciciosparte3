
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author personal
 */
public class ejercicio5practico4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random numale = new Random(); // pedimos la utilidad Random para generar numeros aleatorios (hay que importarla)
        int [][] vector= new int [4][4]; //creamos la matriz de 4x4
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                vector [i][j]= numale.nextInt(9);
                System.out.print("["+vector [i][j]+"]"); //hacemos un for doble para recorrer la matriz e imprimirla en pantalla.
            }
            System.out.println("");
            
        }
        System.out.println("");
        for (int j = 0; j < 4; j++) {
            for (int i = 0; i < 4; i++) {
                System.out.print("["+vector [i][j]+"]"); //invertimos el for para mostrar la matriz de manera traspuesta. 
            }
            System.out.println("");
            
        }
        
    }
    
}
