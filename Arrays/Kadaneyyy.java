package Arrays;
import java.util.*;
public class Kadaneyyy {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of an array");
        int n=sc.nextInt();
        System.out.println("Enter an array");
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int sum=0,max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
            max=Math.max(max, sum);
            if(sum<0){
                sum=0;
            }
        }
        System.out.println("The largest sum is "+max);
    }
}
