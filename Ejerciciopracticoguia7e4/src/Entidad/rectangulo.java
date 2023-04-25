/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.util.Scanner;

/**
 *
 * @author personal
 */
public class rectangulo {
    private double base;
    private double altura;

    public rectangulo() {
    }

    public rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    public void crearrectangulo(){
    Scanner leer = new Scanner(System.in);
    System.out.println("Ingrese el tamaño de la base: ");
    this.base=leer.nextDouble();
    System.out.println("Ingrese la altura: ");
    this.altura=leer.nextDouble();
    }
     public void calcularsuperficie() {
     System.out.println("La superficie del rectangulo es: " + (this.base*this.altura )  );   
     } 
     public void calcularperimetro(){
     System.out.println("El perimetro del rectangulo es: " + ((this.base+this.altura)*2) );   
    }
   public void dibujarrectangulo(){
       for (int i = 0; i <this.altura; i++) {
       System.out.println("");
       for (int j = 0; j <this.base; j++) {
       System.out.print("*");    
               
           }
       }
   System.out.println(); 
   }  
  }
