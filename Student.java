package com.studentmanagement;

public class Student extends Person {

    private String department;

    public Student(int id, String name, String department) {
        super(id, name);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public void displayDetails() {
        System.out.println(
                "Student -> ID: " + id +
                        " | Name: " + name +
                        " | Dept: " + department
        );
    }
}
