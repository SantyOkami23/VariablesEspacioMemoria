package co.ciaf.EjemploDOS_Vectores.DataDinamica;

import java.util.Scanner;
import java.util.Arrays;

public class BusquedaEnVector {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Crear un vector de 5 números
        int[] numeros = new int[5];

        System.out.println("=== Ingreso de números ===");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Ingrese el número en la posición " + i + ": ");
            numeros[i] = sc.nextInt();
        }

        // Mostrar el vector completo
        System.out.println("\nVector ingresado: " + Arrays.toString(numeros));

        // Pedir el número a buscar
        System.out.print("\nIngrese el número que desea buscar: ");
        int numeroBuscado = sc.nextInt();

        // Buscar el número en el vector
        boolean encontrado = false;
        int posicion = -1;

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == numeroBuscado) {
                encontrado = true;
                posicion = i;
                break;
            }
        }

        // Mostrar el resultado
        if (encontrado) {
            System.out.println(" El número " + numeroBuscado + " se encuentra en la posición " + posicion + ".");
        } else {
            System.out.println(" El número " + numeroBuscado + " no está en el vector.");
        }

        sc.close();
    }
}
