package Stacks;

import java.util.*;

public class Next_greater_elemets {
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Stack<Integer> stack = new Stack<>();
        int nge[] = new int[n];
        for (int i = n - 1; i >= 0; i--) {
            while (!stack.isEmpty() && stack.peek() <= arr[i]) {
                stack.pop();
            }
            if (!stack.isEmpty()) {
                nge[i] = stack.peek();
            } else {
                nge[i] = -1;
            }
            stack.push(arr[i]);
        }
        System.out.println(Arrays.toString(nge));
    }
}
