package pkgCore;

import static org.junit.Assert.*;

import java.util.Collections;

import org.junit.Test;

import pkgCore.Deck;

public class DeckTest {

	@Test
	public void TestDeck() throws Exception {
		
		for (int a = 0; a < 10000; a++) {
			Deck d = new Deck();
			if (d.deckSize() < 52){
				System.out.println("too small");
				fail("Too few cards in deck");
			}else if(d.deckSize() > 52) {
				System.out.println("too big");
				fail("Too many cards in deck");
			}
		}

		for (int a = 0; a < 10000; a++) {
			Deck dsix = new Deck(6);
			if (dsix.deckSize() < 6*52){
				System.out.println("multiple decks too small");
				fail("Too few cards in deck");
			}else if(dsix.deckSize() > 6*52) {
				System.out.println("multiple decks too big");
				fail("Too many cards in deck");
			}
		}
	}
}
