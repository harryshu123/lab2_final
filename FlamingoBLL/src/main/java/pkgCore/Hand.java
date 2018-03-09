package pkgCore;

import java.util.ArrayList;
import java.util.Collections;

import org.apache.commons.math3.analysis.function.Add;

import pkgEnum.eRank;

public class Hand {

	private int iScore;
	private ArrayList<Card> hand = new ArrayList<Card>();
	//private Deck shoe = new Deck(6);
	
	public Hand() throws Exception
	{
		//Draw(shoe);
		//Draw(shoe);
	}
	
	
	public int[] ScoreHand()
	{
		
		int [] iScore = new int[2];
		
		iScore[0] = 0;
		iScore[1] = 0;
		
		int[] scoreHand = new int[2];
//		int Minpoints = 0;
//		int Maxpoints = 0;
		boolean aceInHand = false;
		int numAces	= 0;
		for (Card c: hand)
		{	
			iScore[0] = iScore[0] + c.geteRank().getCardValueMin(); // min scores
			iScore[1] = iScore[1] + c.geteRank().getCardValueMax(); // max scores
			if(c.geteRank() == eRank.ACE) {
				aceInHand = true;
				numAces ++;
			}
			
			while(iScore[1] > 21 && numAces != 0) {
				iScore[1] -= 10;
				numAces --;
			}
			/*int cardValueMin = c.geteRank().getCardValueMin();
			Minpoints += cardValueMin;
			int cardValueMax = c.geteRank().getCardValueMax();
			Maxpoints += cardValueMax;*/
			if(aceInHand) {
				iScore[1] = iScore[0] + 10;
			}else {
				iScore[1] = iScore[0];
				
			}
			
			
		}
		
		return iScore;
	}
	
	public void Draw(Deck d) throws Exception
	{
		hand.add(d.draw());
	}
	
	private void AddCard(Card c)
	{
		hand.add(c);
	}
	
}
