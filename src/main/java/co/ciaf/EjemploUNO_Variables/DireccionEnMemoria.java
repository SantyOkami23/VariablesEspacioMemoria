package co.ciaf.EjemploUNO_Variables;

public class DireccionEnMemoria {
    public static void main(String[] args) {
        int x = 10;
        int y = 20;
        int w =y;
        String nombre = "Santiago";

        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("nombre = " + nombre);

        // Forma ilustrativa de ver la "identidad" en memoria del objeto
        System.out.println("Identificador de memoria de 'nombre': " + System.identityHashCode(nombre));
        System.out.println("Identificador de memoria de 'X': " + System.identityHashCode(x));
        System.out.println("Identificador de memoria de 'Y': " + System.identityHashCode(y));
        System.out.println("Identificador de memoria de 'W': " + System.identityHashCode(w));

        System.out.println("Valor W = " + w);
        System.out.println("Valor de Y  = " + y);

    }
}
