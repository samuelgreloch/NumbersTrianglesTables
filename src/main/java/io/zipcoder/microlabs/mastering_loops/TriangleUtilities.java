package io.zipcoder.microlabs.mastering_loops;

public class TriangleUtilities {

    public static String getTriangle(int numberOfRows) {
        String result = "";
        for(int i=1; i<numberOfRows; i++) {
            result += getRow(i) + "\n";
        }
        return result;
    }

    public static String getRow(int numberOfStars) {
        String result = "";
        for(int k=0; k<numberOfStars; k++) {
            result += "*";
        }
        return result;
    }

    public static String getSmallTriangle() {
        return getTriangle(5);
    }


    public static String getLargeTriangle() {
        return getTriangle(10);
    }
}
