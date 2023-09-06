package Expontiation;
public class power_of_matrix{
    public static int[][] identity_matrix(){
        return null;
    } 
    public static int[][] multiply_matrix(int mat1[][],int mat2[][]){
        return null;
    }
    public static int[][] power(int mat[][],int n){
        if(n==1){
            return mat;
        }
        if(n==0){
            return identity_matrix();
        }
        int half[][]=power(mat, n/2);
        int sq[][]=multiply_matrix(half,half);
        if(n%2==1){
            return multiply_matrix(mat, sq);
        }
        return sq;
    }
    public static void main(String args[]){

    }
}