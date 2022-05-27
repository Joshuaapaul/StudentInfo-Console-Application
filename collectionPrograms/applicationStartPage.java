package com.collectionPrograms;

import com.studentdemo.CreateNewStudent;

import java.util.Scanner;

public class applicationStartPage {
    private static void starPage() {
        Scanner sc = new Scanner(System.in);
        boolean isExit = true;
        System.out.println();
            System.out.println("---------------------------Welcome to ZSGS--------------------------");

        while (isExit){

            System.out.println();
            System.out.println("Enter your option : ");
            System.out.println("--------------------------------------------------------------------");
            System.out.println();
            System.out.println("1.Create new Student");
            System.out.println("2.View Student details");
            System.out.println("3.Search Student with Id");
            System.out.println("4.Modify Student details");
            System.out.println("5.Remove Student details");
            System.out.println("6.Remove All Students");
            System.out.println("7.Exit");
            System.out.println();
            System.out.println("--------------------------------------------------------------------");
            int option = sc.nextInt();

            switch (option){
                case 1 : new NewStudent().newStudent();
                break;
                case 2 : new ViewStudentDetail().viewStudentDetail();
                break;
                case 3 : new SearchStudentWithId().searchStudentWithId();
                break;
                case 4 : new ModifyStudentDetails().modifyStudentDetails();
                break;
                case 5 : new RemoveStudentDetails().removeStudentDetails();
                break;
                case 6 : new RemoveAllDetails().removeAllDetails();
                break;
                case 7 : isExit=false;
                System.out.println("-----------------------------Thank You----------------------------");
                break;
            }
        }
    }

    public static void main(String[] args) {

        applicationStartPage.starPage();
    }


}
