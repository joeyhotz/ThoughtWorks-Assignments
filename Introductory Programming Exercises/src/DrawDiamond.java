import static java.lang.Math.abs;

public class DrawDiamond {

    public static String makeOutputString(int sideLength) {
        String output = "";
        for (int y = 1; y <= 2*sideLength-1; y++) { //loops through each line (the y axis of the grid)
            for (int x = 1; x <= 2*sideLength-1; x++) { //loops through each x spot (the x axis of the grid)
                int leftMargin = abs(y - sideLength);
                int rightMargin = 2*sideLength - abs(y - sideLength);
                if (x > leftMargin &&  x < rightMargin) {
                    output = output.concat("*");
                } else {
                    output = output.concat(" ");
                }
            }
            if (y != 2*sideLength-1) output = output.concat("\n"); //if its not the last line
        }
        return output;
    }
}
