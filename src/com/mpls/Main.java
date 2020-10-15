package com.mpls;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner dre = new Scanner (System.in);
        System.out.println("Welcome to Dream Corps Calculator! Please type two numbers:");
        double firstNumber = dre.nextDouble();
        double secondNumber = dre.nextDouble();
        System.out.println("Thank you! Now please pick a operator! (+, *, -, /):");
        char input = dre.next().charAt(0);
        System.out.println("Awesome! Getting your results now!... Computing...");
        if (input == '*'){
            double answer = firstNumber * secondNumber;
            System.out.println(firstNumber + " * " + secondNumber + " = " + answer);}
         else if (input == '-'){
            double answer = firstNumber - secondNumber;
            System.out.println(firstNumber + " - " + secondNumber + " = " + answer);}
        else if (input == '+'){
            double answer = firstNumber + secondNumber;
            System.out.println(firstNumber + " + " + secondNumber + " = " + answer);}
        else if (input == '/' && secondNumber != 0 && firstNumber !=0){
            double answer = firstNumber / secondNumber;
            System.out.println(firstNumber + " / " + secondNumber + " = " + answer);}
        else if (input == '/' && secondNumber == 0){
            System.out.println("Cannot divide by 0");
        }

    }





    }

