
public class Main{
    public static void main(String[] args){
        LinkedStack playerStack = new LinkedStack();
        playerStack.push(new Player( 1, "Deku", 100));
        playerStack.push(new Player( 2, "Goku", 500));
        playerStack.push(new Player( 3, "Saitama", 999));

        System.out.println("Initial stack contents...");
        playerStack.printStack();

        System.out.println("\n\nPop top element " + playerStack.pop());
        System.out.println("\n\nPeek after Pop " + playerStack.peek());

        playerStack.push(new Player (4, "Sakamoto", 10));
        playerStack.printStack();
    }
}