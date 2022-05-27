package com.collectionPrograms;

import java.util.Scanner;

public class ModifyStudentDetails {


    public void modifyStudentDetails() {
        Scanner sc = new Scanner(System.in);
                    System.out.println("Enter The Student ID that has to be Modified : ");
        int idToModify = sc.nextInt();


        if (NewStudent.studentDetails.isEmpty()) {
                    System.out.println("------------No Details available..Please add a Student.-----------");
        }

        boolean contains = false;
        for (Students s : NewStudent.studentDetails) {
            if (s.getId() == idToModify) {
                contains = true;
            }
        }

        if (contains) {
            for (Students e : NewStudent.studentDetails) {
                if (e.getId() == idToModify) {
                    sc.nextLine();
                    System.out.println("Enter the Name of the Student : ");
                    e.setName(sc.nextLine());
                    System.out.println("Enter the Age of the Student : ");
                    e.setAge(sc.nextInt());
                    sc.nextLine();
                    System.out.println("Enter the MobileNo of the Student : ");
                    e.setMobileNo(sc.nextLong());
                    System.out.println();
                    System.out.println("-------------Student ID has been Modified Successfully--------------");
                    break;
                }
            }
        }
        else
                    System.out.println("------No such Student ID is available. Please enter a valid ID------");

            }
        }



