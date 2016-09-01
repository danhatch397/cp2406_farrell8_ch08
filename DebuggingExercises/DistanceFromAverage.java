import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Created by Daniel on 9/1/16.
 */
public class DistanceFromAverage {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        double[] numbers = new double[20];
        double sum = 0;
        double average = 0;
        int count = 0;
        DecimalFormat df = new DecimalFormat("#.##");

        for (int i = 0; i < 20; ++i) {
            System.out.println("Enter number " + (i + 1) + "/20. Enter '99999' at any time to quit.");
            double userNum = kb.nextDouble();
                if (userNum != 99999) {
                    numbers[i] = userNum;
                    sum = (sum + userNum);
                    count++;
                } else if (userNum == 99999) {
                    break;
                }
        }
        average = sum / count;
        System.out.println("The average is: " + average);
        for (int i = 0; i < count; ++i) {
            System.out.println(numbers[i] + " is " + (Math.abs(Double.parseDouble(df.format(average - numbers[i])))) + " from the average.");
        }
    }
}
