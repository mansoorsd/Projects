
import java.util.ArrayList;
import java.util.List;
class Passanger
{
    int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getFare() {
        return fare;
    }

    public void setFare(float fare) {
        this.fare = fare;
    }
    float fare;
    public Passanger(int id, float fare)
    {
        this.id=id;
        this.fare=fare;
    }
}
public class BusProb {

    ArrayList<Passanger> PassengerList = new ArrayList<>();


    public void stops(List<String> listOfInputStrings,int stops, int capacity) {

        int cap = capacity;
        int stop = stops;
        int prepCapacity = 0;

        for (String a : listOfInputStrings) {
            String[] i = a.split(" ");
            for (String l : i) {
                if (l.contains("+")) {
                    prepCapacity++;
                }
                if (l.contains("-")) {
                    prepCapacity--;
                    prepCapacity--;
                }

            }

            for (String l : i) {

                if (l.contains("+")) {
                    l = l.replace("+", "");

                }
            }


        }
    }
    public boolean addPassenger(){
        return false;

    }
    public boolean removePassenger(){
        return false;
    }

    public boolean findPassenger(){
        return false;
    }
    public void calculateFare(int currentCapcity, int totalcapcity){
       float fare =0.0f;
        if (currentCapcity <= (0.25 * totalcapcity)) {
            fare = (float) ((float) totalcapcity +totalcapcity * 0.6);
            w = Float.toString(price);
            io++;
        }
        if (cap > (0.25 * this.capacity) && cap <= (0.50 * this.capacity)) {
            price = (float) (capacity + capacity * 0.6);
            t = Float.toString(price);
            ip++;
        }
        if (cap > (0.50*(this.capacity))) {

            price = this.capacity;
            x = Float.toString(price);
            ia++;

        }




    }




    public String output(int capacity, int stops, List<String> listOfInputStrings, String query)
    {
        String outstring="";
        //Write your code here
        return outstring;
    }
}
