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
public class Juego {
 private int jugador1;
 private int jugador2;

    public Juego() {
    }

    public Juego(int jugador1, int jugador2) {
        this.jugador1 = jugador1;
        this.jugador2 = jugador2;
    }

    public void setJugador1(int jugador1) {
        this.jugador1 = jugador1;
    }

    public void setJugador2(int jugador2) {
        this.jugador2 = jugador2;
    }

    public int getJugador1() {
        return jugador1;
    }

    public int getJugador2() {
        return jugador2;
    }
 public void iniciar_juego(){
 int contador=10;
 boolean adivino=false;
 Scanner leer = new Scanner(System.in);
System.out.println("Para comenzar el juego se necesitan dos jugadores, jugador1 elige un numero y jugador2 intenta adivinarlo");
System.out.println("jugador1 elija un numero");
this.jugador1=leer.nextInt();
 System.out.println("jugador2 cuenta con 10 intentos para acertar");
 do {
            this.jugador2=leer.nextInt();
        if (this.jugador1==this.jugador2) {
            System.out.println("Adivinaste el numero");
            contador=0;
            adivino=true;
        }else{
            if (this.jugador1>this.jugador2) {
             System.out.println("El numero es mas alto");
             contador--;
             System.out.println("Quedan solo "+contador+" intentos.");
            }
            if (this.jugador1<this.jugador2) {
                System.out.println("El numero es mas bajo");
                contador--;
                System.out.println("Quedan solo "+contador+" intentos.");
            }
        }    
        } while (contador!=0);
        if (adivino) {
            System.out.println("Gano el jugador2");
        }else{
            System.out.println("Gano el jugador1, jugador se quedo sin intentos");
        }
        
        
 
 
 }
    
}
