package com.company;

import java.util.ArrayList;

public class ScoreList<T> {
    ArrayList<T> scoreList = new ArrayList<T>();


    public void addElement(T student) {
        scoreList.add(student);

    }
    public void removeElement(T student) {
        scoreList.remove(student);

    }

    public T getElement(int a) {
        T b = scoreList.get(a);
        return b;
    }

    public double averageValue(){
        return 0.00;
    }

}
