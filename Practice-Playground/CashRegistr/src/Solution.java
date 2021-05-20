import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Register {


    private static Register register=null;
    private  Register() {
    }
    public static Register getInstance() {
        if(register==null) {

            register = new Register();
        }
        return register;

    }

    /*
     * Complete the 'getTotalBill' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts MAP itemDetails as parameter.
     */

    public String getTotalBill(Map<String,Integer> itemDetails) {

        


    }

}

public class Solution {
    public static void main(String[] args) throws IOException {

        Scanner readInput = new Scanner(System.in);
        String[] input=readInput.nextLine().split(" ");
        Map<String,Integer> myItems=new HashMap<String,Integer>();
        for(int i=0;i<input.length;i+=2){
            myItems.put(input[i],Integer.parseInt(input[i+1]));
        }
        Register regObj = Register.getInstance();
        System.out.println(regObj.getTotalBill(myItems));
        readInput.close();

    }
}

