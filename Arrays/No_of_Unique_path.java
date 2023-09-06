package Arrays;
//this sum is to find no of 
import java.util.*;
public class No_of_Unique_path {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size");
        int n=sc.nextInt();
        int arr[][]=new int[n][n];
        for(int i=0;i<n;i++){
            arr[i][0]=1;
            arr[0][i]=1;
        }
        for(int i=1;i<n;i++){
            for(int j=1;j<n;j++){
                arr[i][j]=arr[i][j-1]+arr[i-1][j];
            }
        }
        System.out.println(arr[n-1][n-1]);
    }
}
