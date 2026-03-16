package Collection.list;

public class Student implements Comparable<Student> {

    String name;
    int rollNumber;
    int marks;

    public Student(String name, int rollNumber, int marks){
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;

    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", rollNumber=" + rollNumber +
                ", marks=" + marks +
                '}';
    }

    @Override
    public int compareTo(Student student) {
        return Integer.compare(this.marks, student.marks);
    }
}
