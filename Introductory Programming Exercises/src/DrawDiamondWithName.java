import static java.lang.Math.abs;

public class DrawDiamondWithName {

    public static String makeOutputString(int sideLength, String name) {
        String output = "";
        for (int y = 1; y <= 2*sideLength-1; y++) { //loops through each line
            for (int x = 1; x <= 2*sideLength-1; x++) { //creates x-axis for required number of characters
                int leftMargin = abs(y - sideLength);
                int rightMargin = 2*sideLength - abs(y - sideLength);
                if (y == sideLength) {
                    output = output.concat(name);
                    break;
                } else if (x > leftMargin &&  x < rightMargin) {
                    output = output.concat("*");
                } else {
                    output = output.concat(" ");
                }
            }
            if (y != 2*sideLength-1) output = output.concat("\n"); //stops adding a new line if its the last line
        }
        return output;
    }
}
