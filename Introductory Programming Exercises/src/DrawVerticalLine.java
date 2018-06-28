public class DrawVerticalLine {

    public static String makeOutputString(int numberOfLines) {
        String output = "";
        for (int i = 0; i < numberOfLines; i++) {
            output = output.concat("*\n");
        }
        output = output.substring(0,output.length() - 1);

        return output;
    }
}
