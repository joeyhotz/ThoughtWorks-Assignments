public class DrawHorizontalLine {
    public static void main() {

    }

    public static String makeOutputString(int numberOfAsterisks) {
        String output = "";
        for (int i = 0; i < numberOfAsterisks; i++) {
            output = output.concat("*");
        }
        return output;
    }
}
