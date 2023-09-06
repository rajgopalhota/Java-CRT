package Heaps;
import java.util.*;
public class most_frequently_occuring_k_elements {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        do{
            int n=sc.nextInt();
            int k=sc.nextInt();
            sc.nextLine();
            String str[]=new String[n];
            for(int i=0;i<n;i++){
                str[i]=sc.next();
            }
            sort(str,k);
            System.out.println();
            t--;
        }while(t>0);
    }
    public static void sort(String str[],int k){
        Map<String,Integer>map=new HashMap<>();
        for(String s:str){
            if(map.containsKey(s)){
                map.put(s,map.get(s)+1);
            }
            else{
                map.put(s,1);
            }
        }
        PriorityQueue<String>pq=new PriorityQueue<>((str1,str2)->{
            if(map.get(str2).equals(map.get(str1))){
                return str1.compareTo(str2);
            }
            else{
                return map.get(str2)-map.get(str1);
            }
        });
        for(String s:map.keySet()){
            pq.add(s);
        }
    
        while(k-->0){
            System.out.print(pq.poll()+" ");
        }
    }
}
