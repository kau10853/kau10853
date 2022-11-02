/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cardgame;

import cardgame.Card.Suit;
import cardgame.Card.Value;
//import static java.lang.Math.random;
//import static java.lang.StrictMath.random;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author 14372
 */
public class CardGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
       // Card[] hand=new Card[7];
         Card[] hand=CardHandGenerator.generateHand(7); 
       Random random=new Random();
        for(int i=0;i<hand.length;i++){
         /*   Value value = random.nextInt(13) + 1;
            String suit = Card.Suits[random.nextInt(4)];
            Card card=new Card(value, suit);
            hand[i] = card;
        }*/
         
         Value value = Card.Value.values()[random.nextInt(13)];
            Suit suit = Card.Suit.values()[random.nextInt(4)];
            Card card=new Card(value, suit);
            hand[i] = card;
        
    }
    System.out.println("Hare are the cards in the hand");
    for(Card card: hand){
    System.out.printf("%s of %s\n", card.getValue(), card.getSuit());
    
}
    System.out.println("pick a suit for your card:");
     for(int i=0;i<Card.Suit.values().length;i++){
            System.out.println((i + 1) + ":" + Card.Suit.values()[i]);
}
     int suitPosition= input.nextInt()-1;
     
      System.out.println("Enter a value:");
        for(int i=0;i<Card.Value.values().length;i++){
            System.out.println((i + 1) + ":" + Card.Value.values()[i]);
}     
      int valuePosition = input.nextInt() -1;
      
      Card userGuess = new Card(Card.Value.values()[valuePosition],
               Card.Suit.values()[suitPosition]);
      boolean match = false;
      for(Card card: hand){
    if(card.getValue() == userGuess.getValue()
            && card.getSuit() == userGuess.getSuit()){
        match= true;
        break;
    }
    String response = match ? "You guessed it right!": "Sorry no match...";
    System.out.println(response);
}
    }
}
