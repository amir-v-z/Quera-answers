import java.util.Scanner;

public class kooler_ya_bokhari {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        int n = input.nextInt();

        for (int i=0; i<n; i++) {
            int x = input.nextInt();

            if (x > 15) {
                System.out.println("cooler");
            }

            if (x <= 15) {
                System.out.println("heater");
            }
        }

        input.close();
    }
}