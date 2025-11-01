package co.ciaf.EjemploDOS_Vectores.organizar;

public class SumarElementosVector {
    public static void main(String[] args) {
        int[] notas = {3, 4, 5, 2, 1};
        int suma = 0;
        int mayor = notas[0];

        for (int n : notas) {
            suma += n;
            if (n > mayor)
                mayor = n;
        }

        System.out.println("Promedio: " + suma / notas.length);
        System.out.println("Mayor nota: " + mayor);

    }
}
