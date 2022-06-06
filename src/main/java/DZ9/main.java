package DZ9;

import DZ9.Student.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class main {

    static Set<String> task1(List<StudentClass> students) {
        return students.stream()
                .map(x -> x.getAllCourses())
                .flatMap(x->x.stream())
                .map(x-> x.toString())
                .collect(Collectors.toSet());
    }

    static List<Student> task2 (List<StudentClass> students) {

        List<Student> res = students.stream()
                .sorted((x,y) -> (int) (y.getAllCourses().size() - x.getAllCourses().size()) )
                .limit(3)
                .collect(Collectors.toList());
        return res;
    }

    static List<Student> task3 (List<StudentClass> students, String toFind) {

        List<Student> res = students.stream()
                .filter(x -> x.getAllCourses().toString().contains(toFind))
                .collect(Collectors.toList());
        return res;

    }

    public static void main(String[] args) {
        List<StudentClass> students = new ArrayList<>();
        students.add(new StudentClass("Student1", "course1, course2, course3, course4, course5, course6"));
        students.add(new StudentClass("Student2", "course1, course2, course3, course4, course5"));
        students.add(new StudentClass("Student3", "course1, course2, course3, course4, course5, course6, course7"));
        students.add(new StudentClass("Student4", "course1, course2, course3, course5, course6"));
        students.add(new StudentClass("Student5", "course1, course2, course3, course5"));
        students.add(new StudentClass("Student6", "course2, course3, course5"));
        students.add(new StudentClass("Student7", "course2, course3, course5, course8, course9, course10, course11"));
        System.out.println("Students");
        students.stream().forEach(System.out::println);


        System.out.println("Task №1");
        System.out.println(task1(students));
        System.out.println(students.stream()
                .map(x -> x.getAllCourses())
                .flatMap(x->x.stream())
                .map(x-> x.toString())
                .distinct()
                .collect(Collectors.toList())
        );

        System.out.println("Task №2 ");
        task2(students).stream().forEach(System.out::println);

        System.out.println("Task №3");
        String COURSE_NAME = "course6";
        task3(students,COURSE_NAME).stream().forEach(System.out::println);
    }

}
