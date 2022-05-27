package com.collectionPrograms;

public class Students {
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public long getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(long mobileNo) {
        this.mobileNo = mobileNo;
    }

    private String name;
    private String gender;
    private int age;
    private long mobileNo;


    public Students(int id, String name, String gender, int age, long mobileNo) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.mobileNo = mobileNo;
    }
}
