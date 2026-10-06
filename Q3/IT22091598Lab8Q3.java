import java.util.Scanner;

public class IT22091598Lab8Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = new int[6];
        int i = 0;

        while (i < 6) {
            System.out.print("Enter a Positive Number (" + (i + 1) + "/6): ");
            int num = scanner.nextInt();

            if (num <= 0) {
                System.out.println("Error: Please Enter ONLY Positive Numbers");
            } else {
                numbers[i] = num;
                i++;
            }
        }

        System.out.println("Array Contents:");

        int max = numbers[0];

        for (int j = 0; j < 6; j++) {
            System.out.print(numbers[j] + " ");

            if (numbers[j] > max) {
                max = numbers[j];
            }
        }

        System.out.println();

        System.out.println("The Maximum Number Entered: " + max);

        scanner.close();
    }
}