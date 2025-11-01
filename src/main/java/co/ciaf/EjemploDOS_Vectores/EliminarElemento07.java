package co.ciaf.EjemploDOS_Vectores;

import java.util.Arrays;

public class EliminarElemento07 {

    public static void main(String[] args) {
        int[] numeros = {10, 20, 30, 40, 50};
        int valorEliminar = 30;

        System.out.println("Vector original: " + Arrays.toString(numeros));

        // Buscar índice
        int indice = -1;
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == valorEliminar) {
                indice = i;
                break;
            }
        }

        if (indice == -1) {
            System.out.println(" Elemento no encontrado, no se elimina nada.");
            return;
        }

        // Crear nuevo vector sin el elemento
        int[] nuevo = new int[numeros.length - 1];
        for (int i = 0, j = 0; i < numeros.length; i++) {
            if (i != indice) {
                nuevo[j++] = numeros[i];
            }
        }

        System.out.println(" Elemento " + valorEliminar + " eliminado correctamente.");
        System.out.println("Nuevo vector: " + Arrays.toString(nuevo));
    }
}
