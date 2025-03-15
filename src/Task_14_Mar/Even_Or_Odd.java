package Task_14_Mar;

import java.util.Scanner;

public class Even_Or_Odd {
    public static void main(String[] args){
        System.out.println("Please enter a value");
        Scanner sc = new Scanner(System.in);
        int i= sc.nextInt();

        if(i%2==0){
           System.out.println("Given number is even");
        }
        else{
           System.out.println("Given number is odd");
        }
    }
}
