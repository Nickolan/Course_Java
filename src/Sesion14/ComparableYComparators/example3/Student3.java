package Sesion14.ComparableYComparators.example3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Student3 implements Comparable<Student3> {
    private int id;
    private String name;

    public int getId(){
        return this.id;
    }
    public String getName(){
        return this.name;
    }
    public int compareTo(Student3 student){
        return this.name.compareTo(student.name);
    }

    public String toString(){
        return "id: "+id+", name: "+name;
    }
    public static void main(String args[]){
        var a1 = new Student3();
        a1.id=10; a1.name="Ana";

        var a2 = new Student3();
        a2.id=10; a2.name="Belinda";

        var a3 = new Student3();
        a3.id=5; a3.name="Carlos";

        List students = new ArrayList<Student3>();
        students.add(a1);
        students.add(a2);
        students.add(a3);
        Collections.sort(students);
        System.out.println(students);

        Comparator<Student3> byIdThenName = Comparator.comparing(Student3::getId).thenComparing(Student3::getName);

        Collections.sort(students, byIdThenName);
        System.out.println(students);
    }
}
