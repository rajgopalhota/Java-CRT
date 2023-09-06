package Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class spiral_matrix {
    
    public static void main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int arr[][] = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++)
                arr[i][j] = sc.nextInt();
        }
        ArrayList<Integer> al = Spiral_traversal(arr);
        for (int i : al) {
            System.out.println(i + " ");
        }

    }

    public static ArrayList<Integer> Spiral_traversal(int mat[][]) {
        ArrayList<Integer>l=new ArrayList<>();
        int n = mat.length;
        int m = mat[0].length;
        int top = 0, left = 0, right = m - 1, bottom = n - 1;
        while (top <= bottom && (left <= right)) {
            for (int i = left; i <= right; i++) {
                l.add(mat[top][i]);
            }
            top++;
            for (int i = top; i <= bottom; i++) {
                l.add(mat[i][right]);
            }
            right--;
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    l.add(mat[bottom][i]);
                }
                bottom--;
            }
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    l.add(mat[i][left]);
                }
                left++;
            }
        }
        return l;

    }
}
