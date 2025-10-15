

public class PlayerLinkedList {
    private PlayerNode head;

    public void addToFront(Player player){
        PlayerNode newNode = new PlayerNode(player);
        //list is not empty
        if (head != null){
            newNode.setNext(head);
        }

        head = newNode;
    }

    public void printList(){
        PlayerNode current = head;

        System.out.println("HEAD -> ");

        while (current != null){
            System.out.print(current.getPlayer()+ " -> ");
            current = current.getNext();
        }

        System.out.print("NULL");
    }


    //Remove the first element from the list... by setting the next element as the head of the linked list.
    //a horrible horrible hack but i don't know enough about java currently and we can't import the actual remove command
    public void removeElement(){
        head = head.getNext();

    }


    public void size(){
    PlayerNode current = head;
    int count = 0;
    while (current != null){
    count++;
    current = current.getNext();
    }
    System.out.print("Elements in List: " + count);
    }

    //linked lists don't contain true indexes. This mimics an index by counting each address, and ending at a particular one.
    //codeblock present for analysis
    public int indexOf(Player player){
        PlayerNode current = head;
        int index = 0;
        while (current != null){
            if(current.getPlayer().equals(player)){
            return index;
            }
            index++;
            current = current.getNext();

        }
        return -1;
    }
    // returns true if it contains a certain name
    // Can't figure out how ot make it get its name though... this code block is present for analysis.
    public void contains(Player player){
        PlayerNode current = head;
        boolean containsItem = false;
        while (current!=null){
            if (current.getPlayer().equals(player)){
                containsItem = true;
                System.out.println(containsItem);
                break;
            } else {
                current = current.getNext();
            }
        }
        System.out.println(containsItem);
    }




}
