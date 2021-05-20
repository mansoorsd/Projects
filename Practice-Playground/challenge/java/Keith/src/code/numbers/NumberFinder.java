package code.numbers;

public class NumberFinder {

    public String output(String in){

        String input0 = in;
        String out = "";
        String[] input1 = input0.split(",");

        String[] input2 = input1[0].split(" ");

        for (String numbers : input2) {
            String input = numbers;


            int n = Integer.parseInt(input);
            if (n>10){

            int copy = n;
            String s = Integer.toString(n);
            int d = s.length(); //finding the number of digits (d) in the number
            int arr[] = new int[n]; //array for storing the terms of the series

            for (int i = d - 1; i >= 0; i--) {
                arr[i] = copy % 10; //storing the digits of the number in the array
                copy = copy / 10;

            }

            int i = d, sum = 0;
            while (sum < n) //finding the sum till it is less than the number
            {
                sum = 0;
                for (int j = 1; j <= d; j++) //loop for generating and adding the previous 'd' terms
                {
                    sum = sum + arr[i - j];
                }
                arr[i] = sum; //storing the sum in the array
                i++;
            }
            if (sum == n) {
                boolean c = false;

                if (n <= 1) {
                    c = true;
                }
                for (int o = 2; o < Math.sqrt(n); o++) {
                    if (n % o == 0) {
                        c = true;
                    }
                }
                if (c) {

                    //if sum is equal to the number, then it is a Keith number
                    out += input;
                }
            }
        }

        }
        out = out + input1[1];
        return out;


    }
}
