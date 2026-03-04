package java_lang_object_class;

public class Course implements Cloneable {

    private String course;
    public String getCourse() {
        return course;
    }

    public void setCourse(String course){
        this.course = course;
    }

    @Override
    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }


}
