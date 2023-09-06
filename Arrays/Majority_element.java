package Arrays;
import java.util.*;
public class Majority_element {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements of the array");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Map<Integer,Integer>map=new HashMap<>();
        for(int i:arr){
            if(map.containsKey(i)){
                map.put(i,map.get(i)+1);
                if(map.get(i)>(n/2)){
                    System.out.println(i);
                    return;
                }
            }
            else{
                map.put(i,1);
            }
        }
        System.out.println("no elements");
        sc.close();
    }
}
