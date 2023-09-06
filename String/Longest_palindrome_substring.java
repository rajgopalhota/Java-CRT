package String;
import java.util.*;
public class Longest_palindrome_substring {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Entet the string");
        String str=sc.nextLine();
        int size=0;
        String ans=null;
        for(int i=0;i<str.length();i++){
            String temp=palindrome(str,i,i);
            if(temp.length()>size){
                ans=temp;
                size=ans.length();
            }
            temp=palindrome(str, i, i+1);
            if(temp.length()>size){
                ans=temp;
                size=ans.length();
            }
        }
        System.out.println(ans);
    }
    public static String palindrome(String str,int start,int end){
        while(start>=0&&end<str.length()){
            if(str.charAt(start)==str.charAt(end)){
                start--;
                end++;
            }
            else{
                break;
            }
        }
        return str.substring(start+1, end);
    }
}
