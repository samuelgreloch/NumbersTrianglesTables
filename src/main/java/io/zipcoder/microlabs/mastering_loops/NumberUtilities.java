package io.zipcoder.microlabs.mastering_loops;


public class NumberUtilities {
    public static String getEvenNumbers(int start, int stop) {
        int offset = start % 2 != 0 ? 0 : 1;
        return getRange(start+offset, stop, 2);
    }


    public static String getOddNumbers(int start, int stop) {
        int offset = start % 2 == 0 ? 0 : 1;
        return getRange(start+offset, stop, 2);
    }


    public static String getSquareNumbers(int start, int stop, int step) {
        return getExponentiations(start, stop, step, 2);
    }


    public static String getRange(int start, int stop, int step) {
        String result = "";
        for (int i = start; i < stop; i += step) {
            result += i;
        }
        return result;
    }


    public static String getExponentiations(int start, int stop, int step, int exponent) {
        String result = "";
        for (int i = start; i < stop; i += step) {
            result += (int) Math.pow(i, exponent);
        }
        return result;
    }
}
