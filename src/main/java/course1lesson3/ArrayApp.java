package course1lesson3;

import java.util.Arrays;

public class ArrayApp {
    public static void main(String[] args) {
        int[] arr = {1, 0, 1, 0};
       replaceNumb(arr);
       int[] val = new int[100];
       printArray1(val);
       int[] num = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
       numbLessThan6MultiplyBy2(num);
       int[][] arr2 = new int[6][6];
       arrayWith1onTheDiagonal(arr2);
       int[] arr3 = new int[4];
       int initialValue = 2;
        System.out.println(Arrays.toString(method1(arr3, initialValue)));
        int[] arr4 = {3, 5, 8, 2, 1};
        System.out.println(method2(arr4));
    }
    public static void replaceNumb(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = 1;
            } else if (arr[i] == 1) {
                arr[i] = 0;
            }
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void printArray1(int[] val) {
        int count = 1;
        for (int i = 0; i < val.length; i++) {
            val[i] = count;
            System.out.print(val[i] + " ");
            count++;
        }
        System.out.println();
    }
    public static void numbLessThan6MultiplyBy2(int[] num) {
        for (int i = 0; i < num.length; i++) {
            if (num[i] < 6) {
                num[i] = num[i] * 2;
            }
            System.out.print(num[i] + " ");
        }
        System.out.println();
    }
    public static void arrayWith1onTheDiagonal(int[][] arr2) {
        for (int i = 0; i < arr2.length; i ++) {
            for (int j = 0; j < arr2[i].length; j++) {
                if (i == j || i == (arr2.length - (j + 1))) {
                    arr2[i][j] = 1;
                }
                System.out.print(arr2[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static int[] method1(int[] arr3, int initialValue) {
        for (int i = 0; i < arr3.length; i++) {
            arr3[i] = initialValue;
        }
        return arr3;
    }
    public static int method2(int[] arr4) {
        int maxMeaning = 0;

        for (int i = 0; i < arr4.length; i++) {
            if (arr4[i] > maxMeaning) {
                maxMeaning = arr4[i];
            }
        }
        return maxMeaning;
    }
}
