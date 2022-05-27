package com.collectionPrograms;

import java.util.Scanner;

public class RemoveStudentDetails {
    public void removeStudentDetails() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Student ID : ");
        int id = sc.nextInt();

        if (NewStudent.studentDetails.isEmpty()) {
                    System.out.println("------------No Details available..Please add a Student.-----------");
        }

        boolean contains = false;
        for (Students s : NewStudent.studentDetails) {
            if (s.getId() == id) {
                contains = true;
            }
        }

        if (contains) {
            for (Students e : NewStudent.studentDetails) {
                if (e.getId() == id) {
                    NewStudent.studentDetails.remove(e);
                    System.out.println("---------The Student detail has been removed successfully---------");
                    break;
                }
            }
        }
        else
            System.out.println("------No such Student ID is available. Please enter a valid ID------");

    }

}
