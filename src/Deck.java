import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Deck extends Cards {
ArrayList<Cards> deck = new ArrayList<Cards>();
String []suits = {"Diamonds","Hearts","Spades","Clubs"};
String []ranks = {"2","3","4","5","6","7","8","9","10","J","Q","K","A"};


public Deck() {
for(int i=0;i<13;i++) {
	for(int j=0;j<4;j++) {
deck.add(new Cards(suits[j],ranks[i]));
	}
}

}
}
