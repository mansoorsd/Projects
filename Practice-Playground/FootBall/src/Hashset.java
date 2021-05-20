import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Hashset
{




    public static String getOut(int numberOfMatches, String squads, int squad1, int squad2)
    {
        HashMap<Integer,Set<String>> playersSet = new HashMap<>();

        String squadString = squads;
        String[] sq = squadString.split("[#]");
        for (int i=0;i<sq.length;i++) {
            HashSet<String> match = new HashSet<>();
            String[] b = sq[i].split(" ");
            for (String c: b) {
                boolean y = true;
                if(match.contains(c)==false){
                    match.add(c);
                }
            }

            playersSet.put(i+1,match);

        }

        int first = squad1;
        int second = squad2;
        String out ="";
        String other ="";
        System.out.println(playersSet.get(first));
        Set<String> intersection = new HashSet<>(playersSet.get(first));
        for(int i=1;i<=numberOfMatches;i++){
            intersection.retainAll(playersSet.get(i));
        }


        Set<String> union = new HashSet<>(playersSet.get(second));

        union.removeAll(playersSet.get(first));

        System.out.println("intersection "+intersection.toString());
        System.out.println(playersSet);


        for (String name: intersection) {
            out=out+ " "+name;
        }

        out =out +", ";
        for (String name: union) {
        other=other+" "+name;

    }
        other =other.replaceFirst(" ","");

        out =out.replaceFirst(" ","");
        out =out+other;
        System.out.println(out);
        return out;


    }
}

class Player{

    String name;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
