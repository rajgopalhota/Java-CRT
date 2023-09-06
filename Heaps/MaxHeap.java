package Heaps;
import java.util.*;

public class MaxHeap {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Heap_operations h=new Heap_operations();
        for(int i=0;i<n;i++){
            h.add(sc.nextInt());
        }
        h.print();
    }
}

class Heap_operations{
    private ArrayList<Integer> arr = new ArrayList<>();

    public void add(int x){
        arr.add(x);
        int c = arr.size() - 1;
        int pi;
        while(c>0){
            pi=(c-1)/2;
            if(arr.get(pi) < arr.get(c)){
                int temp = arr.get(pi);
                arr.set(pi, arr.get(c));
                arr.set(c, temp);
                c=pi;
            } else {
                break;
            }
        }
    }
    public void print(){
        for(int i=0; i<arr.size(); i++){
            System.out.print(arr.get(i)+" ");
        }
    }
}
