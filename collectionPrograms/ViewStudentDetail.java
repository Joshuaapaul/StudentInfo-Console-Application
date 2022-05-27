package com.collectionPrograms;

public class ViewStudentDetail {
    public void viewStudentDetail() {



        System.out.println();
        System.out.println("--------------------------------------------------------------------");
        System.out.printf("%5s %15s %10s %5s %15s", "Id","Name","Gender","Age","Mobile No");
        System.out.println();
        System.out.println("--------------------------------------------------------------------");

        for(Students e : NewStudent.studentDetails){
            System.out.printf("%5s %15s %10s %5s %15s",(e.getId()),(e.getName()),(e.getGender()),(e.getAge()),(e.getMobileNo()));
            System.out.println();
        }
    }
}
