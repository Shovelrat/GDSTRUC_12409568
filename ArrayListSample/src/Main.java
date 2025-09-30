import java.util.ArrayList;
import java.util.List;

public class Main{
    public static void main(String[] args) {
        List<Player> playerList = new ArrayList<Player>();
        playerList.add(new Player(1, "Saitama", 999));
        playerList.add(new Player(2, "Goku", 500));
        playerList.add(new Player(3, "Deku", 100));

        //initial contents of list
        for (Player player : playerList) {
            System.out.println(player);
        }
        //add player
        playerList.add(2, new Player(4, "Sakamoto", 10));

        System.out.println("");

        for (Player player : playerList) {
            System.out.println(player);
        }

        System.out.println("\nPlayer at Index 2 " + playerList.get(2));

        //remove player at an index
        System.out.println("\nAfter removing a player at index 1...");

        playerList.remove(1);

        for (Player player : playerList) {
            System.out.println(player);
        }

        // check if an object is in list.
        int index = playerList.indexOf(new Player(1, "Saitama", 999));
        System.out.println("\nList has Saitama? " + index );
    }
}