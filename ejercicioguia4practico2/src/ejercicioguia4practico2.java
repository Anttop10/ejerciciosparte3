
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
public class ejercicioguia4practico2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
    int edad;
    String respuesta;
    int contador = 1; 
    String nombre;
    
          
            
            
   do
   { 
    System.out.println("Ingrese el nombre: "+ contador ); 
    nombre = sc.next();
    System.out.println("Ingrese la edad: "+ contador );
    edad = sc.nextInt();
    System.out.println("Desea continuar? s/n"); 
   respuesta =sc.next();
   contador++;
   Mostrardatos(nombre,edad);
  }   
   while (respuesta.equalsIgnoreCase("S"));
}
  
public static void Mostrardatos(String nombre, int edad){
System.out.println ( nombre +  " " +  edad);
if(edad < 18){
 System.out.println("Es menor de edad ");
}else{ System.out.println("Es mayor de edad ");

}
}
}

