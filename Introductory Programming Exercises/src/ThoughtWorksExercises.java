import java.util.Scanner;
import java.util.regex.Pattern;

public class ThoughtWorksExercises {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Hi! Welcome to my ThoughtWorks Assignment.\nType the corresponding number to view the output for the exercise\n\n");
        String input = "";
        String output = "";

        while (!input.equals("x")) {
            System.out.print("TRIANGLE EXERCISES\n1: Easiest Exercise Ever\n2: Draw a horizontal line\n3: Draw a vertical line\n4: Draw a right triangle\n\nDIAMOND EXERCISES\n5: Draw Isosceles Triangle\n6: Draw Diamond\n7: Draw Diamond with Name\n\nFIZZBUZZ EXERCISE\n8: FizzBuzz Game\n\nPRIME FACTORS EXERCISE\n9: Prime Factors Exercise\n\nType exercise number (or \"x\" for the quitters): ");
            input = String.format(scanner.nextLine());
            output = menu(input);

            //Program menu
            if (Pattern.matches("^[1-9]$", input)) {
                System.out.print("\n=== RESULT ===\n\n\n" + output + "\n\n\n\nAgain?\n\n");
            } else if (input.equals("x")) {
                System.out.print("\n\n" + output + "\n\n");
            } else {
                System.out.print("\nIncorrect input. Please enter a number between 1-9 or 'x'\nPlease try again.\n\n");
            }
        }
    }

    private static String menu(String input) {
        //The menu - returns the string to output
        String output = "";
        int number;

        switch (input) {
            case "1":   output = EasiestExerciseEver.makeOutputString();
                break;
            case "2":   number = askForNumberInput("How many asterisks?: ");
                output = DrawHorizontalLine.makeOutputString(number);
                break;
            case "3":   number = askForNumberInput("How many lines?: ");
                output = DrawVerticalLine.makeOutputString(number);
                break;
            case "4":   number = askForNumberInput("How many lines?: ");
                output = DrawRightTriangle.makeOutputString(number);
                break;
            case "5":   number = askForNumberInput("How many lines?: ");
                output = DrawIsoscelesTriangle.makeOutputString(number);
                break;
            case "6":   number = askForNumberInput("What should the side length be?: ");
                output = DrawDiamond.makeOutputString(number);
                break;
            case "7":   System.out.print("What is your name?: ");
                String name = scanner.nextLine();
                number = askForNumberInput("What should the side length be?: ");
                output = DrawDiamondWithName.makeOutputString(number, name);
                break;
            case "8":   output = FizzBuzzGame.makeOutputString();
                break;
            case "9":   number = askForNumberInput("What is the number to print it's factors for?: ");
                output = PrimeFactorsExercise.makeOutputString(number);
                break;
            case "x":   output = "Th-th-th-tha-tha-tha-that's all, folks!";
                break;
            default:    output = "AH I am just a simple stupid computer. Tell me something I know!";
                break;
        }
        return output;
    }

    private static int askForNumberInput(String label) {
        System.out.print(label);
        String number = scanner.nextLine();
        while (Pattern.matches("[^1-9]*", number)) {
            System.out.print("Please only enter a number: ");
            number = scanner.nextLine();
        }
        return Integer.parseInt(number);
    }
}

