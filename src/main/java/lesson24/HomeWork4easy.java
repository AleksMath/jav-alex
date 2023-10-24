package lesson24;

import java.util.Arrays;

public class HomeWork4easy {
    public static void main(String[]args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println("Исходная матрица " + Arrays.toString(arr));
        shiftRight(arr);
        System.out.println("Сдвинутая матрица " + Arrays.toString(arr));
    }
    private static void shiftRight(int[] arr) {
        int lastElem = arr[arr.length - 1];
for (int i = arr.length-1; i > 0; i--) {
    arr[i] = arr[i - 1];
        }
        arr [0] = lastElem;
    }
}
