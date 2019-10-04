/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
            //RETURN ASSETS
            String[] suits = {"clubs", "hearts", "diamonds", "spades"};
            String[] ranks = {"ace", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "jack", "queen", "king"};
            int[] pointValues = {1,2,3,4,5,6,7,8,9,10,11,12,13};
            
            //NEW ASSETS
            String[] time = {"sometimes", "all the time", "but it do", "but it be"};
            String[] b = {"it be like that", "how it be", "what it do", "sad, ", "when", "they say AAAAA,", "seven", "eight", "nine", "ten", "jack", "queen", "king"};
            int[] why = {1,2,3,4,5,6,7,8,9,10,11,12,13};
                 
            /*** Example deck 1 ***/
            System.out.println("TESTING DECK 1");
            //create a deck
            Deck cashMoney = new Deck(ranks, suits, pointValues);
            //test its size
            System.out.println(cashMoney.size());
            //deal one card
            Card x = cashMoney.deal();
            System.out.println("Have a card");
            System.out.println("Now my deck size is: " + cashMoney.size());
            // test two string
            System.out.println(cashMoney);
            //deal until empty
            
            /*** Example deck 2 ***/
            System.out.println("TESTING DECK 2");
            //create a deck
            Deck magicEightBall = new Deck(b, time, why);
            //test its size
            System.out.println(magicEightBall.size());
            //deal one card
            Card y = magicEightBall.deal();
            System.out.println("Have a card");
            System.out.println("Now my deck size is: " + magicEightBall.size());
            // test two string
            System.out.println(magicEightBall);
            //deal until empty
            
	}
}

