package Stacks;
import java.util.*;

public class Next_greater_frequency {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter array elements");
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            max = Math.max(max, arr[i]);
        }

        int freq[] = new int[max + 1];
        for (int i = 0; i < arr.length; i++) {
            freq[arr[i]]++;
        }

        Stack<Integer> stack = new Stack<>();
        int res[] = new int[n];

        for (int i = n - 1; i >= 0; i--) {
            while ((stack.isEmpty()==false) && (freq[stack.peek()] <= freq[arr[i]])) {
                stack.pop();
            }
            if (stack.isEmpty()) {
                res[i] = -1;
            } else {
                res[i] = stack.peek();
            }
            stack.push(arr[i]); // Store the index in the stack instead of the actual element
        }
        System.out.println(Arrays.toString(res));
    }
}
