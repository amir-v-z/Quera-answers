import java.util.Scanner;

public class tavan_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int nextPowerOfTwo = 1;
    
        while (nextPowerOfTwo <= n) {
            nextPowerOfTwo *= 2;
        }

        System.out.println(nextPowerOfTwo);

        input.close();
    }
}