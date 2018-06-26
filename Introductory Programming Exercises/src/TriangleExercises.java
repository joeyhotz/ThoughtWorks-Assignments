import java.util.Scanner;

public class TriangleExercises {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hi! Welcome to my ThoughtWorks Assignment.");
        System.out.println("Type the corresponding number to view the output for the exercise");
        System.out.println("1: Easiest Exercise Ever");
        System.out.print("Choose program: ");
        String input = String.format(scanner.nextLine());
        String output = "";

        if (input.equals("1")) {
            output = EasiestExerciseEver.makeOutputString();
        }
        System.out.print(output);
    }
}