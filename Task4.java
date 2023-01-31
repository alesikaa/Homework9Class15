package Homework9Class15;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Task4 {

    /*
    create a method that will say Hello
    in different language based on the country
     that will be passed when method is executed
     return type=> String void
     name = sayHello
     parameter => String countryName
     */
    String sayHello(String countryName) {
        switch (countryName) {
            case "USA":
                return "Hello";
            case "Moldova":
                return "Salut";
            case "Italy":
                return "Ciao";
            case "China":
                return "Ni hao";
            default:
                return "Country not supported";

        }
    }


    public static void main(String[] args) {
        Task4 task4=new Task4();
        System.out.println(task4.sayHello("Moldova"));
    }

    }

