package com.gla.steamApi;

import java.util.ArrayList;
import java.util.List;

public class ClassMain {
    static void main(String[] args) {
        Student student1 = new Student();
        student1.setName("Mohit Jain");
        student1.setId(1);
        student1.setAge(18);

        Student student2 = new Student();
        student2.setName("Rahul");
        student2.setId(1);
        student2.setAge(26);

        Student student3 = new Student();
        student3.setName("Mohit Sharma");
        student3.setId(3);
        student3.setAge(42);
        List<Student> list = new ArrayList<>();
        list.add(student1);
        list.add(student2);
        list.add(student3);

        list.stream()
                .filter(s -> s.getAge() >= 25)
                .forEach(s -> System.out.println(s.getName()));
    }
}
