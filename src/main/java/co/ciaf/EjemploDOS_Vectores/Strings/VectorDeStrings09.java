package co.ciaf.EjemploDOS_Vectores.Strings;

public class VectorDeStrings09 {
    public static void main(String[] args) {

        //Ejemplo inicializacion en una sola linea
        String[] frutas = {"Manzana", "Pera", "Banano", "Kiwi"};

        for (int i = 0; i < frutas.length; i++) {
            System.out.println("Fruta " + i + ": " + frutas[i]);
        }



        // Crear un vector (arreglo) de 4 Strings
        String[] nombres = new String[4];

        // Asignar valores a cada posición
        nombres[0] = "Santiago";
        nombres[1] = "Laura";
        nombres[2] = "Andrés";
        nombres[3] = "Valentina";

        // Mostrar el contenido del vector
        System.out.println("Contenido del vector de nombres:");
        for (int i = 0; i < nombres.length; i++) {
            System.out.println("Posición " + i + ": " + nombres[i]);
        }
    }
}
