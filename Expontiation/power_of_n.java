package Expontiation;
import java.util.*;
public class power_of_n {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        System.out.println("Enter the power");
        int p=sc.nextInt();
        int res=power(n,p);
        System.out.println("The answer is "+res);
        sc.close();;
    }
    public static int power(int n,int p){
        if(n==1){
            return n;
        }
        if(n==0){
            return 0;
        }
        int half=power(n,p/2);
        int sq=((half %100000009)*(half%100000009))%100000009;
        if(p%2==0){
            return sq %100000009;
        }
        else{
            return (n*sq)%100000009;
        }
    }
}
//another appoach
/*
    BigInteger a=new BigInteger("n");
    BigInteger b=new BigInteger("p");
    BigInteger res=a.powe(p);
 */