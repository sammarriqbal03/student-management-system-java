package com.studentmanagement;

import java.util.ArrayList;
import java.util.List;

public class StudentService {

    private List<Student> students = new ArrayList<>();

    public void addStudent(Student student) {
        students.add(student);
        System.out.println(">> New student added in the list.");
    }

    public void viewStudents() {
        if (students.isEmpty()) {
            System.out.println(">> List is empty. No student to show.");
            return;
        }
        System.out.println("---- All Students ----");
        for (Student s : students) {
            s.displayDetails();
        }
    }

    public Student findStudentById(int id) {
        for (Student s : students) {
            if (s.getId() == id) {
                return s;
            }
        }
        return null;
    }

    public void updateStudent(int id, String newName, String newDept) {
        Student student = findStudentById(id);
        if (student == null) {
            System.out.println(">> No student exists with ID " + id);
            return;
        }
        student.setName(newName);
        student.setDepartment(newDept);
        System.out.println(">> Record updated for ID " + id);
    }

    public void deleteStudent(int id) {
        Student student = findStudentById(id);
        if (student == null) {
            System.out.println(">> No student exists with ID " + id);
            return;
        }
        students.remove(student);
        System.out.println(">> Record removed for ID " + id);
    }

    public int totalStudents() {
        return students.size();
    }
}
