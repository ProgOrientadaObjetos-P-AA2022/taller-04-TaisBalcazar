/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema2;

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

        Sueldos e1 = new Sueldos();
        e1.calcularSueldoTotal();

        Sueldos e2 = new Sueldos("Sandra", "Albán", 700.3, "1102924073");
        e2.calcularSueldoTotal();

        System.out.printf("%s\n%s\n", e1, e2);
    }

}
