package Sesion14.ComparableYComparators.example1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Student implements Comparable<Student> {
    private String name;
    private int id;
    public Student(int id, String name){
        this.id = id;
        this.name = name;
    }

    public int compareTo(Student student){  // compareTo debe estar obligatoriamente
        return student.name.compareTo(this.name);
        //return this.name.compareTo(student.name);
    }

    public String toString(){
        return "name: " + name;
    }
    public static void main(String args[]){
        var a1 = new Student(10, "Ana");
        var a2 = new Student(3, "Belinda");
        var a3 = new Student(5, "Carlos");
        System.out.println(a1.compareTo(a2));

        List students = new ArrayList<Student>();
        students.add(a1);
        students.add(a2);
        students.add(a3);
        Collections.sort(students);
        System.out.println(students);
    }
}
