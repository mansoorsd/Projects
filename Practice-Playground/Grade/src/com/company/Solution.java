package com.company;

import java.util.Scanner;

public class Solution {
    Scanner scan = new Scanner(System.in);

    public int[][] enterDetails(String name) {

        System.out.println("Enter number of students");
        int m = scan.nextInt();
        int n = 5;
        int[][] student_marks = new int[m][n];

        for (int i = 0; i < m; i++) {
            System.out.println("Enter Marks");
            int a = 0;
            for (int j = 0; j < n; j++) {
                if (scan.hasNextInt()) {

                    a = scan.nextInt();
                    if (a <= 100) {
                        student_marks[i][j] = a;
                    } else {
                        break;
                    }
                }
                else{
                    break;
                }
            }

        }
        return student_marks;
    }
}



