package Heaps;
import java.util.*;
public class k_largest {
    static ArrayList<Integer> al=new ArrayList<>();
    static int n=0;
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n=sc.nextInt();
        System.out.println("Enter the largest elements");
        int k=sc.nextInt();
        System.out.println("Enter array elements");
        for(int i=0;i<n;i++){
            minHeap(sc.nextInt());
        }
        System.out.println(al);
        System.out.println(al.get(k-1));
    }
    public static void minHeap(int val){
        al.add(val);
        int ci=n;int pi;
        while(ci>0){
            pi=(ci-1)/2;
            if(al.get(pi)<al.get(ci)){
                int temp=al.get(pi);
                al.set(pi,al.get(ci));
                al.set(ci,temp);
                ci=pi;
            }
            else{
                break;
            }
        }
        n++;
    }
}
