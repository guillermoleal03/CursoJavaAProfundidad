package Seccion10Arrays;

public class ArregloTriangular {

    public static void main(String[] args) {
        int[][] arr = new int[5][];
        arr[0] = new int[] {1};
        arr[1] = new int[] {2, 3};
        arr[2] = new int[] {4, 5, 6};
        arr[3] = new int[] {7, 8};
        arr[4] = new int[] {9};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
