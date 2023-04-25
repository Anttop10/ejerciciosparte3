
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
public class ejercicioguia4practico1 {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el primer numero: ");
        int num1=sc.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        int num2=sc.nextInt();
        System.out.println("Seleccione la operación a realizar: ");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        System.out.print("Opción: ");    
        int opcion = sc.nextInt();
        double resultado = 0;
        switch(opcion){
         
                    case 1:
                       resultado=sumar(num1,num2);
                        break;
                    case 2:
                        resultado=restar(num1,num2);
                        break;
                    case 3:
                       resultado=multiplicar(num1,num2);
                        break;
                    case 4:
                        resultado=dividir(num1,num2);
                        break;
                    default:
                    System.out.println("Opcion invalida.");
                    break;
        }  
        System.out.println("El resultado es: " + resultado);
        
        }
     public static double sumar(double num1,double num2){
       return num1 + num2;  
     }
     public static double restar(double num1,double num2){
       return num1 - num2;  
     }
     public static double dividir(double num1,double num2){
       return num1 / num2;  
     }
     public static double multiplicar(double num1,double num2){
       return num1 * num2;  
     }
}
