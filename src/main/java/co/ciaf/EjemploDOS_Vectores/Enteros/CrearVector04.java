package co.ciaf.EjemploDOS_Vectores.Enteros;

public class CrearVector04 {

    public static void main(String[] args) {
        // Crear vector de tamaño 5
        int[] numeros = new int[5];

        // Asignar valores
        numeros[0] = 10;
        numeros[1] = 20;
        numeros[2] = 30;

        System.out.println(" Vector creado correctamente con tamaño: " + numeros.length);

        // Mostrar contenido
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Posición " + i + ": " + numeros[i]);
        }
    }
}
