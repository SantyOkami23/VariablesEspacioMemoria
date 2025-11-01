package co.ciaf.EjemploDOS_Vectores;

public class BuscarElemento06 {

    public static void main(String[] args) {
        int[] numeros = {10, 20, 30, 40, 50};
        int valorBuscado = 30;
        boolean encontrado = false;

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == valorBuscado) {
                System.out.println(" Elemento " + valorBuscado + " encontrado en la posición " + i);
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            System.out.println("❌ Elemento " + valorBuscado + " no encontrado en el vector.");
        }
    }
}
