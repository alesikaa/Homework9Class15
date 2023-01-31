package Homework9Class15;

public class Task5 {
    /*
    Write a method to return whether given number is prime or not
    return type=> boolean
    name=> isPrime
    parameter => int number
     */

        String isPrime ( int number) {
            boolean prime = true;
            if (number > 1) {
                for (int i = 2; i < number; i++) {
                    if (number % i == 0) {
                        prime = false;
                        break;
                    }
                }
                }
                if (prime) {
                    return number + " is a prime number.";
                } else {
                    return number + " is not a prime number.";
                }
            }


    public static void main(String[] args) {
            Task5 task5=new Task5();
        System.out.println(task5.isPrime(13));

    }
    }

