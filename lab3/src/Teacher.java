import java.time.LocalDate;
public class Teacher  extends Person{
    private int teacherld;
    private SMSConstants.Degree degree;
    private SMSConstants.Rank rank;
    Department dep;
    public Teacher(String nid, String name, LocalDate date, int teacherld, SMSConstants.Degree degree, SMSConstants.Rank rank) {
        super(nid, name, date);
        this.teacherld = teacherld;
        this.degree = degree;
        this.rank = rank;
    }

    public Teacher(String nid, String name, LocalDate date, int teacherld, SMSConstants.Degree degree, SMSConstants.Rank rank, Department dep) {
        super(nid, name, date);
        this.teacherld = teacherld;
        this.degree = degree;
        this.rank = rank;
        this.dep = dep;
    }

    public String toString() {
        return "Teacher{" +
                "teacherld=" + teacherld +
                ", degree=" + degree +
                ", rank=" + rank +
                ", dep=" + dep +
                '}';
    }

    public Department getDep() {
        return dep;
    }

    public void setDep(Department dep) {
        this.dep = dep;
    }
}
