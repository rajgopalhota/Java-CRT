package String;
import java.util.*;
public class Longest_common_substring_betwen_twoStrings {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string-1");
        String str1=sc.nextLine();
        System.out.println("Enter the string-2");
        String str2=sc.nextLine();
        int n=str1.length()-1;
        int m=str2.length()-1;
        int cnt=0;
        cnt=longest_common_substring(str1,str2,n,m,cnt);
        System.out.println("Length of the longest common substring is "+cnt);
    }
    public static int longest_common_substring(String str1,String str2,int n,int m,int cnt){
        if(n==0||m==0){
            return cnt;
        }
        if(str1.charAt(n)==str2.charAt(m)){
            cnt=longest_common_substring(str1, str2, n-1, m-1, cnt+1);
        }
        cnt=Math.max(cnt, Math.max(longest_common_substring(str1, str2, n-1, m, 0),
                        longest_common_substring(str1, str2, n, m-1, 0)));
        return cnt;
    }
}
