/*
FIXIT 3

This is a simple calculator app. It has support for addition and subraction. It also has an error that needs to be fixed.

1. Fix the error
2. Add support for multiplacation and division

*/

package app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number");
        String num1 = input.nextLine();

        System.out.println("Enter another number");
        String num2 = input.nextLine();

        System.out.println("Would you like to add or subtract?");
        String operation = input.nextLine();

        if (operation == "add"){

            System.out.println(num1 + num2);
        }
        else if (operation == "subtract"){
            System.out.println(num1 - num2);
        }


    }
}