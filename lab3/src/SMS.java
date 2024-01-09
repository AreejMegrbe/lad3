import java.time.LocalDate;
import java.util.ArrayList;

public class SMS {
    public static void main(String args[]) {
        // إنشاء كائنين من قسم الرياضيات والحاسب
        Department mathDepartment = new Department(1111, "math");
        Department computerDepartment = new Department(2222, "computer");

        // إنشاء قائمة لتخزين الأساتذة
        ArrayList<Teacher> arrayOfTeachers = new ArrayList<Teacher>();

        // إنشاء كائنات لتمثيل الأساتذة
        Teacher firstMath = new Teacher("111000", "areej", LocalDate.parse("1999-04-05"), 100000, SMSConstants.Degree.master, SMSConstants.Rank.lecturer, mathDepartment);
        Teacher secondMath = new Teacher("222000", "ahmed", LocalDate.parse("2000-06-09"), 20000, SMSConstants.Degree.PhD, SMSConstants.Rank.Assistant_lecturer, mathDepartment);
        Teacher firstComp = new Teacher("333000", "arwa", LocalDate.parse("2023-09-08"), 30000, SMSConstants.Degree.master, SMSConstants.Rank.Assistant_Profrssor, computerDepartment);
        Teacher secondComp = new Teacher("44400", "AYA", LocalDate.parse("1998-08-07"), 40000, SMSConstants.Degree.master, SMSConstants.Rank.Professor, computerDepartment);

        // إضافة الأساتذة إلى قائمة الأساتذة
        arrayOfTeachers.add(firstMath);
        arrayOfTeachers.add(secondMath);
        arrayOfTeachers.add(firstComp);
        arrayOfTeachers.add(secondComp);

        // إنشاء قائمة لتخزين الطلاب
        ArrayList<Student> arrayOfStudents = new ArrayList<Student>();

        // إنشاء كائنات لتمثيل الطلاب
        Student firstStudent = new Student("100", "ahmed", LocalDate.parse("2023-01-20"), 0, SMSConstants.Semester.fall, 1999, SMSConstants.StudentTye.PhD);
        Student secondStudent = new Student("200", "sirwa", LocalDate.parse("2000-07-14"), 0, SMSConstants.Semester.spring, 2000, SMSConstants.StudentTye.master);

        // إضافة الطلاب إلى قائمة الطلاب
        arrayOfStudents.add(firstStudent);
        arrayOfStudents.add(secondStudent);

        // يمكنك استخدام قائمة الأساتذة وقائمة الطلاب كما تشاء في الأكواد التالية
        for (Teacher teacher : arrayOfTeachers) {

            System.out.println(teacher.toString());

        }
        for (Student student : arrayOfStudents) {
            System.out.println( student.toString());

        }

    }
    }
