package Strings;

public class Parse {
    public static void main(String[] args) {
        String number = "123";
        int parsedNum = Integer.parseInt(number);

        String floatN = "4.99";
        float parsedFloat = Float.parseFloat(floatN);

        String priceInString = "999.99";
        double price = Double.parseDouble(priceInString);
        String longString = "435354543534";
        long parsedLong = Long.parseLong(longString);

        String hello = "Hello";
        char[] charArray = hello.toCharArray();
    }
}
