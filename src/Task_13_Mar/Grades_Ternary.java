package Task_13_Mar;

import java.util.Scanner;

public class Grades_Ternary {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
       int score= scanner.nextInt();
       String grade = score >=90 ? "A": (score >= 80)? "B" : (score >=70) ? "C" : (score >=60) ? "D" : "F";
        System.out.println(grade);
    }
}
