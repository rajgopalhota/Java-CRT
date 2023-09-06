package Arrays;
import java.util.*;
public class Subarray_with_a_target {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of the array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter an array");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the target");
        int target=sc.nextInt();
        int i=0,j=1;
        int sum=arr[i];
        while(true){
            if(sum==12){
                System.out.println("The index are "+(i+1)+"and"+j);
                break;
            }
            else if(sum>12){
                sum=sum-arr[i];
                i++;
            }
            else{
                sum=sum+arr[j];
                j++;
            }
        }

    }
}
