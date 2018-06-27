public class DrawDiamond {
    public static void main() {}

    public static String makeOutputString(int sideLength) {
        String output = "";
        for (int y = 1; y <= 2*sideLength-1; y++) { //loops through each line
            for (int x = 1; x <= 2*sideLength-1; x++) { //creates x-axis for required number of characters
                output = output.concat("*");
            }
            output = output.concat("\n");
        }
        return output;
    }
}
