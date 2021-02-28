package com.zipcodewilmington.scientificcalculator;

import com.sun.codemodel.internal.JWhileLoop;

/**
 * Created by leon on 2/9/18.
 */
public class MainApplication {
    public static boolean startLoop = true;
    private static String currentMode = "binary";
    private static String currentUnit = "degrees";
    private static double currentValue = 0.0; // Current Value
    private static double memoryValue = 0.0;  // Value Stored in Memory
    private static String displayValue = ""; //String.valueOf(currentValue)


    public static void main(String[] args) {

        Console.println("Welcome to my calculator!");
        Console.println("What operation would you like to perform?");

        while (startLoop) {
            Console.println("SYSTEM OPERATIONS: 0-Clear Display");
            Console.println("ARITHMETIC OPERATIONS: 1-Add 2-Subtract 3-Multiple 4-Divide");
            Console.println("ADVANCED OPERATIONS: 5-Square 6-Square Root 7-Exponentiation 8-Inverse 9-Change Sign 10-Factorial");
            Console.println("TRIG FUNCTIONS: 11-Sine 12-Cosine 13-Tangent");
            Console.println("INVERSE TRIG FUNCTIONS: 14-Inverse Sine 15-Inverse Cosine 16-Inverse Tangent");
            Console.println("SWITCH TRIG UNITS: 17-Switch Trig Units 18-Select Trig Units");
            Console.println("LOGARITHMIC FUNCTIONS: 19-Log 20-Inverse Log 21-Natural Log 22-Inverse Natural Log");
            Console.println("MEMORY FUNCTIONS: 23-Clear memory 24-Add value to memory 25-Recall memory");
            Console.println("DISPLAY CHANGES: 26-Switch Display Mode 27-Choose Display Mode");
            Console.println("99-EXIT CALCULATOR");
            Console.println("Current Display: " + displayValue);


            Integer choice = Console.getIntegerInput("Enter the number of the operation you want to perform.");

            switch (choice) {
                case 0:
                    clearDisplay();
                    System.out.println(displayValue);
                case 1:
                    userInputDouble = Console.getDoubleInput("Enter first number");
                    userInputDouble2 = Console.getDoubleInput("Enter second number");
                    findSum(userInputDouble, userInputDouble2);
                    System.out.println(displayValue);
                    break;
                 case 2:
                     userInputDouble = Console.getDoubleInput("Enter first number");
                     userInputDouble2 = Console.getDoubleInput("Enter second number");
                     findDifference(userInputDouble, userInputDouble2);
                     System.out.println(displayValue);
                     break;
                 case 3:
                     userInputDouble = Console.getDoubleInput("Enter first number");
                     userInputDouble2 = Console.getDoubleInput("Enter second number");
                     findProduct(userInputDouble, userInputDouble2);
                     System.out.println(displayValue);
                     break;
                 case 4:
                     userInputDouble = Console.getDoubleInput("Enter first number");
                     userInputDouble2 = Console.getDoubleInput("Enter second number");
                     findQuotient(userInputDouble, userInputDouble2);
                     System.out.println(displayValue);
                     break;
                case 10:
                    userInputDouble = Console.getDoubleInput("Enter a number");
                    findFactorial(userInputDouble);
                    break;
                case 11:
                    userInputDouble = Console.getDoubleInput("Enter a number");
                    getSin(userInputDouble);
                    System.out.println(displayValue);
                    break;
                case 12:
                    userInputDouble = Console.getDoubleInput("Enter a number");
                    getCos(userInputDouble);
                    System.out.println(displayValue);
                    break;
                case 13:
                    userInputDouble = Console.getDoubleInput("Enter a number");
                    getTan(userInputDouble);
                    System.out.println(displayValue);
                    break;
                case 14:
                    userInputDouble = Console.getDoubleInput("Enter a number");
                    getAsin(userInputDouble);
                    System.out.println(displayValue);
                    break;
                case 15:
                    userInputDouble = Console.getDoubleInput("Enter a number");
                    getAcos(userInputDouble);
                    System.out.println(displayValue);
                    break;
                case 16:
                    userInputDouble = Console.getDoubleInput("Enter a number");
                    getAtan(userInputDouble);
                    System.out.println(displayValue);
                    break;
                case 17:
                    switchUnitsMode();
                    break;
                case 18:
                    String trigMode = Console.getStringInput("Enter the desired trig units mode");
                    switchUnitsMode(trigMode);
                    break;
                case 19:
                    userInputDouble = Console.getDoubleInput("Enter a number");
                    logarithm(userInputDouble);
                    System.out.println(displayValue);
                    break;
                case 20:
                    userInputDouble = Console.getDoubleInput("Enter a number");
                    invLog(userInputDouble);
                    System.out.println(displayValue);
                    break;
                case 21:
                    userInputDouble = Console.getDoubleInput("Enter a number");
                    natLog(userInputDouble);
                    System.out.println(displayValue);
                    break;
                case 22:
                    userInputDouble = Console.getDoubleInput("Enter a number");
                    invNatLog(userInputDouble);
                    System.out.println(displayValue);
                    break;
                case 23:
                    clearMemory();
                    break;
                case 24:
                    addCurrentValueToMemory();
                    break;
                case 25:
                    recallMemoryValue();
                    break;
                case 26:
                    switchDisplayMode();
                    break;
                case 27:
                    String mode = Console.getStringInput("Enter the desired mode");
                    switchDisplayMode(mode);
                    break;
                case 98:
                    userInputDouble = Console.getDoubleInput("Enter a number as a double");
                    setCurrentValue(userInputDouble);
                    break;
                case 99:
                    startLoop = false;
                    System.out.println("Goodbye");
                    break;
                case 100:
                    playGame();
                    break;
                default:
                    System.out.println("Invalid choice! Please enter a valid number.");
                    break;
            }
        }
    }


