
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;



public class TreemapHandson {


    public TreeMap<Integer, String> createPlayerPositionMap(String cricketDataset) {
        TreeMap<Integer, String> playerPosition = new TreeMap<>();
        String[] one = cricketDataset.split("[|]");
        for (String data : one) {
            String[] two = data.split(",");
            playerPosition.put(Integer.parseInt(two[0]), two[1]);

        }

        return playerPosition;

    }

    public TreeMap<String, Integer> createPlayerScoreMap(String cricketDataset) {
        TreeMap<String, Integer> playerScore = new TreeMap<>();
        String[] one = cricketDataset.split("[|]");
        for (String data : one) {
            String[] two = data.split(",");
            playerScore.put((two[1]), Integer.parseInt(two[2]));


        }
        return playerScore;
    }

    public TreeMap<?, ?> createMatchesMap(String cricketDataset) {
        TreeMap<Integer, TreeMap<Integer,String>> matches = new TreeMap<>();

        String data = cricketDataset;
        String[] data1 = data.split("\n");

        for (int i = 0; i < data1.length; i++) {
            TreeMap<Integer,String> player = new TreeMap<>(createPlayerPositionMap(data1[i]));
            matches.put((i + 1), player);
        }
        return matches;
    }


    public String getQuery(String cricketDataset, String query) {

        String str[] = query.split(" ");
        int qry = Integer.parseInt(str[0]);

        if (qry == 1) {
            String outstring = "";
            TreeMap<Integer, String> playerPosition = new TreeMap<>(createPlayerPositionMap(cricketDataset));

            int start = Integer.parseInt(str[1]);
            int stop = Integer.parseInt(str[2]) + 1;


            SortedMap<Integer, String> subkey = playerPosition.subMap(start, stop);
            String out = subkey.toString();
            out = out.replaceAll(" ", "\n");
            out = out.replaceAll("=", " ");
            out = out.replaceAll("['{'',''=''}']", "");
            out = out + "\n";
            return out;

        }
        if (qry == 2) {
            String out = "";
            int score = Integer.parseInt(str[1]);
            TreeMap<Integer, String> output = new TreeMap<>();
            TreeMap<Integer, String> playerPosition = new TreeMap<>(createPlayerPositionMap(cricketDataset));
            TreeMap<String, Integer> playerScore = new TreeMap<>(createPlayerScoreMap((cricketDataset)));
            for (Map.Entry<String, Integer> entry : playerScore.entrySet()) {


                if (entry.getValue() > score) {
                    for (Map.Entry<Integer, String> exit : playerPosition.entrySet()) {

                        if (exit.getValue().equals(entry.getKey())) {
                            output.put(exit.getKey(), exit.getValue());

                        }
                    }

                }
            }
            for (Map.Entry<Integer, String> outs : output.entrySet()) {
                out = out + outs.getKey() + " " + outs.getValue() + "\n";
            }
            return out;

        }
        if (qry == 3) {
            TreeMap<Integer,TreeMap<Integer,String>> matchPlayers = (TreeMap<Integer, TreeMap<Integer, String>>) createMatchesMap(cricketDataset);
            TreeMap<Integer, TreeMap<String,Integer>> matchscores = new TreeMap<>();
            int score=1;
            int count =1;
            int average =0;
            String name="";
            String[] str1 = cricketDataset.split("\n");


            String one = str1[4].replaceAll("[,|]", " ");

            one = one.replaceAll("[0-9]","");
            one= one.replaceAll("   ","0");
            one =one.replaceAll("0", " ");
            one =one.replaceFirst(" ","");

            String[] array = one.split(" ");


            String data = cricketDataset;

            String[] data1 = data.split("\n");


            for (int i = 0; i < data1.length; i++) {
                TreeMap<String,Integer> player = new TreeMap<>(createPlayerScoreMap(data1[i]));
                matchscores.put((i + 1), player);
            }
            for(int i=0;i<array.length;i++){

                    for(int j=1;j<matchPlayers.size();j++) {
                        for (Map.Entry<Integer, String> nothing : matchPlayers.get(j).entrySet()) {

                            if (matchPlayers.get(j).get(1).equals(array[i]) && (nothing.getKey()) == 1) {

                                for (Map.Entry<String, Integer> scoresof : matchscores.get(j).entrySet()) {
                                    score = score + scoresof.getValue();
                                    count++;


                                }

                            }

                        }
                    }

                    int average1 = score/count;
                    if(average1>average){
                        average=average1;
                        name = array[i];

                    }
            }
            return "The Efficient Opener is "+name;



        }
        return null;
    }
}













