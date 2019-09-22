import java.util.ArrayList;

public class Cards {
protected String suit;
protected String rank;
 
public Cards() {
	
}

public Cards(String suit, String rank) {
	this.suit=suit;
	this.rank=rank;
}

public String getSuit() {
	return suit;
}

public void setSuit(String suit) {
	this.suit = suit;
}

public String getRank() {
	return rank;
}

public void setRank(String rank) {
	this.rank = rank;
}

@Override
public String toString() {
	return "" + rank + " of " + suit;
}


}
