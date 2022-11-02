package cardgame;

import java.util.Random;
import java.util.Scanner;

public class CardHandGenerator extends CardGame {
public static Card[] generatrHand(int numCards){
       Scanner input=new Scanner(System.in);
        Card[] hand=new Card[numCards];
       Random random=new Random();
        for(int i=0;i<hand.length;i++){
   int numValues = Card.Value.values().length;
   Card.Value value = Card.Value.values()[random.nextInt(numValues)];

    int numSuits = Card.Suit.values().length;
   Card.Suit suit = Card.Suit.values()[random.nextInt(numSuits)];
 Card card=new Card(value,suit);
 hand[i]=card;
}
        return hand;
       
  
    
        
        
        
}

    static Card[] generateHand(int i) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public CardHandGenerator() {
        // TODO - implement CardHandGenerator.CardHandGenerator
        throw new UnsupportedOperationException();
    }
}




