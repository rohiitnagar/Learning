package Abstract;

public abstract class Subject {
    public int marks;
    public static final int MIN_MARKS = 0;


    //We Cannot create object
    //Cannot make private
    //Static abstact method not alloed
    //Cannot make final : inheritance not possible

    //Concrete methods
    public int totalMarks(){
        return  100;
    }

    public abstract  void teach();
}
