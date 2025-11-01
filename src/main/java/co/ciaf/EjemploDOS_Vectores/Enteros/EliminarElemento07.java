package co.ciaf.EjemploDOS_Vectores.Enteros;

import java.util.Arrays;

public class EliminarElemento07 {
    public static void main(String[] args) {
        int[] numeros = {10, 20, 30, 40, 50};
        int indiceEliminar = 2;

        System.out.println("Vector original: " + Arrays.toString(numeros));

        // Validar índice
        if (indiceEliminar < 0 || indiceEliminar >= numeros.length) {
            System.out.println("Índice fuera de rango. No se elimina nada.");
            return;
        }

        // Crear nuevo vector sin el elemento
        int[] nuevo = new int[numeros.length - 1];
        for (int i = 0, j = 0; i < numeros.length; i++) {
            if (i != indiceEliminar) {
                nuevo[j++] = numeros[i];
            }
        }

        System.out.println("Elemento en índice " + indiceEliminar + " eliminado correctamente.");
        System.out.println("Nuevo vector: " + Arrays.toString(nuevo));
    }
}