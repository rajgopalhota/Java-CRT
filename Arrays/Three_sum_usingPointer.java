package Arrays;
import java.util.*;
public class Three_sum_usingPointer {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter an array");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the target of the key");
        int target=sc.nextInt();
        ArrayList<ArrayList<Integer>>res=new ArrayList<>();
        Arrays.sort(arr);
        for (int i = 0; i < arr.length - 2; i++) {
            if (i > 0 && arr[i] == arr[i - 1]) {
                continue;
            }
            int low = i + 1, high = arr.length - 1;
            int sum = target - arr[i];
            while (low < high) {
                if (arr[low] + arr[high] == sum) {
                    ArrayList<Integer> al = new ArrayList<>();
                    al.add(arr[i]);
                    al.add(arr[low]);
                    al.add(arr[high]);
                    res.add(al);
                    while (low < high && arr[low] == arr[low + 1]) {
                        low++;
                    }
                    while (low < high && arr[high] == arr[high - 1]) {
                        high--;
                    }
                    low++;
                    high--;
                } else if (arr[low] + arr[high] < sum) {
                    low++;
                } else {
                    high--;
                }
            }
        }
        System.out.println("ArrayList with triplets that sum to the target:");
        for (ArrayList<Integer> i : res) {
            for (Integer j : i) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
