package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        App myapp = new App();
        Coche miCoche = new Coche();
        miCoche.numeroPuertas = 4;
        System.out.println(myapp.sumar(6,1,9));
        System.out.println(miCoche.incrementaNoPuertas());
    }

    int sumar(int a, int b, int c) {
        return a + b + c;
    }
}

class Coche {
    int numeroPuertas;

    int incrementaNoPuertas() {
        return numeroPuertas + 1;
    }
}
