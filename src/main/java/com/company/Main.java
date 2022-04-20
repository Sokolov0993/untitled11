package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {


        ArrayList<Student> students = new ArrayList<>();

        try {
            students = new ArrayList<>();
            students.add(new Student(1, "Faculty1", 1, 5, 7, -5));
            students.add(new Student(2, "Faculty1", 1, 8, 8, 9));
            students.add(new Student(3, "Faculty1", 1, 6, 5, 9));
            students.add(new Student(4, "Faculty1", 2, 4, 4, 7));
            students.add(new Student(5, "Faculty1", 2,6, 9, 6));
            students.add(new Student(6, "Faculty1", 2, 8, 10, 6));
            students.add(new Student(7, "Faculty2", 3, 6, 8, 4));
            students.add(new Student(8, "Faculty2", 3, 4, 9, 9));
            students.add(new Student(9, "Faculty2", 3, 5, 8, 4));
            students.add(new Student(10, "Faculty2", 3, 7, 4, 8));
            students.add(new Student(11, "Faculty2", 4, 6, 5, 8));
            students.add(new Student(12, "Faculty2", 4, 5, 7, 7));
            students.add(new Student(13, "Faculty2", 4, 7, 9, 9));
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("An average mark of student 5: " + students.get(4).getAverageMark());
        try {
            boolean a=  students.isEmpty();
            if (a ==true){
                throw new Exception1();
            }
        } catch (Exception1 e) {
            System.err.println("It's can't be no students in the university");
            e.printStackTrace();

        }


        List<Student> ar2 = students.stream().filter(student -> student.getFaculty().equalsIgnoreCase("Faculty1")).collect(Collectors.toList());
        List<Student> ar3 = ar2.stream().filter(student -> student.getGroup() < 2).collect(Collectors.toList());
        double x = 0;

        for (int i = 0; i < ar3.size(); i++) {
            x = x + ar3.get(i).getMathMark();
        }
        double averageMathMark = x / ar3.size();
        System.out.println("Average mark om math in group 1 Faculty1: "+averageMathMark);
        double a= 0;
        for (int i = 0; i < students.size(); i++){
            a = a+ students.get(i).getMathMark();
        }
        double averageMathMark2 = a/ students.size();
        System.out.println("Average mark om math in hole university: "+averageMathMark2);


    }
}

