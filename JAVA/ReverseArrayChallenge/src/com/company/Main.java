package com.company;
import java.util.Scanner;
import java.util.Arrays;
public class Main {

    public static void main(String[] args) {
        int[] myArray = {1,2,3,4,5};
	reverse(myArray);
    }
    public static void reverse(int[] array){
        int temp =0;
        System.out.println("The array before change" +Arrays.toString(array));
        for(int i=0; i<array.length;i++){
            if(i==array.length-i){
                array[i]=array[array.length-i];
            }
            array[i]= temp;
            array[i]=array[(array.length)];
            temp=array[(array.length)];
        }

        System.out.println("The array before change" +Arrays.toString(array));

    }

}

