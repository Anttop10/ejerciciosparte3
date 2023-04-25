/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.util.Date;

/**
 *
 * @author personal
 */
public class Persona {
    public String nombre;
    public String apellido;
    public Date fecha;

    public Persona() {
    }

    public Persona(String nombre, String apellido, Date fecha) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fecha = fecha;
    }
    
    
    
}