    public static double userInputDouble = 0.0;
    public static double userInputDouble2 = 0;

    public static void clearDisplay(){
        currentValue = 0;
        displayValue = String.valueOf(currentValue);
    }

    //IM A BASIC B
    public static double findSum(double a, double b) {
        currentValue = a + b;
        displayValue = String.valueOf(currentValue);
        return currentValue;
    }

    public static double findDifference(double a, double b) {
        currentValue = a - b;
        displayValue = String.valueOf(currentValue);
        return currentValue;
    }

    public static double findProduct(double a, double b) {
        currentValue = a * b;
        displayValue = String.valueOf(currentValue);
        return currentValue;
    }

    public static double findQuotient(double a, double b) {
        if (b != 0){
        currentValue = a / b;
        displayValue = String.valueOf(currentValue);
        } else displayValue = "Err";

        return currentValue;
    }

    public static double findRemainder(double a, double b) {
        currentValue = a % b;
        displayValue = String.valueOf(currentValue);
        return currentValue;
    }

    // MEMORY
    // public static Double acceptUserInput()

    public static double getMemoryValue() {
        displayValue = String.valueOf(memoryValue);
        return memoryValue;
    }

    // Set the current value
    public static double setCurrentValue(double input) {
        currentValue = input;
        displayValue = String.valueOf(currentValue);
        return currentValue;
    }

    // Return the current value
    public static double returnCurrentValue() {
        displayValue = String.valueOf(currentValue);
        return currentValue;
    }

    // M+ KEY: Recall current value from memory to the display
    public static double recallMemoryValue() {
        displayValue = String.valueOf(memoryValue);
        return memoryValue;
    }

    // MC KEY: Reset the memory & Clear Display
    public static double clearMemory() {
        memoryValue = 0.0;
        displayValue = String.valueOf(memoryValue);
        return memoryValue;
    }


    // MC+ KEY: Add currently displayed value to the value in memory & clear display
    public static double addCurrentValueToMemory() {
        memoryValue = currentValue;
        currentValue = 0.0;
        displayValue = String.valueOf(currentValue);
        return currentValue;
    }

    // BASIC CALCULATOR OPERATIONS


    // SCIENTIFIC CALCULATOR OPERATIONS

    // Find the factorial of a number
    public static double findFactorial(double userInput) {
        double factorial = userInput;
        for (int i = 1; i < factorial; i++) {
            userInput *= i;
        }

        setCurrentValue(userInput);
        displayValue = String.valueOf(currentValue);
        System.out.println(currentValue);
        return currentValue;
    }


    //Following methods take a value (num1) for the log equations.
    //Logarithms

    //Takes a value for num2 for the log equation. num1 is not used in this case

