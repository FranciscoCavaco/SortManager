package com.sparta.francisco.start;

import com.sparta.francisco.display.DisplayManager;

import java.util.Scanner;

import static com.sparta.francisco.display.DisplayManager.correctFormat;
import static com.sparta.francisco.display.DisplayManager.incorrectFormat;

public class SortLoader {
    public static void menu() {
        Scanner input = new Scanner(System.in);
        DisplayManager.printMenu();
        String inputString = input.nextLine();
    }


    public static int naturalNumberScanner() {
        String regex = "^[1-9]*$";
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number (INPUT NUMBER HAS TO BE GREATER THAN 0): ");
        String inputString = input.nextLine();
        int inputInt;

        if (inputChecker(inputString, regex)) {
            inputInt = Integer.parseInt(inputString);
        } else {
            return naturalNumberScanner();
        }
        return inputInt;


    }

    private static boolean inputChecker(String inputString, String regex){
        boolean validInput = false;
        if (inputString.matches(regex)){
            correctFormat(inputString);
            validInput= true;
        } else {
            incorrectFormat();
        }
        return validInput;
    }


}
