/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema1;

/**
 *
 * @author TaisBalcazar
 */
public class Ejecutor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Calificaciones alum1 = new Calificaciones();
        alum1.calcularPromedio();

        String nombre = "Sandra Albán";
        double materiaUno = 9.4;
        double materiaDos = 7.3;
        double materiaTres = 8.9;
        Calificaciones alum2 = new Calificaciones(nombre, materiaUno, materiaDos,
                materiaTres);
        alum2.calcularPromedio();

        System.out.printf("%s\n%s\n", alum1, alum2);
    }

}
