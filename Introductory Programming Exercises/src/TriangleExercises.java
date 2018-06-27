import java.util.Scanner;

public class TriangleExercises {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = "";
        String output = "";

        System.out.print("Hi! Welcome to my ThoughtWorks Assignment.\nType the corresponding number to view the output for the exercise\n\n");

        while (!input.equals("x")) {
            input = "";
            System.out.print("1: Easiest Exercise Ever\n2: Draw a horizontal line\n3: Draw a vertical line\n4: Draw a right triangle\n\n");
            System.out.print("Choose program (or \"x\" for the quitters): ");
            input = String.format(scanner.nextLine());

            switch (input) {
                case "1":   output = EasiestExerciseEver.makeOutputString();
                            break;
                case "2":   System.out.print("How many asterisks?: ");
                            int numberOfAsterisks = Integer.parseInt(scanner.nextLine());
                            output = DrawHorizontalLine.makeOutputString(numberOfAsterisks);
                            break;
                case "3":   System.out.print("How many lines?: ");
                            int numberOfLinesVertical = Integer.parseInt(scanner.nextLine());
                            output = DrawVerticalLine.makeOutputString(numberOfLinesVertical);
                            break;
                case "4":   System.out.print("How many lines?: ");
                            int numberOfLinesRightTriangle = Integer.parseInt(scanner.nextLine());
                            output = DrawRightTriangle.makeOutputString(numberOfLinesRightTriangle);
                            break;
                case "x":   output = "That's all folks!";
                            break;
            }
            System.out.print(output + "\n\n\n");
        }
    }
}