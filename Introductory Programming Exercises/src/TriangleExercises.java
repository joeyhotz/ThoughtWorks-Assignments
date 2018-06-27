import java.util.Scanner;

public class TriangleExercises {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Hi! Welcome to my ThoughtWorks Assignment.\nType the corresponding number to view the output for the exercise\n\n");
        System.out.print("1: Easiest Exercise Ever\n\n");
        System.out.print("Choose program (or \"x\" for the quitters): ");
        String input = String.format(scanner.nextLine());
        String output = "";
        while (input != "x") {
            switch (input) {
                case "1":   output = EasiestExerciseEver.makeOutputString();
                            break;
                case "x":   output = "That's all folks!";
                            break;
            }
            System.out.print(output + "\n\n");
            System.out.print("Choose program (or \"x\" for the quitters): ");
            input = String.format(scanner.nextLine());
        }
    }
}