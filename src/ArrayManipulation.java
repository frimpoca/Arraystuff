import java.util.Random;

public class ArrayManipulation {

    public static void main(String[] args) {
        int[] dataPoints = new int[100];

        // Initialize array elements with random values between 1 and 100
        Random random = new Random();
        for (int i = 0; i < dataPoints.length; i++) {
            dataPoints[i] = random.nextInt(100) + 1;
        }

        // Display array values separated by " | "
        for (int i = 0; i < dataPoints.length; i++) {
            System.out.print(dataPoints[i]);
            if (i < dataPoints.length - 1) {
                System.out.print(" | ");
            }
        }
        System.out.println();

        // Calculate and display the sum and average
        int sum = 0;
        for (int value : dataPoints) {
            sum += value;
        }
        double average = (double) sum / dataPoints.length;

        System.out.println("The sum of the random array dataPoints is: " + sum);
        System.out.println("The average of the random array dataPoints is: " + average);
    }
}