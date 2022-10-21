package com.sparta.francisco.start;

import com.sparta.francisco.display.DisplayManager;
import com.sparta.francisco.exceptions.SorterLoaderException;

import java.util.Scanner;

import static com.sparta.francisco.display.DisplayManager.correctFormat;
import static com.sparta.francisco.display.DisplayManager.incorrectFormat;

public class SortLoader {
    public static void menu() throws SorterLoaderException {
        Scanner input = new Scanner(System.in);
        DisplayManager.printMenu();
        SortFactory.getSorter(numberScanner("Menu"));
        DisplayManager.printArraySizePrompt();
        numberScanner("ArraySize");
    }

    private static String input() {
        Scanner input = new Scanner(System.in);
        return input.nextLine();
    }

    public static int numberScanner(String regexType) {
        String regex = switch (regexType) {
            case "Menu" -> "^[1-7]*$";
            case "NaturalNumber" -> "^[1-9]*$";
            case "ArraySize" -> "^([1-9][0-9]{0,2}|1000)$";
        };
        String inputString = input();

        int inputInt;
        if (inputChecker(inputString, regex)) {
            inputInt = Integer.parseInt(inputString);
        } else {
            return numberScanner(regexType);
        }
        return inputInt;

    }

    private static boolean inputChecker(String inputString, String regex) {
        boolean validInput = false;
        if (inputString.matches(regex)) {
            correctFormat(inputString);
            validInput = true;
        } else {
            incorrectFormat();
        }
        return validInput;
    }


}
