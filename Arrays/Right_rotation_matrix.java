package Arrays;

import java.util.*;

public class Right_rotation_matrix {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int n = sc.nextInt();
        System.out.println("Enter the number of columns:");
        int m = sc.nextInt();
        int[][] arr = new int[n][m];
        System.out.println("Enter the matrix elements:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        arr = rotateRight(arr, n, m);
        System.out.println("After rotation:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] rotateRight(int arr[][], int r, int c) {
        arr = transpose(arr, r, c);
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c / 2; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[i][c - j - 1];
                arr[i][c - j - 1] = temp;
            }
        }
        return arr;
    }

    public static int[][] transpose(int arr[][], int r, int c) {
        int[][] transposed = new int[c][r];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                transposed[j][i] = arr[i][j];
            }
        }
        return transposed;
    }
}
