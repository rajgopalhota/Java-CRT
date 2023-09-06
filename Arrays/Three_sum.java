package Arrays;
import java.util.*;
public class Three_sum{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int target=0;
        int flag=0;
        for(int i=0;i<arr.length-1;i++){
            HashSet<Integer> set=new HashSet<>();
            for(int j=i+1;j<arr.length;j++){
                if(set.contains(target-arr[i]-arr[j])){
                    System.out.println("The three numbers are "+arr[i]+""+arr[j]+""+(target-arr[j]-arr[i]));
                    flag++;
                }
                set.add(arr[j]);
            }
        }
        if(flag==0)
            System.out.println("No triplets found in the array whose sum is zero");
    }
}