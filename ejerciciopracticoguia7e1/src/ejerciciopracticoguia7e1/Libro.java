/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciopracticoguia7e1;

import java.util.Scanner;

/**
 *
 * @author personal
 */
public class Libro {
 //ISBN, Título, Autor, Número de páginas
 public int isbn;
 public String titulo;
 public String autor;
 public int numerodepaginas;

    public Libro() {
    }

   public void cargarLibro() {
        Scanner scanner = new Scanner(System.in).useDelimiter("\n");
        System.out.print("Ingrese el ISBN del libro: ");
        this.isbn = scanner.nextInt();
        System.out.print("Ingrese el título del libro: ");
        this.titulo = scanner.next();
        System.out.print("Ingrese el autor del libro: ");
        this.autor= scanner.next();
        System.out.print("Ingrese el número de páginas del libro: ");
        this.numerodepaginas = scanner.nextInt();
    }
     public void mostrarLibro() {
        System.out.println("ISBN: " + this.isbn);
        System.out.println("Título: " + this.titulo);
        System.out.println("Autor: " + this.autor);
        System.out.println("Número de páginas: " + this.numerodepaginas);
}
}
         
    

