
/**
 * This class provides a convenient way to test shuffling methods.
 */
public class Shuffler {

    /**
     * The number of consecutive shuffle steps to be performed in each call to
     * each sorting procedure.
     */
    private static final int SHUFFLE_COUNT = 12;

    /**
     * Tests shuffling methods.
     *
     * @param args is not used.
     */
    public static void main(String[] args) {
        System.out.println("Results of " + SHUFFLE_COUNT
                + " consecutive perfect shuffles:");
        int[] values1 = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
        for (int j = 1; j <= SHUFFLE_COUNT; j++) {
            perfectShuffle(values1);
            System.out.print("  " + j + ":");
            for (int k = 0; k < values1.length; k++) {
                System.out.print(" " + values1[k]);
            }
            System.out.println();
        }
        System.out.println();
        
        // EXTRA CREDIT
        System.out.println("Results of " + SHUFFLE_COUNT
                + " consecutive perfect IN shuffles:");
        int[] valuesEx = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
        for (int j = 1; j <= SHUFFLE_COUNT; j++) {
            perfectInShuffle(valuesEx);
            System.out.print("  " + j + ":");
            for (int k = 0; k < valuesEx.length; k++) {
                System.out.print(" " + valuesEx[k]);
            }
            System.out.println();
        }
        System.out.println();
        // END EXTRA

        System.out.println("Results of " + SHUFFLE_COUNT
                + " consecutive efficient selection shuffles:");
        int[] values2 = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
        for (int j = 1; j <= SHUFFLE_COUNT; j++) {
            selectionShuffle(values2);
            System.out.print("  " + j + ":");
            for (int k = 0; k < values2.length; k++) {
                System.out.print(" " + values2[k]);
            }
            System.out.println();
        }
        System.out.println();
    }

    /**
     * Apply a "perfect shuffle" to the argument. The perfect shuffle algorithm
     * splits the deck in half, then interleaves the cards in one half with the
     * cards in the other.
     *
     * @param values is an array of integers simulating cards to be shuffled.
     */
    public static void perfectShuffle(int[] values) {
        /* *** TO BE IMPLEMENTED IN ACTIVITY 3 *** */
        //make a temp array of the same length
        int[] iWannaBeARealArray = new int[values.length];
        
        //save the midpoint (mid) for easy reference
        int mid = values.length / 2;
        
        //temppos int that will go up by two
        int temppos = 0;
        
        //make a counter (k) that will go up by one
        int k = 0;
        
        //loop k from 0  mid	
        for(; k < mid; k++){
            //copy from original array at k to new array
            //   at position unshuffled
            iWannaBeARealArray[temppos] = values[k];
            
            //increase unshuffled by two
            temppos += 2;
        
        }

        //reset our unshuffled counter to 1 (instead of 0)
        temppos = 1;
        
        //another loop: from where k left off to the end
        for(; k < values.length ; k++){
            //same as before
            iWannaBeARealArray[temppos] = values[k];
            temppos += 2;
        }
        
        // Copy elements back to original array
        for(int i = 0; i < values.length; i++){
            values[i] = iWannaBeARealArray[i];
        }
          
    }//closes shuffle
    
    public static void perfectInShuffle(int[] values) {
        /* *** TO BE IMPLEMENTED IN ACTIVITY 3 *** */
        //TODO: make a perfect out shuffle for extra credit (maybe overload??)
        //make a temp array of the same length
        int[] iWannaBeARealArray = new int[values.length];
        
        //save the midpoint (mid) for easy reference
        int mid = values.length / 2;
        
        //temppos int that will go up by two
        int temppos = 1;
        
        //make a counter (k) that will go up by one
        int k = 0;
        
        //loop k from 0  mid	
        for(; k < mid; k++){
            //copy from original array at k to new array
            //   at position unshuffled
            iWannaBeARealArray[temppos] = values[k];
            
            //increase unshuffled by two
            temppos += 2;
        
        }

        //reset our unshuffled counter to 1 (instead of 0)
        temppos = 0;
        
        //another loop: from where k left off to the end
        for(; k < values.length ; k++){
            //same as before
            iWannaBeARealArray[temppos] = values[k];
            temppos += 2;
        }
        
        // Copy elements back to original array
        for(int i = 0; i < values.length; i++){
            values[i] = iWannaBeARealArray[i];
        }
          
    }//closes shuffle


    /**
     * Apply an "efficient selection shuffle" to the argument. The selection
     * shuffle algorithm conceptually maintains two sequences of cards: the
     * selected cards (initially empty) and the not-yet-selected cards
     * (initially the entire deck). It repeatedly does the following until all
     * cards have been selected: randomly remove a card from those not yet
     * selected and add it to the selected cards. An efficient version of this
     * algorithm makes use of arrays to avoid searching for an as-yet-unselected
     * card.
     *
     * @param values is an array of integers simulating cards to be shuffled.
     */
    public static void selectionShuffle(int[] values) {
        /* *** TO BE IMPLEMENTED IN ACTIVITY 3 *** */
        for(int k=values.length - 1; k > 0; k--){
            int pos = (int)(Math.random()*(k+1));
            //copy from pos to temp
            int temp = values[pos];
            //copy from k to pos
            values[pos] = values[k];
            //copy from temp to k
            values[k] = temp;
        }
    }
}
