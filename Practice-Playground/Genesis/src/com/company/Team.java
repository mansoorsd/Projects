package com.company;

import java.util.ArrayList;
import java.util.List;

public class  Team<T extends Player> {
    private String  name;
    private ArrayList<Player> members = new ArrayList<Player>();
    private int score=0;
    private int won=0;
    private int loss =0;
    private int tied=0;

    public Team(String name) {
        this.name = name;
    }

    public  String getName() {
        return name;
    }

    public boolean addPlayer(T player){
        if(members.contains(player)){
            System.out.println("Player already exist");
            return false;
        }
        else{
            members.add(player);
            System.out.println(player.getName() +" has been added to team " +getName());
            return true;
        }

        }
    public  void  numberOfPlayers(){
        System.out.println("The number of players are "+members.size());

    }

    public void listofPlayers(){

    }



}
