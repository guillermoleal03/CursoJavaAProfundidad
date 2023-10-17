package Seccion10Arrays;

public class ArreglosBidimensionales {

    public static void main(String[] args) {
        // Arreglos bidimensionales
        int[][] arreglo1 = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] arreglo2 = new int[][]{{10, 11, 12}, {13, 14, 15}, {16, 17, 18}};

        // Suma de los arreglos
        int[][] resultado = new int[arreglo1.length][arreglo1[0].length];

        for (int i = 0; i < arreglo1.length; i++) {
            for (int j = 0; j < arreglo1[0].length; j++) {
                resultado[i][j] = arreglo1[i][j] + arreglo2[i][j];
            }
        }

        // Impresión del resultado
        for (int i = 0; i < resultado.length; i++) {
            for (int j = 0; j < resultado[0].length; j++) {
                System.out.print(resultado[i][j] + " ");
            }
            System.out.println();
        }
    }

}
