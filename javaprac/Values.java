import java.io.IOException;
import java.util.Scanner;

public class Values {
    public static void main(String[] args) throws IOException {
        sum();

    }

    private static void sum()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of values");
        int number = scan.nextInt();
        int [] array = new int[number];
        int sum = 0;
        System.out.println("Enter the array elements");
        for (int i = 0; i < number; i++) {
            array[i] = scan.nextInt();  //Input array elements
            sum = sum + array[i];       //Calculating Sum
        }

        System.out.println("Sum:" + sum);
    }

}
