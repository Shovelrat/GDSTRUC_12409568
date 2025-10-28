import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //setting up scanner for input
        Scanner s = new Scanner(System.in);

        //End condition
        boolean gameEnd = false;

        //round counter
        int count = 0;

        //integer to attach to end of player that goes up
        int queueCount = 4;


        //match counter
        int match = 0;

        //InitialQueue List. SMALL NOTE - if the queueCount exceeds capacity, begins to print null. For this reason, Capacity is set quite high.
        ArrayQueue playerQueue = new ArrayQueue(20);
        playerQueue.enqueue(new Player("Player 1"));
        playerQueue.enqueue(new Player("Player 2"));
        playerQueue.enqueue(new Player("Player 3"));

        //code for queue and enqueue
        while (!gameEnd){
            System.out.println("\n--- PRESS ENTER TO CONTINUE ---");
            s.nextLine();

            //Print Roster per round start
            System.out.println("\n--- Previous Queue ---");
            playerQueue.printQueue();

            //queue up to 7 randoms
            int queueAmount = (int) (Math.random() * 7+1);

            System.out.println("\n--- BEGINNING ROUND " + count);

            // Slightly cheats by printing out the added player as Player + queueCount, but trying to do AddedPlayer returns null.
            for(int i = 0; i < queueAmount; i++){
                playerQueue.enqueue(new Player("Player " + queueCount));
                System.out.println("Added Player: Player " + queueCount + "\n");
                queueCount++;
            }

            //check if size of queue is 5 or more. If the size is 5+, dequeue up to 5 and increase the match coung.
            // small bug - at a certain point, begins to print null.
            if (playerQueue.size() > 5){
                System.out.println("\nMatches found, dequeueing...");
                for(int i = 0; i < 5; i++){
                    Player removedPlayer = playerQueue.dequeue();
                    System.out.println("Removed Player: " + removedPlayer + "\n");
                }
                match++;
            }

            System.out.println("\n--- New Queue ---");
            playerQueue.printQueue();

            System.out.println ("\n --- Matches Found: " + match + " ---");

            //check if Match is 10. If not, start again.
            if (match == 10){
                gameEnd = true;

                System.out.println("\nRequired amount of players matched, happy playing!");
                System.out.println("\nRounds Progressed: " + count);
            }

            //increases round count
            count++;
        }
    }
}