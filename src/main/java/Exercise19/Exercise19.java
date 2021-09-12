/*
 *  UCF COP3330 Fall 2021 Exercise 19 Solution
 *  Copyright 2021 Patrick Iannini
 */
package Exercise19;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercise19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your height in inches");
        while (!sc.hasNextInt()) {
            System.out.println("Please enter a valid integer");
            sc.next();
        }
        int height = sc.nextInt();
        System.out.println("Enter your weight in pounds");
        while (!sc.hasNextDouble()) {
            System.out.println("Please enter a valid number");
            sc.next();
        }
        double weight = sc.nextDouble();
        DecimalFormat df = new DecimalFormat("#.##");
        double bmi = (weight / (height*height)) *703;
        System.out.println("Your BMI is "+df.format(bmi));

        if (18.5<=bmi && bmi<=25) {
            System.out.println("You are within the ideal weight range.");
        } else if (bmi<18.5) {
            System.out.println("You are underweight. You should see a doctor.");
        } else if (bmi>25) {
            System.out.println("You are overweight. You should see a doctor");
        }
    }
}
