public class CourseInstance {
    int year;
    SMSConstants.Semester semester;

    public CourseInstance(int year, SMSConstants.Semester semester) {
        this.year = year;
        this.semester = semester;
    }
    public String toString() {
        return "CourseInstance{" +
                "year=" + year +
                ", semester=" + semester +
                '}';
    }
}
