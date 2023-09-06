package String;
import java.util.*;
public class longets_unrepeated_substring {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string");
        String str=sc.nextLine();
        HashMap<Character,Integer>map=new HashMap<>();
        int left=0;
        int len=0;
        for(int r=0;r<str.length();r++){
            if(map.containsKey(str.charAt(r))){
                left=Math.max(left, map.get(str.charAt(r))+1);
            }
            map.put(str.charAt(r),r);
            len=Math.max(len, r-left+1);
        }
        System.out.println("The length of the longest substring is "+len);
    }
}
