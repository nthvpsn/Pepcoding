package tutorial;

import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static Scanner sc = new Scanner(System.in);

    public static void takeInput(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
    }

    public static void printOutput(int[] arr) {
        System.out.println(Arrays.toString(arr));
    }

    public static boolean findElement(int[] arr, int data) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == data)
                return true;
        }
        return false;
    }

    public static int maximum(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            max = (arr[i] > max) ? arr[i] : max;
        }
//        System.out.println(max);
        return max;
    }

    public static int minimum(int[] arr) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            min = (arr[i] < min) ? arr[i] : min;
        }
//        System.out.println(min);
        return min;
    }

    public static void barChart(int[] arr) {
        int max = maximum(arr);
        int rowValue = max;
        for (int row = 0; row < rowValue; row++) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] >= max) {
                    System.out.print("*\t");
                } else
                    System.out.print("\t");
            }
            max--;
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = sc.nextInt();
        int[] arr = new int[n];
        takeInput(arr);
//        printOutput(arr);
//        System.out.println(findElement(arr,5));
//        int max = maximum(arr);
//        int min = minimum(arr);
//        System.out.println(max-min);
        barChart(arr);
    }
}
