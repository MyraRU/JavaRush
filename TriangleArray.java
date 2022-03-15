package TriangleArr;

import java.util.Arrays;

public class TriangleArray {
    public static int[][] arr = new int[10][];

    public static void main(String[] args) {

        int secondIndex = 1;
        for (int i = 0; i < 10; i++) {
            arr[i] = new int[secondIndex];
            secondIndex++;
        }

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = i + j;
            }
            System.out.println(Arrays.toString(arr[i]));
        }
    }
}
