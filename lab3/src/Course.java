public class Course {
    String code;
    String name;
    int credits;
    int hoursTheory;
    int hoursPractice;
    Department dep;

    public Course(String code, String name, int credits, int hoursTheory, int hoursPractice) {
        this.code = code;
        this.name = name;
        this.credits = credits;
        this.hoursTheory = hoursTheory;
        this.hoursPractice = hoursPractice;
    }

    public Course(String code, String name, int credits, int hoursTheory, int hoursPractice, Department dep) {
        this.code = code;
        this.name = name;
        this.credits = credits;
        this.hoursTheory = hoursTheory;
        this.hoursPractice = hoursPractice;
        this.dep = dep;
    }

    public String toString() {
        return "Course{" +
                "code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", credits=" + credits +
                ", hoursTheory=" + hoursTheory +
                ", hoursPractice=" + hoursPractice +
                '}';
    }
}
