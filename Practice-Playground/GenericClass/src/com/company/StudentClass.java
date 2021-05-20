package com.company;

public class StudentClass {
    private String name;
    private String bloodGroup;

    public StudentClass() {

    }

    public StudentClass(String name) {
        this.name =name;
    }


    public String getName() {
        return name;
    }

    public String getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    StudentList<StudentClass> studentList = new StudentList<>();



}
