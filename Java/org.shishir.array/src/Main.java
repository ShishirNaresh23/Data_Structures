import java.util.Arrays;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Opt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.println("Working on Arrays");

//        ArrayMinMax arrayMinMax = new ArrayMinMax(new Integer[]{1,2,3,4,5,-1, -100, 100001});
//        ArrayMissingEle arrayMissingEle = new ArrayMissingEle(new Integer[]{1,2,3,4,5,6});
//        System.out.println("Missing Array Element");
//        System.out.println(arrayMissingEle.missingEle());
//        System.out.println("============================");

        StudentArray studentArr = new StudentArray();
        studentArr.createStudentArr();
        System.out.println(studentArr.toString());

    }
}