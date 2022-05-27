package com.collectionPrograms;

import java.util.ArrayList;
import java.util.Scanner;

public class NewStudent {
    int id;
    String name;
    String gender;
    int age;
    long mobileNo;

        static ArrayList<Students> studentDetails = new ArrayList<Students>();
    public void newStudent() {
        Scanner sc =new Scanner(System.in);
        System.out.println();
        System.out.println("Enter the ID of the Student : ");
        this.id = sc.nextInt();

        for (Students e : NewStudent.studentDetails) {

            if (e.getId() == id) {
                System.out.printf("--------This Student ID Already exists. Please Enter a New ID.-------");
                System.out.println();
                System.out.println();
                System.out.println("Enter the ID of the Student : ");
                this.id = sc.nextInt();
            }
        }

        sc.nextLine();
        System.out.println("Enter the Name of the Student : ");
        this.name = sc.nextLine();
        System.out.println("Enter the Gender of Student : ");
        this.gender = sc.next();
        sc.nextLine();
        System.out.println("Enter the Age of the Student : ");
        this.age = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the MobileNo of the Student : ");
        this.mobileNo = sc.nextLong();

        Students studentData = new Students(id,name,gender,age,mobileNo);
        studentDetails.add(studentData);

    }
}
