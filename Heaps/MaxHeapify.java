package Heaps;
import java.util.*;
public class MaxHeapify {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]={};
        
        int x=sc.nextInt();
        maxHeapify(arr, n);
    }
    public static void maxHeapify(int arr[],int index){
        int n=arr.length;
        while(true){
            int lci=2*index+1;
            int rci=2*index+2;
            int mx=index;
            if(lci<n &&(arr[lci]>arr[mx])){
                mx=lci;
            }
            if(rci<n&&(arr[rci]>arr[mx])){
                mx=rci;
            }
            if(index==mx){
                break;
            }
            arr[mx]=arr[mx]^arr[index];
            arr[index]=arr[mx]^arr[index];
            arr[mx]=arr[mx]^arr[index];
            index=mx;
        }
    }
}
