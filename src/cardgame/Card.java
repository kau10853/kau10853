/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cardgame;

/**
 *
 * @author Mandeep Kaur
 */
public class Card {
   public enum Suit{
       HERATS,CLUBS,SPADES,DIAMOND
   }
    public enum Value{
      ACE,TWO,THREE,FOUR,FIVE,SIX,SEVEN,EIGHT,NINE,TEN,JACK,QUEEN,KING
   }
    private Value value;
    private Suit suit;
    
    public Card(Value value,Suit suit ){
        this.value = value;
        this.suit = suit;
    }
    public Value getValue(){return this.value;}
    public void setValue(Value value){this.value=value;}
    public Suit getSuit(){return this.suit;}
    public void setSuit(Suit suit){this.suit=suit;}
}
