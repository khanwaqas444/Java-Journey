package corejava.Poly;

import java.util.Arrays;
import java.util.List;

public class AsArray {

    public static void main(String[] args) {
        List<String> studentsList = Arrays.asList("Animesh", "prachi", "Rahul", "Lalita");

        List<String> firstThreeStudents = studentsList.subList(0, 3);
        System.out.println("First three students : " + firstThreeStudents);
    }
}
