import java.util.Scanner;

public class yakhdarchi {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        int T = input.nextInt();

        if (T > 100) {
            System.out.println("Steam");
        }

        if (T < 0 && T > -273) {
            System.out.println("Ice");
        }

        if (T==0 || T == 100 || T <= -273) {
            System.out.println("Water");
        }

        input.close();
    }
}