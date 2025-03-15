package Task_14_Mar;

import java.util.Scanner;

public class Triangle_Classifier {
    public static void main(String[] args) {
        // ✅ Triangle Classifier:
        //
        // Write a program that classifies a triangle based on its side lengths.
        // Given three input values representing the lengths of the sides,
        // determine if the triangle is equilateral (all sides are equal),
        // isosceles (exactly two sides are equal),
        // or scalene (no sides are equal).
        // Use an if-else statement to classify the triangle.

        Scanner scanner = new Scanner(System.in);
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        int n3 = scanner.nextInt();


        if (n1==n2 && n2==n3) {
            System.out.println("This is an equilateral triangle");
        }
        else if (n1==n2 || n2==n3 || n3==n1) {
            System.out.println("This is an isosceles triangle ");
        }

        else{
            System.out.println("This is an scalene triangle, no sides are equal");
        }
    }
}
