import java.util.Deque;
import java.util.LinkedList;
import java.util.ListIterator;

public class CardStack {
    private LinkedList<Card> stack;

    public CardStack(){
        stack = new LinkedList<Card>();
    }

    public void push (Card card){
        stack.push(card);
    }

    public Card pop(){
        if (isEmpty()){
            return null;
        }

        return stack.pop();
    }

    public Card peek(){
        return stack.peek();
    }

    public boolean isEmpty(){
        return stack.isEmpty();
    }


    public void printStack(){
        ListIterator<Card> listIterator = stack.listIterator();
        if(stack.isEmpty()){
            System.out.println("Empty!");
        }
        else{
            while (listIterator.hasNext()) {
                //If there's nothing in the selected stack, print an EMPTY!
                System.out.println(listIterator.next());
            }
        }

    }
}