package java_lang_object_class;

public class HashCodeEquals {
    public static void main(String[] args) {
    Person p1 = new Person("John", 25, 'M', 345353);
    Person p2 = new Person("John", 25, 'M', 345353);
        System.out.println(p2.hashCode());
        System.out.println(p1.hashCode());
        System.out.println(p2.equals(p1));
        System.out.println(p1);
        System.out.println(p2);
    }
}
