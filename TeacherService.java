package com.studentmanagement;

import java.util.ArrayList;
import java.util.List;

public class TeacherService {

    private List<Teacher> teachers = new ArrayList<>();

    public void addTeacher(Teacher t) {
        teachers.add(t);
        System.out.println(">> Teacher added successfully.");
    }

    public void viewTeachers() {
        if (teachers.isEmpty()) {
            System.out.println(">> No teachers added yet.");
            return;
        }
        System.out.println("---- All Teachers ----");
        for (Teacher t : teachers) {
            t.displayDetails();
        }
    }
}
