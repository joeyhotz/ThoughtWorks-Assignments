import java.util.Scanner;

public class ThoughtWorksExercises {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = "";
        String output = "";

        System.out.print("Hi! Welcome to my ThoughtWorks Assignment.\nType the corresponding number to view the output for the exercise\n\n");

        while (!input.equals("x")) {
            System.out.print("TRIANGLE EXERCISES\n1: Easiest Exercise Ever\n2: Draw a horizontal line\n3: Draw a vertical line\n4: Draw a right triangle\n\nDIAMOND EXERCISES\n5: Draw Isosceles Triangle\n6: Draw Diamond\n7: Draw Diamond with Name\n\nFIZZBUZZ EXERCISE\n8: FizzBuzz Game\n\nPRIME FACTORS EXERCISE\n9: Prime Factors Exercise\n\nChoose program (or \"x\" for the quitters):");
            input = String.format(scanner.nextLine());

            switch (input) {
                case "1":   output = EasiestExerciseEver.makeOutputString();
                            break;
                case "2":   System.out.print("How many asterisks?: ");
                            output = DrawHorizontalLine.makeOutputString(Integer.parseInt(scanner.nextLine()));
                            break;
                case "3":   System.out.print("How many lines?: ");
                            output = DrawVerticalLine.makeOutputString(Integer.parseInt(scanner.nextLine()));
                            break;
                case "4":   System.out.print("How many lines?: ");
                            output = DrawRightTriangle.makeOutputString(Integer.parseInt(scanner.nextLine()));
                            break;
                case "5":   System.out.print("How many lines?: ");
                            output = DrawIsoscelesTriangle.makeOutputString(Integer.parseInt(scanner.nextLine()));
                            break;
                case "6":   System.out.print("What should the side length be?: ");
                            output = DrawDiamond.makeOutputString(Integer.parseInt(scanner.nextLine()));
                            break;
                case "7":   System.out.print("What is your name?: ");
                            String name = scanner.nextLine();
                            System.out.print("What should the side length be?: ");
                            output = DrawDiamondWithName.makeOutputString(Integer.parseInt(scanner.nextLine()), name);
                            break;
                case "8":   output = FizzBuzzGame.makeOutputString();
                            break;
                case "9":   System.out.print("What is the number to print it's factors for?: ");
                            output = PrimeFactorsExercise.makeOutputString(Integer.parseInt(scanner.nextLine()));
                            break;
                case "x":   output = "Th-th-th-tha-tha-tha-that's all, folks!";
                            break;
                default:    output = "AH I am just a simple stupid computer. Tell me something I know!";
            }
            System.out.print(output + "\n\n\n");
        }
    }
}