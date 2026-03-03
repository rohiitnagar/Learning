package java_lang_object_class;


import Inheritance.Person;

public class GetClass {
    public static void main(String[] args) {
        Person person = new Person();
        Class prsnclass = person.getClass();
        System.out.println(prsnclass.getName());
        System.out.println(prsnclass.getSimpleName());
        System.out.println(prsnclass.getPackageName());
    }
}
