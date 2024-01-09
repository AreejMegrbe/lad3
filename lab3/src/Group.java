import java.util.ArrayList;

public class Group {
    int number;
    Teacher teacher;
    ArrayList<EnrolledStudent>enrolledStudent;
    ArrayList<TimeTable> timeTable=new ArrayList<>();
    CourseInstance courseInstance;
    public Group(int number, Teacher teacher) {
        this.number = number;
        this.teacher = teacher;
    }
    public Group(int number, Teacher teacher, ArrayList<EnrolledStudent> enrolledStudent) {
        this.number = number;
        this.teacher = teacher;
        enrolledStudent=new ArrayList<EnrolledStudent>();
    }

    @Override
    public String toString() {
        return "Group{" +
                "number=" + number +
                ", teacher=" + teacher +
                ", enrolledStudent=" + enrolledStudent +
                ", timeTable=" + timeTable +
                ", courseInstance=" + courseInstance +
                '}';
    }
//  public  Void enrollStudent(Student S){}


}
