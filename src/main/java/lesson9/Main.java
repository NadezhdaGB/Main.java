package lesson9;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Course> courses = new ArrayList<>(Arrays.asList(
                new Course("Астрономия"),
                new Course("Робототехника"),
                new Course("Макраме"),
                new Course("Садоводство")
        ));
        List<Course> courses1 = new ArrayList<>(Arrays.asList(
                new Course("Робототехника"),
                new Course("Макраме"),
                new Course("Садоводство")
        ));
        List<Course> courses2 = new ArrayList<>(Arrays.asList(
                new Course("Астрономия"),
                new Course("Садоводство")
        ));

        List<Course> courses3 = new ArrayList<>(Arrays.asList(
                new Course("Астрономия"),
                new Course("Макраме"),
                new Course("Садоводство")
        ));

        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student("Иванов", courses));
        students.add(new Student("Петров", courses1));
        students.add(new Student("Смирнов", courses2));
        students.add(new Student("Андреев", courses3));


        //1. список уникальных курсов, на которые подписаны студенты

        List<Course> courseList = students.stream().flatMap(student -> student.getCourseList().stream()).distinct().collect(Collectors.toList());
        printCourses(courseList);
        System.out.println();


        //2. возвращающую список из трех самых любознательных (любознательность определяется количеством курсов)
        List<Student> studentList1 = students.stream().sorted((student1,student2) -> student1.getCourseList().size() - student2.getCourseList().size()).limit(3).collect(Collectors.toList());
        printResult(studentList1);
        System.out.println();

        //3. на вход список Student и экземпляр Course, возвращающую список студентов, которые посещают этот курс.
        Course neededCourse = new Course("Садоводство");
        List<Student> studentList2 = students.stream().filter(student -> student.getCourseList().contains(neededCourse)).collect(Collectors.toList());

        printResult(studentList2);



    }
    static void printResult(List<Student> list) {
       for (int i =0; i<list.size(); i++) {
       System.out.print(list.get(i).getName() + " ");
        }
    }
    static void printCourses(List<Course> list){
        for (int i =0; i<list.size(); i++) {
            System.out.print(list.get(i).getName() + " ");
        }
    }
}
