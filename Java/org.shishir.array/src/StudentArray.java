import java.util.Arrays;
import java.util.Date;

public class StudentArray {
    private Student[] studentArr;

    public Student[] createStudentArr() {
        studentArr = new Student[5];
        for(int i = 0; i < 5; i++) {
            String firstName = "Shishir "+Integer.toString(i);
            String lastName = "Ria "+Integer.toString(i);
            Date dob = new Date();
            Student student = new Student(firstName, lastName, dob);
            studentArr[i] = student;
        }
        return studentArr;
    }

    @Override
    public String toString() {
        return "StudentArray{" +
                "studentArr=" + Arrays.toString(studentArr) +
                '}';
    }
}
