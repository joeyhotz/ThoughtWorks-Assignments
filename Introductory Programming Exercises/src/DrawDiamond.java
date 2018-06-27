import static java.lang.Math.abs;

public class DrawDiamond {
    public static void main() {}

    public static String makeOutputString(int sideLength) {
        String output = "";
        for (int y = 1; y <= 2*sideLength-1; y++) { //loops through each line
            for (int x = 1; x <= 2*sideLength-1; x++) { //creates x-axis for required number of characters
                int leftMargin = abs(y - sideLength);
                int rightMargin = 2*sideLength - abs(y - sideLength);
                if (x > leftMargin &&  x < rightMargin) {
                    output = output.concat("*");
                } else {
                    output = output.concat(" ");
                }
            }
            output = output.concat("\n");
        }
        return output;
    }
}
