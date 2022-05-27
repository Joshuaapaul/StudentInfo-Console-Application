package com.collectionPrograms;

import java.util.Scanner;

public class SearchStudentWithId {
    public void searchStudentWithId() {
        Scanner sc = new Scanner(System.in);
        int id = 0;
        System.out.println("Enter the Student ID : ");
        id = sc.nextInt();

        if (NewStudent.studentDetails.isEmpty()) {
            System.out.println("-------------No Details available..Please add a Student.------------");
        }

        System.out.println();
        System.out.println("--------------------------------------------------------------------");
        System.out.printf("%5s %15s %10s %5s %15s", "Id", "Name", "Gender", "Age", "Mobile No");
        System.out.println();
        System.out.println("--------------------------------------------------------------------");



        boolean contains = false;
        for (Students s : NewStudent.studentDetails) {
            if (s.getId() == id) {
                contains= true;
            }
            }

        if(contains) {
            for (Students e : NewStudent.studentDetails) {
                if (e.getId() == id) {
                    System.out.printf("%5s %15s %10s %5s %15s", (e.getId()), (e.getName()), (e.getGender()), (e.getAge()), (e.getMobileNo()));
                    System.out.println();
                }
            }
        }
        else
            System.out.println("------No such Student ID is available. Please enter a valid ID------");


    }
    }

