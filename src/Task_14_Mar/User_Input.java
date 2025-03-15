package Task_14_Mar;

import java.util.Scanner;

public class User_Input {
    public static void main(String[] args) {
        System.out.println("Enter the required details...");
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter Name...");
        String Name = scanner.nextLine();
        System.out.println(Name);
        System.out.println("Enter Age...");
        int Age = scanner.nextInt();
        System.out.println(Age);
        System.out.println("Enter Salary...");
        int Salary = scanner.nextInt();
        System.out.println(Salary);

    }
}
