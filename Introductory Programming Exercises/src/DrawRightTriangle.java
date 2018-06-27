public class DrawRightTriangle {

    public static String makeOutputString(int numberOfLines) {
        String output = "";
        for (int i = 0; i < numberOfLines; i++) { //loop to loop through each line
            for (int x = 0; x < i + 1; x++) { //loop to draw the different amount of astericks on each line
                output = output.concat("*");
            }
            output = output.concat("\n");
        }

        return output;
    }
}
