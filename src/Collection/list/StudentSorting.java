package Collection.list;

import java.util.ArrayList;
import java.util.Collections;

public class StudentSorting {

    public static void main(String[] args) {
        var students = new ArrayList<Student>();
        students.add(new Student("John", 168, 57));
        students.add(new Student("Rohit", 169, 85));
        students.add(new Student("Ram", 164, 12));
        students.add(new Student("WErt", 170, 58));

        Collections.sort(students);
        System.out.println(students);

    }
}
