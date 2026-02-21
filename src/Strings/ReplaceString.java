package Strings;

public class ReplaceString {
    public static void main(String[] args) {
        String originalString = "Hello World!";
        String str1 = originalString.replace("Wolrld", "Universe");
        String str2 = originalString.replace('o', '*');
        String str3 = originalString.replaceAll("l","*");
        String fruits = "apple apple apple banana mango";
        String str4 = fruits.replaceFirst("apple", "grapes");
        String recipe = "Add salt and pepper to taste.";

        System.out.println(recipe.replace("pepper", "cinnamon"));
    }
}
