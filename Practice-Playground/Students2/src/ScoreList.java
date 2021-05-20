import java.util.ArrayList;

public class ScoreList<T>  {


    public ArrayList<Integer> scores = new ArrayList<>();

    public void addElement(Integer score){
        scores.add(score);
    }

    public void removeElement(int score){
        scores.remove(score);
    }

    public int getElement(int a){

        int b = scores.get(a);
        return b;
    }

    public double averageValues(){
        double sum =0;

        for(int i=0;i<scores.size();i++){
            sum+=scores.get(i);
        }
        double average = sum/scores.size();
        return  average;
    }



}
