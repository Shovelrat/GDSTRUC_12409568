

public class Main {
    public static void main(String[] args) {
        PlayerLinkedList playerList = new PlayerLinkedList();
        playerList.addToFront(new Player(1, "Saitama", 999));
        playerList.addToFront(new Player(2, "Goku", 500));
        playerList.addToFront(new Player(3, "Deku", 100));

        System.out.println("Before adding Sakamoto:");
        playerList.printList();

        System.out.println("\nAfter adding Sakamoto:");
        playerList.addToFront(new Player(4, "Sakamoto", 10));
        playerList.printList();

        System.out.println("\nDelete Sakamoto:");
        playerList.removeElement();
        playerList.printList();

        System.out.println("\n\nCount Elements:");
        playerList.size();

        System.out.println("\n\nIs Saitama in list?");
        playerList.contains();

        System.out.println("\n\nWhat index is Saitama?");
        playerList.indexOf(new Player(3, "Deku", 100))




        /**
        System.out.println("\nRemove Sakamoto:");
        playerList.removeFirstElement();
        playerList.printList();
        **/

    }
}