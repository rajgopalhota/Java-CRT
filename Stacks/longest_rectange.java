package Stacks;
import java.util.*;
public class longest_rectange  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int nse[] = n_s_e(arr);
        int npe[] = n_p_e(arr);
        int max = 0;
        for (int i = 0; i < n; i++) {
            int area = arr[i] * (nse[i] - npe[i] - 1);
            max = Math.max(max, area);
        }
        System.out.println(max);
    }

    public static int[] n_s_e(int arr[]) {
        int n = arr.length;
        int res[] = new int[n];
        res[n - 1] = n;
        Stack<Integer> stack = new Stack<>();
        stack.push(n - 1);
        for (int i = n - 2; i >= 0; i--) {
            while (!stack.isEmpty() && (arr[stack.peek()] >= arr[i])) {
                stack.pop();
            }
            if (stack.isEmpty()) {
                res[i] = n;
            } else {
                res[i] = stack.peek();
            }
            stack.push(i);
        }
        return res;
    }

    public static int[] n_p_e(int arr[]) {
        int n = arr.length;
        int res[] = new int[n];
        res[0] = -1;
        Stack<Integer> stack = new Stack<>();
        stack.push(0);
        for (int i = 1; i < n; i++) {
            while (!stack.isEmpty() && (arr[stack.peek()] >= arr[i])) {
                stack.pop();
            }
            if (stack.isEmpty()) {
                res[i] = 0;
            } else {
                res[i] = stack.peek();
            }
            stack.push(i);
        }
        return res;
    }
}
