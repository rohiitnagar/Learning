package java_lang_object_class;

public class StringDemo {
    public static void main(String[] args) {
        String str = new String("Java");
        String str2 = new String("Java");
        System.out.println(str.toString());
        System.out.println(str.hashCode());
        System.out.println(str2.hashCode());
        System.out.println(str.equals(str2));
    }
}
