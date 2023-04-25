/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooej01;

import Entidad.Persona;


/**
 *
 * @author personal
 */
public class POOej01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
       Persona PrimerPersona = new Persona();
       PrimerPersona.nombre= "Pedro";
       PrimerPersona.apellido="Rolon";
        System.out.println(PrimerPersona.nombre +" "+ PrimerPersona.apellido);
    }
    
}
