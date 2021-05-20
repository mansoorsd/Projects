package com.fresco;

import java.util.Scanner;

 class Task1 extends Thread {
     public static int a;
     public static int beg;

     public static int getA() {
         return a;
     }


     public synchronized void addelements(){
         for(int i =0;i<a;i++){
             Solution.threadArray[i] =i;
         }
     }

     @Override
     public void run() {
         addelements();
     }
 }

class Task2 implements Runnable{
    public static int a;
    public static int beg;

    public static int getA() {
        return a;
    }

    public synchronized void  addelements(){
        for(int i =Task1.getA();i<Task1.getA()+a;i++){
            Solution.threadArray[i] =i;
        }
    }


    @Override
    public void run() {
        addelements();
    }
}
class Task3 implements Runnable {
    public static int a;
    public static int beg;

    public synchronized void addelements(){
        for(int i =Task2.getA();i<=Task2.getA()+a;i++){
            Solution.threadArray[i] =i;
        }
    }


    @Override
    public void run() {
        addelements();
    }
}

//Write your code here

class Solution {
    public static final int[] threadArray = new int[300];
    public static volatile String i = 0+"";
    public boolean test() throws InterruptedException
    {
        Task1 task1 = new Task1();
        Task2 task2 = new Task2();
        Task3 task3 = new Task3();
        Thread task2Thread = new Thread(task2);
        Thread task3Thread = new Thread(task3);
        task1.start();
        task2Thread.start();
        task1.join();
        task2Thread.join();
        task3Thread.start();
        int first = Task1.a+Task2.a;
        int containsSecondThread = Task1.a;
        String oneAndTwo = "";
        String sizeOfTask1 = "";
        for(int i=0;i<first;i++)
        {
            oneAndTwo += threadArray[i]+" ";
        }
        for(int i=0;i<containsSecondThread;i++)
        {
            sizeOfTask1 += threadArray[i]+" ";
        }
        int begOfTask3 = Task3.beg;
        String checkingString = "";
        for(int i=begOfTask3;i<threadArray.length;i++)
        {
            checkingString += i + " ";
        }
        String task3String = "";
        for(int j = begOfTask3;j<threadArray.length;j++)
        {
            task3String += threadArray[j]+" ";
        }
        if((!oneAndTwo.contains(begOfTask3+"") && sizeOfTask1.contains(Task2.beg+"")) && task3String.equals(checkingString))
        {
            return true;
        }
        return false;
    }
    public static void main(String[] args) throws InterruptedException
    {
        Scanner sc= new Scanner(System.in);
        Solution solution = new Solution();
        int one = sc.nextInt();
        Task1.a = one;
        Task1.beg = 0;
        int two = sc.nextInt();
        Task2.a = two;
        Task2.beg = one;
        int three = sc.nextInt();
        Task3.a = three;
        Task3.beg = one+two;
        System.out.print(solution.test());
    }
}