import java.util.EmptyStackException;

public class ArrayStack {
    private Player[] stack;
    private int top;

    public ArrayStack(int capacity){
        stack = new Player[capacity];
        top = 0;

        // if top is equal to the elements of the array, the thing is full
    }

    public void push(Player player){
        //resize if array is full
        if (top == stack.length){
            Player[] newStack = new Player[stack.length*2];
            // params - array you will copy, which index of array you will start copy, where to place element copies, specify at which index of new stack you'll place, how many elements to copy
            System.arraycopy(stack, 0, newStack, 0, stack.length);
            stack = newStack;
        }

        stack[top++] = player;
    }

    public Player pop(){
        if (isEmpty()){
            return null;
        }

        return stack[--top];
    }

    public Player peek(){
        if (isEmpty()){
            return null;
        }

        return stack[top - 1];
    }

    public boolean isEmpty(){
        return top == 0;
    }

    //in stak, start with top

    public void printStack(){
        System.out.println("Printing stack...");

        for (int i = top - 1; i >= 0; i --){
            System.out.println(stack[i]);
        }
    }
}
