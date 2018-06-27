import java.util.ArrayList;

public class PrimeFactorsExercise {

    public static String makeOutputString(int number) {
        //uses the generate function to make a string to view all the prime factors of the inputted number
        String output = "";

        ArrayList<Integer> primeFactors = generate(number);
        for (Integer i : primeFactors) {
            output = output + i + ", ";
        }
        output = output.substring(0, output.length()-2); //cuts the ', ' off the last element
        return output;
    }

    private static ArrayList<Integer> generate(int number) {
        ArrayList<Integer> output = new ArrayList<Integer>();

        for (int i = 2; i <= number; i++) {
            while (number%i == 0) {
                output.add(i);
                number /= i;
            }
        }

        return output;
    }
}