    public static double logarithm(double num1) {
        double newNum = Math.log10(num1);
        displayValue = String.valueOf(newNum);
        return newNum;
    }

    //Inverted Logs


    public static double invLog(double num1) {
        double newNum = Math.pow(10,num1);
        displayValue = String.valueOf(newNum);
        return newNum;

    }
    //Natural Logs
    public static double natLog(double num1) {
        double newNum = Math.log(num1);
        displayValue = String.valueOf(newNum);
        return newNum;
    }
    //Inverted Natural Logs


    public static double invNatLog(double num1) {
        double newNum = Math.pow(Math.E,num1);
        displayValue = String.valueOf(newNum);
        return newNum;
    }



    //DISPLAY CHANGES

    public static void getMode() {
        displayValue = String.valueOf(currentMode);
        System.out.println(currentMode);
    }
    //public void setMode(String newMode){currentMode = newMode;}

    public static String switchDisplayMode() {

        if (currentMode.equals("binary")) {
            currentMode = "octal";
            displayValue = currentMode;
            System.out.println("octal");
        } else if (currentMode.equals("octal")) {
            currentMode = "decimal";
            displayValue = currentMode;
            System.out.println("decimal");
        } else if (currentMode.equals("decimal")) {
            currentMode = "hexadecimal";
            displayValue = currentMode;
            System.out.println("hexadecimal");
        } else if (currentMode.equals("hexadecimal")) {
            currentMode = "binary";
            displayValue = currentMode;
            System.out.println("binary");
        } else
            displayValue = "Err";
            System.out.println("Err");
        return currentMode;
    }


    public static String switchDisplayMode(String mode) {

        if (mode.equals("binary")) {
            currentMode = "binary";
            displayValue = currentMode;
        } else if (mode.equals("octal")) {
            currentMode = "octal";
            displayValue = currentMode;
        } else if (mode.equals("decimal")) {
            currentMode = "decimal";
            displayValue = currentMode;
        } else if (mode.equals("hexadecimal")) {
            currentMode = "hexadecimal";
            displayValue = currentMode;
        } else mode = "Err";
        displayValue = mode;
        System.out.println(mode);
        return mode;
    }

    //UNIT CHANGES

    public static void getUnit() {
        displayValue = currentMode;
        System.out.println(currentUnit);
    }

    public static String switchUnitsMode() {
        if (currentUnit.equals("degrees")) {
            currentUnit = "radians";
            displayValue = currentUnit;
            System.out.println("radians");
        } else if (currentUnit.equals("radians")) {
            currentUnit = "degrees";
            displayValue = currentUnit;
            System.out.println("degrees");
        } else
            System.out.println("Err");
            displayValue = "Err";

        return currentUnit;
    }

    public static String switchUnitsMode(String mode) {
        if (mode.equals("degrees")) {
            currentUnit = "degrees";
            displayValue = currentUnit;
        } else if (mode.equals("radians")) {
            currentUnit = "radians";
            displayValue = currentUnit;
        } else mode = "Err";
        displayValue = mode;
        System.out.println(mode);
        return mode;
    }
    // TRIG FUNCTIONS

    public static double getSin (double a) {
        double b=Math.toRadians(a);
        currentValue = (Math.sin(b));
        displayValue = String.valueOf(currentValue);
        return currentValue;
    }



    public static double getSinPi (double a) {
        //double b=Math.toRadians(a);
        System.out.println(Math.sin(a));
        return (Math.sin(a));
    }


    public static double getCos(double a) {
        double b=Math.toRadians(a);
        currentValue = (Math.cos(b));
        displayValue = String.valueOf(currentValue);
        return currentValue;
    }


    public static double getCosPi (double a) {
        //double b=Math.toRadians(a);
        System.out.println(Math.cos(a));
        return (Math.cos(a));
    }


    public static double getTan(double a) {
        double b=Math.toRadians(a);
        currentValue = (Math.tan(b));
        displayValue = String.valueOf(currentValue);
        return currentValue;
    }

    public static double getAsinPi(double a) {
        currentValue = (Math.asin(a));
        displayValue = String.valueOf(currentValue);
        return currentValue;
    }

    public static double getAsin(double a) {
        double b=Math.toRadians(a);
        currentValue = (Math.asin(b));
        displayValue = String.valueOf(currentValue);
        return currentValue;
    }

