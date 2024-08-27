package Comparater;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentRunner {

    public static void main(String[] args) {
        List<Student> students = List.of(
                new Student("pramod", 25),
                new Student("manu", 24),
                new Student("adam", 26),
                new Student("eve", 27)
        );
        System.out.println(students);

        ArrayList<Student> studentAl = new ArrayList<>(students);

        Collections.sort(studentAl);

        System.out.println(studentAl);

        Collections.sort(studentAl, new DescandingComparatorForStudent());

        System.out.println(studentAl);

        studentAl.sort(new DescandingComparatorForStudent());

        System.out.println(studentAl);

    }
}
