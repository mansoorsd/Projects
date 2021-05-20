package com.company;

import java.util.ArrayList;

public class ScoreList<T>  {


    public ArrayList<Integer> scores = new ArrayList<>();

    public void addElement(Integer score){
        scores.add(score);
    }

    public void removeElement(int score){
        scores.remove(score);
    }

    public T getElement(int a){

        T b = (T)scores.get(a);
        return b;
    }

    public double averageValues(){
        return 0.00;
    }



}
