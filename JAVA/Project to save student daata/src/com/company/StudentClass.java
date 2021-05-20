package com.company;


import java.util.ArrayList;

public class StudentClass {

    private String name;
    private String bloodGroup;

    private int scoreList;

    public StudentClass(String name) {
        this.name = name;
    }

    public void setScoreList(int scoreList) {
        this.scoreList = scoreList;
    }

    public StudentClass(int scoreList) {
        this.scoreList = scoreList;
    }

    public StudentClass() {

    }

    public String getName() {
        return name;
    }

    public String getBloodGroup() {
        return bloodGroup;
    }

    public int getScoreList() {
        return scoreList;
    }
    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;

    }

    public String getQuery(String studentData, String query) {

        if(query.length()==4){
            String[] u = query.split(",");
            int  a = Integer.parseInt(u[0]);
            if(a==3){

                int it =Integer.parseInt(u[1]);
                String str3 = studentData;

                StudentList students = new StudentList();
                String[] str4 = studentData.split(" ");
                ScoreList score = new ScoreList();
                for (String c: str4){
                    StudentClass o = new StudentClass();
                    o.setScoreList(Integer.parseInt(c));
                    students.addElement(o);
                }
                int ty =students.thresholdScore(it);

                return Integer.toString(ty)  +" scored " +it +" above";

            }

        }

        if(query.length()>3){
            String[] rt = query.split(",");
            String[] yu =rt[1].split(" ");

            String[] io = studentData.split(" ");
            if((Integer.parseInt(rt[0]))==2){
                String po = rt[2];
                StudentList students = new StudentList();
                for (int u=0;u<yu.length;u++){
                    StudentClass h = new StudentClass(io[u]);
                    h.setBloodGroup(yu[u]);
                    students.addElement(h);
                }

                String[] gkl = io;
                return students.bloodGroupOf(gkl,po);

            }
        }


        if (query.length() == 3) {
            String[] ab = query.split(",");

            int a = Integer.parseInt(ab[0]);

            String cd = ab[1];

            if (a == 1) {

                String str1 = studentData;
                String[] str2 = str1.split(" ");

                StudentList students = new StudentList();
                for (String b : str2) {


                    StudentClass c = new StudentClass(b);
                    students.addElement(c);
                }

                return students.beginsWith(cd);

            }


        }

        if(query.length()==1){
            if(Integer.parseInt(query)==4){
                ScoreList cd = new ScoreList();
                String ty = studentData;

                String[] ab= ty.split(" ");

                for(String j: ab){
                    cd.addElement(Integer.parseInt(j));
                }
                String ei = String.format("%.2f",cd.averageValues());
                return ei;

            }
            if(Integer.parseInt(query)==5){
                String tu = studentData;
                String[] ui = studentData.split(" ");
                ArrayList<Double> west = new ArrayList<>();
                for (String k: ui){
                    west.add(Double.parseDouble(k));
                }
                double sum =0.0;
                for(double g : west){
                    sum+=g;
                }
                double average = sum/west.size();
                return String.format("%.2f", average);
            }



        }

        return null;
    }

}