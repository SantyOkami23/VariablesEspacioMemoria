package co.ciaf.EjemploDOS_Vectores.organizar;

import java.util.Scanner;

public class BuscarEnVector {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] edades = new int[5];

        // Se realiza la insersion  hasta el tamaño del Vector,
        for (int i = 0; i < edades.length; i++) {
            System.out.print("Edad " + (i + 1) + ": ");
            edades[i] = sc.nextInt();
        }

        //Variable declarada para almacenar el valor a buscar dentro del Vector
        System.out.print("Ingrese edad a buscar: ");
        int buscada = sc.nextInt();

        // Se declara un booleano para encontrar el estado de la busqueda
        boolean encontrada = false;

        // Se itera sobre el vector de edaddes, comparando en cada iteracion si la edad ingresada es igual al valor de la iteracion en ese instante
        for (int edad : edades) {
            if (edad == buscada) {
                encontrada = true;
                break;
            }
        }


        // Muestro el mensaje segun el valor de la bandera
        if (encontrada)
            System.out.println("La edad está en el vector ");
        else
            System.out.println("No se encontró ");
    }
}