    public static double getAcos (double a){
        double b=Math.toRadians(a);
        currentValue = (Math.acos(b));
        displayValue = String.valueOf(currentValue);
        return currentValue;
    }

    public static double getAtan (double a){
        currentValue = (Math.atan(a));
        displayValue = String.valueOf(currentValue);
        return currentValue;
    }


    // ADVANCED FUNCTIONS

    // Invert sign
    public double getSignInversion(double num1)
    {
        double newNum = num1 * -1;
        System.out.println(newNum);
        return newNum;
    }

    // O as input exception
    public double getSignInversion0(double num1) {
        System.out.println(num1);
        return 0.0;
    }

    // Compute square
    public double getSquare(double num1)
    {
        double newNum = num1 * num1;
        System.out.println(newNum);
        return newNum;
    }

    // Square Root
    public double getSquareRoot(double num1)
    {
        if (num1 >= 0) {
            double newNum = Math.sqrt(num1);
            System.out.println(newNum);
            return newNum;
        } else {
            System.out.println("Invalid number");
            return num1;
        }

    }

    // Exponentiation
    public double getExponentiation(double num1, double num2)
    {
        double newNum = Math.pow(num1, num2);
        System.out.println(newNum);
        return newNum;
    }

    // Inverse (1/x)
    public double getInverse(double num1)
    {
        if (num1 != 0) {
            double newNum = 1 / num1;
            System.out.println(newNum);
            return newNum;
        } else {
            System.out.println("Err");
            return num1;
        }

    }

    //'Rock,Paper,Scissors' game.
    public static void playGame() {
        boolean gameOn = true;
        double userChoice = 0;
        double continueGame = 0;
        double score = 0;
        double gamesPlayed = 0;
        String computerMove = "";
        String userMove = "";



        while(gameOn) {
            System.out.println("Let's play a game!");
            System.out.println("0 = Rock, 1 = Paper, 2 = Scissors");
            userChoice = Console.getDoubleInput("Enter your selection.");

            double computerDub = (Math.random() * 3);

            if ((computerDub >= 0) && (computerDub < 1)) {
                computerMove = "Rock";
            } else if ((computerDub >= 1) && (computerDub < 2)) {
                computerMove = "Paper";
            } else if ((computerDub >= 2) && (computerDub < 3)) {
                computerMove = "Scissors";
            } else {
                computerMove = "Invalid, choose 0,1,2";
            }

            if (userChoice == 0) {
                userMove = "Rock";
            } else if (userChoice == 1) {
                userMove = "Paper";
            } else if (userChoice == 2) {
                userMove = "Scissors";
            } else {
                System.out.println("Invalid, choose 0,1,2"); continue;
            }
            //System.out.println(computerDub);

            System.out.println("You play: " + userMove);
            System.out.println("I play: " + computerMove);
            int computerInt = (int) computerDub;
            int userInt = (int) userChoice;

            switch (userInt) {
                case 0:
                    if (userInt == computerInt) {
                        System.out.println("We tied!");
                    } else if (computerInt == 1) {
                        System.out.println("Sorry, you lose!");
                    } else { score++;
                        System.out.println("Congratulations, you win!");
                    }
                    break;
                case 1:
                    if (userInt == computerInt) {
                        System.out.println("We tied!");
                    } else if (computerInt == 0) {
                        score++;
                        System.out.println("Congratulations, you win!");
                    } else {
                        System.out.println("Sorry! You lose!");
                    }
                    break;
                case 2:
                    if (userInt == computerInt) {
                        System.out.println("We tied");
                    } else if (computerInt == 0) {
                        System.out.println("Sorry, you lose!");
                    } else {
                        score++;
                        System.out.println("Congratulations, you win!");
                    }
                    break;

            }
            gamesPlayed++;

            System.out.println("You won " + score + " / " + gamesPlayed + "!");
            System.out.println("Play again? 1 - Yes or 2 - No");
            continueGame = Console.getDoubleInput("Enter your selection.");

            boolean validInput = true;
            while (validInput) {
                if (continueGame == 1) {
                    gameOn = true;
                    break;
                } else if (continueGame == 2) {
                    gameOn = false;
                    break;
                } else System.out.println("Invalid selection: Please choose 1 - Yes or 2 - No");
                continueGame = Console.getDoubleInput("");
            }

        }

    }


}


