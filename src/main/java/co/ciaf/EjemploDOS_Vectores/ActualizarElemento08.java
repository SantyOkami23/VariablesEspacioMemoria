package co.ciaf.EjemploDOS_Vectores;

import java.util.Arrays;

public class ActualizarElemento08 {

    public static void main(String[] args) {
        int[] numeros = {10, 20, 30, 40, 50};
        int posicionActualizar = 2;
        int nuevoValor = 99;

        System.out.println("Vector original: " + Arrays.toString(numeros));

        int valorAnterior = numeros[posicionActualizar];
        numeros[posicionActualizar] = nuevoValor;

        System.out.println(" Elemento actualizado: posición " + posicionActualizar +
                " de " + valorAnterior + " a " + nuevoValor);
        System.out.println("Vector actualizado: " + Arrays.toString(numeros));
    }
}
