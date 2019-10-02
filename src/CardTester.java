/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */
                
               /* card 1 */
               Card x = new Card("king", "clubs", 13);
               System.out.println("My card is ranked: " + x.rank());
               System.out.println("My card is the: " + x.suit() + " suit");
               System.out.println("My card is worth: " + x.pointValue() + " points");
               System.out.println(x); // test the toString Method
               /* card 2 */
               Card y = new Card("king", "clubs", 13);
               System.out.println("My card is ranked: " + y.rank());
               System.out.println("My card is the: " + y.suit() + " suit");
               System.out.println("My card is worth: " + y.pointValue() + " points");
               System.out.println(y); // test the toString Method
               System.out.println("this should be true: " + x.matches(y));
               /* card 3 */
               Card z = new Card("zorgon", "purple", 800);
               System.out.println("My card is ranked: " + z.rank());
               System.out.println("My card is the: " + z.suit() + " suit");
               System.out.println("My card is worth: " + z.pointValue() + " points");
               System.out.println(z); // test the toString Method
               System.out.println("this should be false: " + x.matches(z))
	}
}
