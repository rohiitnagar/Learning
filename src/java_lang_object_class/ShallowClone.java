package java_lang_object_class;

public class ShallowClone  {
    public static void main(String[] args) throws CloneNotSupportedException{
        Course course = new Course();
        course.setCourse("Math");

        Student originalStudent = new Student();
        Student clonedStudent = (Student) originalStudent.clone();
        System.out.println(originalStudent == clonedStudent);
        System.out.println(originalStudent.getCourse()==clonedStudent.getCourse());
    }
}
