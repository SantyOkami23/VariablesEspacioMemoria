package co.ciaf.EjemploUNO_Variables;

public class TamannoEnMemoria {
    public static void main(String[] args) {
        System.out.println("Tamaño en bits de los tipos primitivos:");
        System.out.println("byte: " + Byte.SIZE + " bits");
        System.out.println("short: " + Short.SIZE + " bits");
        System.out.println("int: " + Integer.SIZE + " bits");
        System.out.println("long: " + Long.SIZE + " bits");
        System.out.println("float: " + Float.SIZE + " bits");
        System.out.println("double: " + Double.SIZE + " bits");
        System.out.println("char: " + Character.SIZE + " bits");
        System.out.println("boolean: (depende de la JVM, ~1 bit lógico)");

        // Ejemplo práctico diferentes tipos de datos
        int edad = 24;
        double salario = 3500000.5;
        char inicial = 'S';

        System.out.println("\nEjemplos prácticos:");
        System.out.println("Variable 'edad' (int): " + Integer.SIZE + " bits → " + (Integer.SIZE / 8) + " bytes");
        System.out.println("Variable 'salario' (double): " + Double.SIZE + " bits → " + (Double.SIZE / 8) + " bytes");
        System.out.println("Variable 'inicial' (char): " + Character.SIZE + " bits → " + (Character.SIZE / 8) + " bytes");
    }
}
