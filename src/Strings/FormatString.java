package Strings;

public class FormatString {
    
    public static void main (String[] args) {
        
        String item = "bananas";
        int quantity = 7;
        double pricePerUnit = 1.99;
        // Write your code below
        
        System.out.printf("Don't forget to buy %d %s at $%.2f each!", quantity,item,pricePerUnit);
        
    }

}