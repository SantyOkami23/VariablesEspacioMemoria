package co.ciaf.EjemploDOS_Vectores;

public class EjemploVector {
    public static void main(String[] args) {
        // se crean 5 posiciones (0 a 4)
        int[] numeros = new int[5];

        // Asignar valores
        numeros[0] = 10;
        numeros[1] = 20;
        numeros[2] = 30;

        // Recorrer el vector completamente, como limite de iteracion se usa el tamaño maximo del vector
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Posición " + i + ": " + numeros[i]);
        }
    }
}
