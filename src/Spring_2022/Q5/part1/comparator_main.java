package Spring_2022.Q5.part1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class comparator_main {
    public static void main(String[] args) {
        //Task 1: Create an empty ArrayList of Player type;
        ArrayList <Player> players= new ArrayList<>();
        //Task 2: Using the add() method add objects with the followings to theArraylist
        players.add((new Player(55,"Karim","Bangladesh")));
        players.add((new Player(14,"Ponting","Australia")));

        /* Task 3: Sort the Arraylist in, ascending order of jersey number using a
 comparator for comparing objects of Player class [You can also
 define the Comparator as a separate class if you want]
 */

        // we are creating the class blow ... see there
        Collections.sort(players, new JerseyComp());

        //you can use this code to check your code is doing well or not
//        for(Player player:players){
//            System.out.println(player.jersey);
//        }


    }
}


//This class is creating for compare and sort ascending
class JerseyComp implements Comparator<Player> {

    public int compare(Player p1, Player p2){
        if(p1.jersey>p2.jersey){
            return 1;
        }else if(p1.jersey<p2.jersey){
            return -1;
        }
        return 0;
    }
}