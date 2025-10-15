public class Main {
    public static void main(String[] args) {
        ArrayQueue playerQueue = new ArrayQueue(10);
        playerQueue.enqueue(new Player(1, "Deku", 100));
        playerQueue.enqueue(new Player(2, "Goku", 500));
        playerQueue.enqueue(new Player(3, "Saitama", 999));

        playerQueue.printQueue();

        Player removedPlayer = playerQueue.dequeue();

        System.out.println("\nRemoved Player: " + removedPlayer + "\n");
        playerQueue.printQueue();

        System.out.println("\nFront Player: " + playerQueue.peek() + "\n");

        playerQueue.enqueue(new Player(4, "Sakamoto", 10));
        playerQueue.enqueue(removedPlayer);

        System.out.println("After adding 2 new players...");
        playerQueue.printQueue();
    }
}