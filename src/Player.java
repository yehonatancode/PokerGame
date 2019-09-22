import java.util.List;

public class Player extends Deck {

protected int stack;
protected int level;
protected double winvalue;
protected Cards[] c = new Cards[2];


public Player() {
	this.stack=0;
	this.level=0;
	this.winvalue=0;
}
public Player(int s, int l, int wv) {
	stack=s;
	level=l;
	winvalue=wv;
} 
public void getHand() {
	int firstcard = (int) (Math.random()*deck.size());
	this.c[0]=deck.get(firstcard);
	deck.remove(firstcard);
	int secondcard = (int) (Math.random()*deck.size());
	this.c[1]=deck.get(secondcard);
    deck.remove(secondcard);
	
	
}

}