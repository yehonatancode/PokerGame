
public class Game {
	protected static final int MAX_PLAYERS = 9;
	protected int currentp=0;
	protected Player[] players;

public Game() {
	
	
	
	
	
}

public static void main(String []args) {

	Player p = new Player();
	Player p1 = new Player();
	p.getHand();
	System.out.println(p.deck.size());
	System.out.println("Player's hand: "+ p.c[0] + "" + p.c[1]);
	p1.getHand();
	System.out.println("Opponents hand: " + p1.c[0] + "" + p1.c[1]);
	System.out.println(p.deck.size());
}


}
