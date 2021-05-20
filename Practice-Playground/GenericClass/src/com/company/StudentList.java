package com.company;

import java.util.ArrayList;

public class StudentList<T> {

    ArrayList<T> studentList = new ArrayList<T>();

    public StudentList() {
        this.studentList = studentList;
    }

    public void addElement(StudentClass student) {
        studentList.add((T) student);

    }
    public void removeElement(T student) {
        studentList.remove(student);

    }

    public  T getElement(int a) {
        T b =  studentList.get(a);
        return b;
    }

    public String beginsWith(String s) {
        ArrayList<String> names = new ArrayList<>();
        for(int i=0;i<studentList.size();i++){
            if(studentList.get(i).toString().startsWith(s)){
                names.add(studentList.get(i).toString());
            }

        }
        String str = names.toString();
        str =str.concat("\n");
        str = str.replace("," ,"");
        str =str.replace("[","");
        str =str.replace("]","");
        str =str.replace(" ","\n");
        return str;

    }


    public String bloodGroupOf(String[] a, String b) {



        return null;

    }

    public int thresholdScore(int ab) {

        return 0;


    }

}
