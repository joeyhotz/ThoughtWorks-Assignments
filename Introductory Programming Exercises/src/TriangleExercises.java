import java.util.Scanner;

public class TriangleExercises {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = "";
        String output = "";

        System.out.print("Hi! Welcome to my ThoughtWorks Assignment.\nType the corresponding number to view the output for the exercise\n\n");

        while (!input.equals("x")) {
            System.out.print("1: Easiest Exercise Ever\n2: Draw a horizontal line\n3: Draw a vertical line\n4: Draw a right triangle\n\nDIAMOND EXERCISES\n5: Draw Isosceles Triangle\n6: Draw Diamond\n\nChoose program (or \"x\" for the quitters):");
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
                case "x":   output = "Th-th-th-tha-tha-tha-that's all, folks!";
                            break;
                default:    output = "AH I am just a simple stupid computer. Tell me something I know!";
            }
            System.out.print(output + "\n\n\n");
        }
    }
}