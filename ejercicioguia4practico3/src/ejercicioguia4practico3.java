
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
public class ejercicioguia4practico3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double euro;
        double op;
        System.out.println("Ingrese la cantidad de euros a convertir : ");
        euro = sc.nextDouble();
        Convertireuros(euro);
    }

    public static void Convertireuros(double euro) {
        int op;
        System.out.println("Seleccione a que moneda desea convertir: ");
        System.out.println("1. libras");
        System.out.println("2. dolares");
        System.out.println("3. yenes");
        op = sc.nextDouble();
        
        switch (op) {

            case 1:
                euro = euro * 0.86;
                break;
            case 2:
                euro = euro * 1.28611;
                break;
            case 3:
                euro = euro * 129.852;
                break;
            default:
                System.out.println("Operacion finalizada.");
                break;
        }

    }
}
