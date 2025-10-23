package co.ciaf.EjemploUNO_Variables;

public class EjemploDeclaracionMemoria {
    public static void main(String[] args) {
        int edad = 24;              // ocupa 4 bytes
        double salario = 3500000.5; // ocupa 8 bytes
        char inicial = 'S';         // ocupa 2 bytes (Unicode)
        boolean activo = true;      // ocupa 1 byte aprox.
        String nombre = "Santy"; // referencia a un objeto en el heap

        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Salario: " + salario);
        System.out.println("Inicial: " + inicial);
        System.out.println("Activo: " + activo);
    }
}
