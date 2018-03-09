package pkgEnum;

public enum eRank {

	TWO(2,2,2), THREE(3,3,3), FOUR(4,4,4), FIVE(5,5,5), SIX(6,6,6), SEVEN(7,7,7), EIGHT(8,8,8), NINE(9,9,9), TEN(10,10,10), JACK(11,10,10), QUEEN(12,10,10), KING(
			13,10,10), ACE(14,1,11);

	private int iRankNbr;
	private int CardValueMin;
	private int CardValueMax;
	
	
	
	
	public int getCardValueMin() {
		return CardValueMin;
	}

	public void setCardValueMin(int cardValueMin) {
		CardValueMin = cardValueMin;
	}

	public int getCardValueMax() {
		return CardValueMax;
	}

	public void setCardValueMax(int cardValueMax) {
		CardValueMax = cardValueMax;
	}

	private eRank(int iRankNbr, int CardValueMin, int CardValueMax) {
		this.CardValueMax = CardValueMax;
		this.CardValueMin = CardValueMin;
		this.iRankNbr = iRankNbr;
	}

	public int getiRankNbr() {
		return iRankNbr;
	}

}
