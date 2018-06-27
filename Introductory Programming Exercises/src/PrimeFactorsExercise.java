import java.util.ArrayList;

public class PrimeFactorsExercise {
    public static void main() {}

    public static String makeOutputString(int number) {
        String output = "";

        ArrayList<Integer> primeFactors = generate(number);
        for (Integer i : primeFactors) {
            if (primeFactors.indexOf(i) == primeFactors.size() - 1) {
                output = output + i;
            } else {
                output = output + i + ", ";
            }
        }

        return output;
    }

    public static ArrayList<Integer> generate(int number) {
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
