package com.studentmanagement;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StudentService studentService = new StudentService();
        TeacherService teacherService = new TeacherService();

        boolean running = true;

        while (running) {
            System.out.println("\n====== Student Management System ======");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Update Student");
            System.out.println("4. Delete Student");
            System.out.println("5. Add Teacher");
            System.out.println("6. View Teachers");
            System.out.println("7. Show Total Students");
            System.out.println("0. Exit");
            System.out.print("Please enter your choice: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1: {
                    System.out.print("Enter ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Department: ");
                    String dept = sc.nextLine();
                    studentService.addStudent(new Student(id, name, dept));
                    break;
                }
                case 2:
                    studentService.viewStudents();
                    break;
                case 3: {
                    System.out.print("Enter Student ID to update: ");
                    int uid = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter new name: ");
                    String newName = sc.nextLine();
                    System.out.print("Enter new department: ");
                    String newDept = sc.nextLine();
                    studentService.updateStudent(uid, newName, newDept);
                    break;
                }
                case 4: {
                    System.out.print("Enter Student ID to delete: ");
                    int did = sc.nextInt();
                    studentService.deleteStudent(did);
                    break;
                }
                case 5: {
                    System.out.print("Enter Teacher ID: ");
                    int tid = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Teacher Name: ");
                    String tname = sc.nextLine();
                    System.out.print("Enter Subject: ");
                    String sub = sc.nextLine();
                    teacherService.addTeacher(new Teacher(tid, tname, sub));
                    break;
                }
                case 6:
                    teacherService.viewTeachers();
                    break;
                case 7:
                    System.out.println(">> Total Students: " + studentService.totalStudents());
                    break;
                case 0:
                    System.out.println("Goodbye! Closing the system...");
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice! Try again.");
            }
        }

        sc.close();
    }
}
