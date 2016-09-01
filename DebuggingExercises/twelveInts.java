/**
 * Created by Daniel on 9/1/16.
 */
public class twelveInts {
    public static void main(String[] args) {
        int[] numbers = {0,1,2,3,4,5,6,7,8,9,10,11,12};
        int i;

        for (i = 0; i < numbers.length; ++i) {
            System.out.println(numbers[i]);
        }
        System.out.println("-------");

        for (i = 12; i > -1; i--) {
            System.out.println(numbers[i]);
        }
    }
}
