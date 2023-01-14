import java.util.*;
// take input an array 2D array an input the array

public class Array{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
       //input row

       for(int i=0; i<rows; i++){
        //Columns input 
        for(int j=0; j<cols; j++){
            numbers[i][j]= sc.nextInt();
        }
       } 
       //Output
       for(int i=0; i<rows; i++){
        for(int j=0; j<cols; j++){
            System.out.print(numbers[i][j]+" ");
        }
        System.out.println();
       }
    }
}