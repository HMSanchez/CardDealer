//Harrisen Sanchez
//2/8/17
package app;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test {

	public static void run() throws IOException {
		BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
		DeckOfCards one = new DeckOfCards();

		boolean valid = false;
		System.out.println("Welcome to Dealing Cards");

		do {
			System.out.println("Main Menu");
			System.out.println("1) Deal a Card");
			System.out.println("2) Shuffle Deck");
			System.out.println("3) Number of Cards left");
			System.out.println("4) Exit");
			System.out.print("Make a selection: ");
			String options = read.readLine();
			int opt = Integer.parseInt(options);
			if (opt > 4 || opt < 0) {
				System.out.println("Invalid");
				valid = false;
			}
			switch (opt) {
			case 1:
				one.shuffle(52);
				one.deal();
				break;
			case 2:
				one.resetdeck();
				System.out.println("Deck reshuffled");
				break;
			case 3:
				one.cardsLeft();
				break;
			case 4:
				System.out.println("Quiting program");
				valid = true;
				break;
			}
		} while (!valid);

	}

}
