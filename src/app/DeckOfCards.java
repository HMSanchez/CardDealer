//Harrisen Sanchez
//2/8/17
package app;

import java.util.Random;

import app.Card.Ranks;
import app.Card.Suits;

public class DeckOfCards {

	private Card cards[];
	private int currentCount = 52;
	private int size;
	private Suits suits[];
	private Ranks values[];

	
	public DeckOfCards() {
		size = 52;
		currentCount = 0;
		cards = new Card[size];
		suits = Suits.values();
		values = Ranks.values();

		for (int i = 0; i < suits.length; i++) {
			for (int j = 0; j < values.length; j++) {
				cards[currentCount++] = new Card(suits[i], values[j]);
			}
		}
	}
		    public void shuffle(int numberOftime){

		        Random rand= new Random();


		        for(int i=0;i<numberOftime;i++){
		            int m=rand.nextInt(currentCount);
		            int n=rand.nextInt(currentCount);

		            Card temp=cards[m];
		            cards[m]=cards[n];
		            cards[n]=temp;
		        }

		    }
		    public void deal(){
		        System.out.println(cards[--currentCount]);
		      
		    }
		    public String toString(){

		        StringBuilder sb=new StringBuilder();

		        for(int i=0;i < currentCount;i++){
		            sb.append(cards[i]);
		            sb.append(" ");
		        }

		        return sb.toString();
		    }
		    public void resetdeck(){
		        currentCount=52;
		    }
		public void cardsLeft(){
			System.out.println(currentCount + " Cards left in the deck");
		}
		
	}

