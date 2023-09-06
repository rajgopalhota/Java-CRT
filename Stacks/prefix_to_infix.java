package Stacks;
import java.util.*;
public class prefix_to_infix {
    public static void main(String args[]){
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter a string expression");
        String exp=sc.nextLine();
        String str=reverse(exp);
        System.out.println(str);
        str=prefix_to_infix(str);
        System.out.println(str);
    }
    public static String prefix_to_infix(String exp){
        Stack<String>stack=new Stack<>();
        for(int i=0;i<exp.length();i++){
            char ch=exp.charAt(i);
            if(Character.isLetterOrDigit(ch)){
                stack.push(ch+" ");
            }
            else{
                String op1=stack.pop();
                String op2=stack.pop();
                stack.push('('+op1+""+ch+""+op2+')');
            }
        }
        return stack.pop();
    }
    public static String reverse(String exp){
        return new String(new StringBuilder(exp).reverse());
    }
}
