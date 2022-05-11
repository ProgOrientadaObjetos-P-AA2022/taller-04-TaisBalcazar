/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problema2;

/**
 *
 * @author TaisBalcazar
 */
public class Sueldos {

    private String nombre;
    private String apellido;
    private double sueldoBasico;
    private double sueldoTotal;
    private String cedula;

    public Sueldos() {
        nombre = "Tais";
        apellido = "Balcázar";
        sueldoBasico = 800.7;
        cedula = "1150083242";
    }

    public Sueldos(String a, String b, double c, String d) {
        nombre = a;
        apellido = b;
        sueldoBasico = c;
        cedula = d;
    }

    public void establecerNombre(String c) {
        nombre = c;
    }

    public void establecerApellido(String c) {
        apellido = c;
    }

    public void establecerSueldoBasico(double c) {
        sueldoBasico = c;
    }

    public void establecerCedula(String c) {
        cedula = c;
    }

    public void calcularSueldoTotal() {
        sueldoTotal = sueldoBasico + (sueldoBasico * 0.2);
    }

    public String obtenerNombre() {
        return nombre;
    }

    public String obtenerApellido() {
        return apellido;
    }

    public double obtenerSueldoBasico() {
        return sueldoBasico;
    }

    public String obtenerCedula() {
        return cedula;
    }

    public double obtenerSueldoTotal() {
        return sueldoTotal;
    }

    @Override
    public String toString() {

        String cadena = String.format("El sueldo del empleado %s %s con cedula %s es: \n"
                + "Sueldo Básico: %.2f\n"
                + "Sueldo Total: %.2f\n",
                obtenerNombre(),
                obtenerApellido(),
                obtenerCedula(),
                obtenerSueldoBasico(),
                obtenerSueldoTotal());
        return cadena;
    }
}
