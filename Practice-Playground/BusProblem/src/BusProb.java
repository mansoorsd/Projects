



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
    int many;

    public int getMany() {
        return many;
    }

    public void setMany(int many) {
        this.many = many;
    }

    public Passanger(int id, float fare)
    {
        this.id=id;
        this.fare=fare;
        this.many =0;
    }
}
public class BusProb {

    int stops;
    ArrayList<Passanger> passenger = new ArrayList<>();
    ArrayList<Passanger> travelled = new ArrayList<>();

    int capacity;
    int cap;
    int io = 0;
    int ip = 0;
    int ia = 0;
    String o = "0", p = "0", k = "0";

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }


    public String output(int capacity, int stops, List<String> listOfInputStrings, String query) {
        int que = 0;
        int di = 0;
        float price = 0;
        int io = 0;
        int ip = 0;
        int ia = 0;
        String w = "0", t = "0", x = "0";


        if (query.length() == 1) {
            que = Integer.parseInt(query);
        }
        if (query.length() > 3) {

            String[] str = query.split(",");

            que = Integer.parseInt(str[0]);
            String str2 = str[1].replace(" ", "");
            di = Integer.parseInt(str2);

        }
        String outstring = null;
        this.stops = stops;
        setCapacity(capacity);
        ArrayList<String> input = new ArrayList<>(listOfInputStrings);
        int count = 0;
        int reg = 0;


        for (String a : input) {
            int o = 0;

            String[] i = a.split(" ");
            for (String l : i) {
                if (l.contains("+")) {
                    o++;
                    this.cap++;
                }
                if (l.contains("-")) {
                    o--;
                    this.cap--;
                }


//           for (String e : i) {
                if (l.contains("+")) {

                    String ko = l.replace("+", "");
                    int k = Integer.parseInt(ko);
                    if (this.cap <= (0.25 * this.capacity)) {
                        price = (float) (capacity + capacity * 0.6);
                        w = Float.toString(price);
                        io++;
                    }
                    if (cap > (0.25 * this.capacity) && cap <= (0.50 * this.capacity)) {
                        price = (float) (capacity + capacity * 0.3);
                        t = Float.toString(price);
                        ip++;
                    }
                    if (cap > (0.50 * (this.capacity))) {

                        price = (float) (this.capacity);
                        x = Float.toString(price);
                        ia++;

                    }
                    Passanger p = new Passanger(k, price);
                    passenger.add(p);
                    travelled.add(p);


                    if (travelled.contains(p)) {
                        p.setFare(p.getFare() + price);
                        int u = p.getMany();
                        p.setMany(u++);

                    }
                    count++;
                }
                if (l.contains("-")) {

                    String ko = l.replace("-", "");
                    int k = Integer.parseInt(ko);
                    for (int y = 0; y < passenger.size(); y++) {

                        if (passenger.get(y).getId() == k) {
                            Passanger p = passenger.get(y);
                            passenger.remove(p);
                            reg++;
                        }
                    }


                }
            }
        }

            if (que == 1) {

                outstring = count + " passengers got on the bus and " + reg + " passengers got out of the bus";

            }
            if (que == 2) {

                outstring = io + " passengers traveled with a fare of " + w + ", " + ip + " passengers traveled with a fare of " + t + ", " + ia
                        + " passengers traveled with a fare of " + x;
            }
            if (que == 3) {
                float g = 0;

                for (int i = 0; i < travelled.size(); i++) {

                    if (travelled.get(i).getId() == di) {
                        Passanger p = travelled.get(i);
                        g = p.getFare();

                    }
                }
                outstring = "Passenger " + di + " spent a total fare of " + Float.toString(g);

            }
            if (que == 4) {
                int g = 0;
                for (int i = 0; i < travelled.size(); i++) {

                    if (travelled.get(i).getId() == di) {
                        Passanger p = travelled.get(i);
                        g = p.getMany();

                    }
                }
                outstring = "Passenger has got on the bus for " + Integer.toString(g);

            }

            if (que == 5) {
                outstring = "Passenger " + Integer.toString(di) + " was not inside the bus at the end of the trip";
                for (int i = 0; i < passenger.size(); i++) {

                    if (passenger.get(i).getId() == di) {

                        outstring = "Passenger " + Integer.toString(di) + " was inside the bus at the end of the trip";

                    }

                }


            }

        return outstring;
        }


    }





