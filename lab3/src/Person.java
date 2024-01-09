import java.time.LocalDate;
public class Person {
    String nid;
    String name;
    LocalDate date;

    public Person(String nid, String name, LocalDate date)
    {
        this.nid = nid;
        this.name = name;
        this.date = date;
    }
    public String toString() {
        return "Person{" +
                "nid='" + nid + '\'' +
                ", name='" + name + '\'' +
                ", date=" + date +
                '}';
    }
}
