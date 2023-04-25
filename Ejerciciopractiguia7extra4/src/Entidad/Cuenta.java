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
public class Cuenta {
    private double saldo;
    private String titular;
    private int saldoactual;
    private int retiro;
    public Cuenta() {
     this.saldoactual=150000;
    }

    public Cuenta(double saldo, String titular) {
        this.saldo = saldo;
        this.titular = titular;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getTitular() {
        return titular;
    }
    public void retirar_dinero(){
    if (this.retiro > this.saldoactual) {
     System.out.println("El monto excede el saldo disponible. ");
     } else {
           System.out.println("usted retiro " +this.retiro + " de su cuenta, su saldo es de " + (this.saldoactual-this.retiro) + ".");
           }
     }
    
    public void datos(){
        Scanner scanner = new Scanner(System.in).useDelimiter("\n");
        System.out.print("Ingrese el nombre del titular de la cuenta: ");
        this.titular= scanner.nextLine();
        System.out.println("ingrese el monto a retirar: ");
        this.retiro= scanner.nextInt();
      }
   }

  
