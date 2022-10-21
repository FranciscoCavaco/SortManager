package com.sparta.francisco.start;

import com.sparta.francisco.display.DisplayManager;
import com.sparta.francisco.exceptions.SorterLoaderException;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

import static com.sparta.francisco.display.DisplayManager.correctFormat;
import static com.sparta.francisco.display.DisplayManager.incorrectFormat;

public class SortLoader {

    private static final Logger logger = Logger.getLogger("list-logger");
    public static void menu() throws SorterLoaderException {
        Scanner input = new Scanner(System.in);
        DisplayManager.printMenu();
        SortFactory.getSorter(numberScanner("Menu"));
        DisplayManager.printArraySizePrompt();
        arrayInitializer(numberScanner("ArraySize"));
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
            default -> null;
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

    public static int[] arrayInitializer(int numberInput) {
        logger.log(Level.INFO, "Method arrayInitializer started, with input: " + numberInput);
        Random random = new Random();
        int[] unsortedArray = new int[numberInput];
        for (int i = 0; i < numberInput; i++) {
            unsortedArray[i] = random.nextInt(1000)+1;
        }
        logger.log(Level.INFO, "Output list: " + Arrays.toString(unsortedArray));

        return unsortedArray;
    }


}
