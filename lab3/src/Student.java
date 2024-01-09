import java.time.LocalDate;
public class Student  extends Person{
    int studentid;
    SMSConstants.Semester firstSemester;
    int firstYear;
    SMSConstants.StudentTye tye;
    Department dep;

    public Student(String nid, String name, LocalDate date, int studentid, SMSConstants.Semester firstSemester, int firstYear, SMSConstants.StudentTye tye) {
        super(nid, name, date);
        this.studentid = studentid;
        this.firstSemester = firstSemester;
        this.firstYear = firstYear;
        this.tye = tye;
    }
    public String toString() {
        return "Student{" +
                "studentid=" + studentid +
                ", firstSemester=" + firstSemester +
                ", firstYear=" + firstYear +
                ", tye=" + tye +
                ", dep=" + dep +
                '}';
    }

    public void setDep(Department dep)
    {
        this.dep=dep;
    }

    public Department getDep() {
        return dep;
    }
}
