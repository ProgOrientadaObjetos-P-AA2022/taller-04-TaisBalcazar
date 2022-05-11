/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema4;

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
        Cheques c1 = new Cheques();
        c1.calcularComision();

        Cheques c2 = new Cheques("Paúl Balcázar", "Banco de Loja", 98700.93);
        c2.calcularComision();

        System.out.printf("%s\n%s\n", c1, c2);
    }

}
