public class FizzBuzzGame {
    public static void main() {}

    public static String makeOutputString() {
        String output = "";
        for (int i = 1; i <= 100; i++) {
            //not divisible by 3 or 5
            if (i%3 != 0 && i%5 != 0) {
                output = output + i;
            } else {
                //divisible by 3
                if (i%3 == 0) {
                    output = output + "Fizz";
                }

                //divisible by 5
                if (i%5 == 0) {
                    output = output + "Buzz";
                }
            }
            output = output + "\n";
        }
        return output;
    }
}
