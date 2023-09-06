package Heaps;
import java.util.*;
public class Heap_sort {
    public static void heapify(int arr[],int n,int idx){
        while(true){
            int lci=2*idx+1;
            int rci=2*idx+2;
            int mxi=idx;
            if(lci<n&&(arr[lci]>arr[mxi])){
                mxi=lci;
            }
            if(rci<n&&(arr[rci]>arr[mxi])){
                mxi=rci;
            }
            if(mxi==idx){
                break;
            }
            int temp=arr[mxi];
            arr[mxi]=arr[idx];
            arr[idx]=temp;
            idx=mxi;
        }
    }
    public static void main(String args[]){
        int arr[]={2,3,-3,9,10,12,15,-24};
        int n=arr.length;
        for(int i=(n/2)-1;i>=0;i--){
            heapify(arr,n,i);
        }
        for(int i=n-1;i>=0;i--){
            int temp=arr[i];
            arr[i]=arr[0];
            arr[0]=temp;
            heapify(arr, i, 0);
        }
        System.out.println("After sorting are ");
        System.out.println(Arrays.toString(arr));
    }
}
