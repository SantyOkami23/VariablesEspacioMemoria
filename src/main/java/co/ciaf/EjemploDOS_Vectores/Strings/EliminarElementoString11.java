package co.ciaf.EjemploDOS_Vectores.Strings;

import java.util.Arrays;

public class EliminarElementoString11 {

    public static void main(String[] args) {
        String[] nombres = {"Santiago", "Laura", "Andrés", "Valentina"};
        String valorEliminar = "Andrés";

        System.out.println("Vector original: " + Arrays.toString(nombres));

        // Buscar el índice del elemento a eliminar
        int indice = -1;
        for (int i = 0; i < nombres.length; i++) {
            if (nombres[i].equalsIgnoreCase(valorEliminar)) {
                indice = i;
                break;
            }
        }

        if (indice == -1) {
            System.out.println(" El elemento '" + valorEliminar + "' no existe en el vector.");
            return;
        }

        // Crear un nuevo vector con un tamaño menor
        String[] nuevo = new String[nombres.length - 1];

        // Copiar todos menos el eliminado
        for (int i = 0, j = 0; i < nombres.length; i++) {
            if (i != indice) {
                nuevo[j++] = nombres[i];
            }
        }

        System.out.println(" Elemento '" + valorEliminar + "' eliminado correctamente.");
        System.out.println("Nuevo vector: " + Arrays.toString(nuevo));
    }
}
