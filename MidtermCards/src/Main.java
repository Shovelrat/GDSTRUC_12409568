import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //setting up scanner for input
        Scanner s = new Scanner(System.in);

        //End condition
        boolean gameEnd = true;

        //round counter
        int count = 0;

        // deck stack
        CardStack playerDeck = new CardStack();
        playerDeck.push(new Card("Saber"));
        playerDeck.push(new Card("Zero One"));
        playerDeck.push(new Card("Zi-O"));
        playerDeck.push(new Card("Build"));
        playerDeck.push(new Card("Ex-Aid"));
        playerDeck.push(new Card("Ghost"));
        playerDeck.push(new Card("Drive"));
        playerDeck.push(new Card("Gaim"));
        playerDeck.push(new Card("Wizard"));
        playerDeck.push(new Card("Fourze"));
        playerDeck.push(new Card("OOO"));
        playerDeck.push(new Card("W"));
        playerDeck.push(new Card("Kiva"));
        playerDeck.push(new Card("Den-O"));
        playerDeck.push(new Card("Kabuto"));
        playerDeck.push(new Card("Hibiki"));
        playerDeck.push(new Card("Blade"));
        playerDeck.push(new Card("Faiz"));
        playerDeck.push(new Card("Ryuki"));
        playerDeck.push(new Card("Agito"));
        playerDeck.push(new Card("Kuuga"));
        playerDeck.push(new Card("J"));
        playerDeck.push(new Card("ZO"));
        playerDeck.push(new Card("Shin"));
        playerDeck.push(new Card("Black RX"));

        //Player Hand
        CardStack playerHand = new CardStack();
        playerHand.push(new Card("Zeztz"));
        playerHand.push(new Card("Gavv"));
        playerHand.push(new Card("Gotchard"));
        playerHand.push(new Card("Geats"));
        playerHand.push(new Card("Revi"));

        //player grave
        CardStack playerGrave = new CardStack();

        //prints player hand
        System.out.println("Initial hand contents...");
        playerHand.printStack();

       while (gameEnd){
           System.out.println("\n--- PRESS ENTER TO CONTINUE ---");
           s.nextLine();

           //random number generator for selecting an option
           int randomNum = (int)(Math.random() * 3);

           //draw and discard 5 randoms.
           int drawAmount = (int)(Math.random() * 5+1);

           System.out.println("\n--- BEGINNING ROUND " + count);
           System.out.println("\nRandom Number Selection: " + randomNum);
           System.out.println("Draw Amount: " + drawAmount);

           switch(randomNum) {
               case 0: //Draw Cards
                   // Drawn cards exit the Stack and enter the Hand
                   System.out.println("\nDrawing " + drawAmount + " cards!");
                   for (int i = 0; i < drawAmount; i++){
                       playerHand.push(playerDeck.pop());
                   }
                   break;
               case 1: //Discard Cards
                   // Discarded Cards exit the Hand and enter the grave.
                   System.out.println("\nDiscarding " + drawAmount + " cards!");

                   for (int i = 0; i < drawAmount; i++){
                       playerGrave.push(playerHand.pop());
                       //checks if there's any cards in the hand left. Will immediately terminate if there are none.
                       if (playerHand.isEmpty()){
                           System.out.println("Out of cards to discard!");
                           break;
                       }
                   }

                   break;
               case 2: // retrieve cards
                   //Grave cards exit the Grave and enter the Stack.
                   // Checks if the stack is empty first

                   if (playerGrave.isEmpty()) {
                       System.out.println("\nNo cards in stack, cannot revive any cards!");
                       break;
                   }
                   else{
                       System.out.println("\nReviving " + drawAmount + " cards!");
                       for (int i = 0; i < drawAmount; i++){
                           playerDeck.push(playerGrave.pop());
                       }
                       break;
                   }

               default:
                   System.out.println("\nA fatal error has occurred, stopping program!");
                   //Catches any unintentional inputs and outputs.
                   break;
           }
           //Info Display
           //Displays Cards in Hand, Cards in Deck, Cards in Grave (PRINT COMMAND NEEDS A CHECKER TO SEE IF ANYTHING IS N THERE)
           System.out.println("\nPrinting current hand...");
           playerHand.printStack();

           System.out.println("\nPrinting current Deck...");
           playerDeck.printStack();

           System.out.println("\nPrinting current Grave...");
           playerGrave.printStack();

           if (playerDeck.isEmpty())
           {
               System.out.println("\n--- DECK IS EMPTY, GAME OVER ---");
               gameEnd = false;
               break;
           }
           else{
               count++;
           }
       }

    }
}