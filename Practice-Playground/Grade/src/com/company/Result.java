package com.company;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Result {
    public static void main(String[] args) {
        String[] grades;

        grades =calculateGrade(new Solution().enterDetails("XYZ"));

        for(int i=0; i<grades.length;i++){
            System.out.println(grades[i]);
        }

    }

    public static String[] calculateGrade(int[][] students_marks) {

        int[] sum = new int[students_marks.length];
        for (int row = 0; row < students_marks.length; row++) {
            int total = 0;
            for (int col = 0; col < students_marks[0].length; col++) {
                total += students_marks[row][col];
                System.out.println("total" +total);

            }
            sum[row] = total;
        }
        double [] percentage = new double[sum.length];
        for (int i = 0; i <sum.length; i++) {
            System.out.println("sum"+sum[i]);
            System.out.println("number of sub" +students_marks[0].length);
            percentage[i] = ((sum[i] * 100) / ((students_marks[0].length) * 100));
            System.out.println("percentage" +percentage[i]);
        }
        String[] grade = new String[percentage.length];
        for (int j = 0; j < percentage.length; j++) {
            if (percentage[j] >= 90) {
                grade[j] = "A";
            }
            if (percentage[j] < 90 && percentage[j] >= 80) {
                grade[j] = "B";
            }
            if (percentage[j] < 80 && percentage[j] <= 70) {
                grade[j] = "C";
            }
            if (percentage[j] <= 70) {
                grade[j] = "D";
            }

        }
        return grade;

    }
}






