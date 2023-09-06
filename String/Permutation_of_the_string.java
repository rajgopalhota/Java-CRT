package String;
import java.util.*;
public class Permutation_of_the_string {
    public static void main(String args[]){
        
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
    
        for(int i=0;i<t;i++){
            int n=sc.nextInt();
            sc.nextLine();
        String str=sc.nextLine();
        TreeSet<String>set=new TreeSet<>();
        permute(str,0,set);
        for(String r:set){
            System.out.print(r+" ");
        }
        System.out.println();
    }
    }
    public static void permute(String str,int index,TreeSet<String> set){
        if(index==str.length()){
            return;
        }
        else{
            for(int i=index;i<str.length();i++){
                str=swap(str,index,i);     //going depth into the tree
                set.add(str);
                permute(str, index+1, set);
                str=swap(str,i,index);     //backtracking back
            }
        }
    }
    public static String swap(String str,int l,int r){
        char []ch=str.toCharArray();
        char temp=ch[l];
        ch[l]=ch[r];
        ch[r]=temp;
        return String.valueOf(ch);
    }
}
