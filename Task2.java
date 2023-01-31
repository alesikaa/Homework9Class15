package Homework9Class15;

import java.util.Scanner;

public class Task2 {
    // Create a method that will take a number and prints whether the number is even or odd.
     String evenOrOdd(int num){
         if (num%2==0){
             return "even";
         }else{
             return "odd";
         }
     }

    public static void main(String[] args) {
        Task2 task2=new Task2();
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number:");
        int num= scanner.nextInt();
        System.out.println(num+" is "+task2.evenOrOdd(num)+" number ");
    }
}
