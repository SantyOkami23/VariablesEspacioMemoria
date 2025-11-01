package co.ciaf.EjemploDOS_Vectores.Strings;

public class VectorStringsBusqueda10 {

    public static void main(String[] args) {
        String[] colores = {"Rojo", "Verde", "Azul", "Negro"};
        String colorBuscado = "Azul";
        boolean encontrado = false;

        for (int i = 0; i < colores.length; i++) {
            if (colores[i].equalsIgnoreCase(colorBuscado)) {
                System.out.println("Color encontrado en la posición " + i);
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            System.out.println("Color no encontrado.");
        }

    }

}
