package String;
import java.util.*;
public class Longest_Common_prefix_between_strings {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        sc.nextLine();
        String[] str = new String[n];
        for (int i = 0; i < n; i++) {
            str[i] = sc.nextLine();
        }
        String ans = str[0];
        for (int i = 1; i < n; i++) {
            ans = longestCommonPrefix(ans, str[i]);
        }
        System.out.println("The longest common prefix is " + ans);
    }

    public static String longestCommonPrefix(String str1, String str2) {
        StringBuilder str = new StringBuilder();
        int n = Math.min(str1.length(), str2.length());
        int i = 0;
        while (i < n) {
            if (str1.charAt(i) == str2.charAt(i)) {
                str.append(str1.charAt(i));
            } else {
                break;
            }
            i++;
        }
        return str.toString();
    }
}
  
