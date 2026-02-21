package Strings;

public class StringFormat {
    public static void main(String[] args) {
        String message = "Hello, %s you have %d new messages";
        String messageUser1 = String.format(message,"User1", 3);
        String messageUser2 = String.format(message,"User2", 6);

        String message2 = "The price is %.2f";
        String price1 = String.format(message2, 20.999);
        String price2 = String.format(message2, 21.0);

        String message3 = "The number is %20d";
        String num1 = String.format(message3, 20);
        String num2 = String.format(message3, 21);

    }
}
