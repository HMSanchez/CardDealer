//Harrisen Sanchez
//2/8/17
package app;

public class Card {

	public enum Suits {
	    SPADES, 
	    HEARTS, 
	    DIAMONDS,
	    CLUBS;  
	}
	public enum Ranks {
		ACE,TWO,THREE,FOUR,FIVE,SIX,SEVEN,EIGHT,NINE,TEN,JACK,QUEEN,KING;
		}
	




//

	        private final Suits suit;

	        private final Ranks value;

	        public Card(Suits suit, Ranks value){
	             this.suit=suit;
	             this.value=value;
	        }


	        public Suits getSuit() {
	            return suit;
	        }

	        public Ranks getValue() {
	            return value;
	        }

	        @Override
	        public String toString() {
	          
	            return value + " of " + suit ;
	        }
	    }
		


