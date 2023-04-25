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
public class Empleado {
 private String nombre;
 private int edad;
 private int salario;

    public Empleado() {
    }

    public Empleado(String nombre, int edad, int salario) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public int getSalario() {
        return salario;
    }
 public void calcular_aumento(){
 Scanner leer = new Scanner(System.in);
 System.out.println("Ingrese nombre del empleado: ");
 this.nombre=leer.nextLine();
 System.out.println("Ingrese edad");
 this.edad=leer.nextInt();
 System.out.println("Ingrese salario");
 this.salario=leer.nextInt();
 
 if (this.edad >= 30) {
 System.out.println("El salario para el empleado " + this.nombre + " es: " + (this.salario*1.1));
 }else{
System.out.println("El salario para el empleado " + this.nombre + " es: " + (this.salario*1.05));
 }
     
 }
 }
    

