/**
 * IntArray
 */
public class IntArray implements Countable {
    int intArray[];

    IntArray(int[] intArray) {
        if (intArray == null) {
            intArray = new int[0];
        } else {
            this.intArray = intArray;
        }
    }

    @Override
    public int count() {
        return intArray.length;
    }

}