package java_lang_object_class;

public class Clone {
    public static void main(String[] args) throws CloneNotSupportedException {
        Person p1 = new Person("John", 25,'M',3422433);
        Person p2 = p1;
        p2.setName("John Doe");
        System.out.println(p1.getName());
        Person p3 = (Person)p1.clone();
        System.out.println(p1.getName());
        p3.setName("Rohit");
        System.out.println(p3.getName());

    }
}
