package Seccion4EstructurasDeControlDeFlujo;

public class Practica2EstructurasDControl {
    /*Realizar un programa que imprima las tablas de multiplicar del 1 al 20, debe existir espacio entre una y otra para identificarlas
    Modificar lo anterior para que solo imprima las tablas de multiplicar de numeros pares
    Imprimir el factorial de un numero
    Imprimir la forma *
     */

    public static void main(String[] args) {
        tablasMultiplicar();
        System.out.println();
        tablasPares();
        System.out.println();
        System.out.println("El factorial de 5 es: "+factorial(5));
        System.out.println();
        imprimirTriangulo(4);

    }

    static void tablasMultiplicar() {
        int numero = 1;
        int x = 1;
        while (numero <= 10) {
            while (x <= 10) {
                System.out.println("Tabla del " + numero + " por " + x + " es " + (numero * x));
                x++;
            }
            x = 1;
            numero++;
            System.out.println();
        }
    }

    static void tablasPares(){
        for (int numero = 1; numero <= 10; numero++) {
            if (numero % 2 == 0) {
                for (int x = 1; x <= 10; x++) {
                    System.out.println("Tabla del " + numero + " por " + x + " es " + (numero * x));
                }
                System.out.println();
            }
        }
    }

    static int factorial(int numero){
        int factorial = 1;
        for (int i = 1; i <= numero; i++) {
            factorial *= i;
        }
        return factorial;
    }

    public static void imprimirTriangulo(int numero) {
        for (int i = 1; i <= numero; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
