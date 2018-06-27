public class DrawVerticalLine {
    public static void main() {}

    public static String makeOutputString(int numberOfLines) {
        String output = "";
        for (int i = 0; i < numberOfLines; i++) {
            output = output.concat("*\n");
        }

        return output;
    }
}
