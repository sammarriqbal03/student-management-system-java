package com.studentmanagement;

public class Teacher extends Person {

    private String subject;

    public Teacher(int id, String name, String subject) {
        super(id, name);
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public void displayDetails() {
        System.out.println(
                "Teacher -> ID: " + id +
                        " | Name: " + name +
                        " | Subject: " + subject
        );
    }
}
