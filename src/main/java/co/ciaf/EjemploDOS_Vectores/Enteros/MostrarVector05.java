package co.ciaf.EjemploDOS_Vectores.Enteros;

public class MostrarVector05 {

    public static void main(String[] args) {
        int[] numeros = {10, 20, 30, 40, 50};

        System.out.println(" Contenido del vector:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Posición " + i + ": " + numeros[i]);
        }
    }
}
