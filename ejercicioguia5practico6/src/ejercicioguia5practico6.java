
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
public class ejercicioguia5practico6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner leer = new Scanner(System.in);
     int[][] matriz = new int[3][3];
     int num;
     boolean bandera = true;
     int base = 0;
     int suma=0;
    
    for (int i = 0;i < 3; i++) {
    for (int j = 0;j < 3; j++) {
 
                    System.out.println("Ingrese los valores para completar el cuadrado [" + i + "][" + j + "]...(Debe ser entre 1 y 9)");
                    num = leer.nextInt();
                    if (num > 9 || num < 1) {
                        System.out.println("Debe ingresar un valor entre 0 y 9...");

                    } else {
                        System.out.println("Valor correcto ingresado (" + num + ")");
                        matriz[i][j] = num;
                        if(i==0){ 
                        base += num;     
                        
              }
                    }
                    
    }
    }
   
    for (int i = 0; i < 3; i++) {
    suma=0;
    for (int j = 0;j < 3; j++){
    suma += matriz[i][j]; 
       }
        System.out.println(suma);
        if (suma!=base) {
        bandera=false;    
        }
    }
    for (int i = 0; i < 3; i++) {
    suma=0;
    for (int j = 0;j < 3; j++){
    suma+=matriz[j][i];    
    }
    System.out.println(suma);
    if (suma!=base){
     bandera=false;   
    } 
     }
    suma=0;
    for (int i = 0; i < 3; i++) {
    suma+=matriz[i][i];      
   }
    System.out.println(suma);
    if (suma!=base){
     bandera=false;   
    }
    
    if(bandera==false){
     System.out.println("el cuadrado no es magico");
    }else{ 
    System.out.println("el cuadrado es magico");
    }
    }
}



    
    
    

  


    
    

    
                    
        
        
    
         
        
    

    


