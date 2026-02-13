package com.gla.package1;

public class Student {
    private String name;
    private int rollNumber;
    private String gender;
    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name=name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }
}
