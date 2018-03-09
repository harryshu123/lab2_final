package pkgCore;
import pkgEnum.eRank;
import pkgEnum.eSuit;

public class Card implements Comparable {
	
	private eRank eRank;
	private eSuit eSuit;
	
	
	@Override
	public int compareTo(Object o) {
		Card c = (Card) o;
		if(c.geteRank().getiRankNbr() - this.geteRank().getiRankNbr() == 0) {
			return this.eSuit.ordinal() - c.eSuit.ordinal();
		}
		return c.geteRank().getiRankNbr() - this.geteRank().getiRankNbr();
}


	public Card(eRank eRank, eSuit eSuit) {
		super();
		this.eRank = eRank;
		this.eSuit = eSuit;
		
	}


	public eRank geteRank() {
		return eRank;
	}


	private void seteRank(eRank eRank) {
		this.eRank = eRank;
	}


	public eSuit geteSuit() {
		return eSuit;
	}


	private void seteSuit(eSuit eSuit) {
		this.eSuit = eSuit;
	}
	
}
