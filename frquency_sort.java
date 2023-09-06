import java.util.*;
public class frquency_sort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Integer arr[]=new Integer[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        sorting(arr);
    }
    public static void sorting(Integer arr[] ){
        Map<Integer,Integer>map=new HashMap<>();
        for(int i:arr){
            if(map.containsKey(i)){
                map.put(i,map.get(i)+1);
            }
            else{
                map.put(i,1);
            }
        }
        Arrays.sort(arr,(a,b)->
            {
                if(map.get(a)==map.get(b)){
                    if(a<b){
                        return 1;
                    }
                    else{
                        return -1;
                    }
                }
                else{
                    return map.get(b)-map.get(a);
                }
            }
        );
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}


//iedone.com/z9VU8f