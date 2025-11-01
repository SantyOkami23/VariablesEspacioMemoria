package co.ciaf.EjemploDOS_Vectores.Strings;

import java.util.Arrays;

public class ActualizarElementoString12 {

    public static void main(String[] args) {
        String[] nombres = {"Santiago", "Laura", "Andrés", "Valentina"};
        int posicionActualizar = 1;
        String nuevoValor = "Camila";

        System.out.println("Vector original: " + Arrays.toString(nombres));


        if (posicionActualizar < 0 || posicionActualizar >= nombres.length) {
            System.out.println(" Posición fuera de rango.");
            return;
        }

        // Actualizar el valor
        String valorAnterior = nombres[posicionActualizar];
        nombres[posicionActualizar] = nuevoValor;

        System.out.println(" Elemento actualizado en posición " + posicionActualizar +
                ": '" + valorAnterior + "' → '" + nuevoValor + "'");
        System.out.println("Vector actualizado: " + Arrays.toString(nombres));
    }
}
