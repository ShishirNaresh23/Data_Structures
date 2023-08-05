import java.util.Date;
import java.util.Objects;

public class Student {
    private String first_name;
    private String last_name;
    private Date dob;

    Student(String firstName, String lastName){
        this.first_name = firstName;
        this.last_name = lastName;
    }

    Student(String firstName, String lastName, Date dob){
        this.first_name = firstName;
        this.last_name = lastName;
        this.dob = dob;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(first_name, student.first_name) && Objects.equals(last_name, student.last_name) && Objects.equals(dob, student.dob);
    }

    @Override
    public int hashCode() {
        return Objects.hash(first_name, last_name, dob);
    }

    @Override
    public String toString() {
        return "Student{" +
                "first_name='" + first_name + '\'' +
                ", last_name='" + last_name + '\'' +
                ", dob=" + dob +
                '}';
    }
}
