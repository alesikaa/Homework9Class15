package Homework9Class15;

public class Task1 {
    //create a method that will take 2 parameters as a numbers
    // and prints which number is larger

    int largerNum(int num1, int num2){
        if (num1> num2){
            return num1;
        }else {
            return num2;
        }
    }

    public static void main(String[] args) {
        Task1 task1= new Task1();
        System.out.println(task1.largerNum(47,57)+ " is larger number");
    }
}
