package Arrays;
import java.util.*;
public class Pascal_triangle {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[][]=new int[n][];
        for(int i=0;i<n;i++){
            arr[i]=new int[i+1];
        }
        for(int i=0;i<n;i++){
            arr[i][i]=1;
            arr[i][0]=1;
        }
        for(int i=2;i<n;i++){
            for(int j=1;j<i;j++){
                arr[i][j]=arr[i-1][j]+arr[i-1][j-1];
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print(arr[i][j]+" ");
            }  
            System.out.println();      
        }
    }
}
