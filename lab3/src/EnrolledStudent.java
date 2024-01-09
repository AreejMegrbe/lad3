public class EnrolledStudent {
     private float mindTermGreade;
     private float finalGrade;
     private  Student student;
    public EnrolledStudent(float mindTermGreade, float finalGrade, Student student) {
        this.mindTermGreade = mindTermGreade;
        this.finalGrade = finalGrade;
        this.student = student;
    }

    @Override
    public String toString() {
        return "EnrolledStudent{" +
                "mindTermGreade=" + mindTermGreade +
                ", finalGrade=" + finalGrade +
                ", student=" + student +
                '}';
    }
}
