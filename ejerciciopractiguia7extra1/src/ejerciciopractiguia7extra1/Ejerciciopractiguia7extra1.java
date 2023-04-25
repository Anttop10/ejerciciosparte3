/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciopractiguia7extra1;

import Entidad.Cancion;

/**
 *
 * @author personal
 */
public class Ejerciciopractiguia7extra1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Cancion c1 = new Cancion();
     c1.setAutor("Los abuelos de la nada");
     c1.setTitulo("Sin gamulan");
     System.out.println("Autor: "+ c1.getAutor()+" "+ "Titulo: " + c1.getTitulo() );
        }
    
  }
