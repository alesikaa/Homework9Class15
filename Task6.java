package Homework9Class15;

import java.util.Scanner;
import Class1.Main;

public class Task6 {
    /*
     /*
        Create  class Student that will have a method getGrade. Your method should accept the score of a student and return a grade:
        score > 90 - A
        score >80 - B
        score >70 - C
        score > 50 - D
        anything else - F
         */
    char gradeIs(int score) {
        if (score > 90) {
            return 'A';
        } else if (score > 80) {
            return 'B';
        } else if (score > 70) {
            return 'C';
        } else if (score > 50) {
            return 'D';
        } else {
            return 'F';
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your score: ");
        int score = input.nextInt();

        Task6 task6 = new Task6();
        char result = task6.gradeIs(score);
        System.out.println(result);

    }
}


