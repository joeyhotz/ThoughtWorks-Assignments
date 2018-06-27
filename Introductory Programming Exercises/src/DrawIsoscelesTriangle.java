public class DrawIsoscelesTriangle {
    public static void main() {}

    public static String makeOutputString(int numberOfLines) {
        String output = "";
        for (int y = 0; y < numberOfLines; y++) {
            for (int x = 0; x <= 2*numberOfLines - 1; x++) { //creates x-axis for required number of characters
                output = output.concat("x");
            }
            output = output.concat("\n");
        }
        return output;
    }
}
