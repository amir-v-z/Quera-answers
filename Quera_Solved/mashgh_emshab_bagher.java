import java.util.Scanner;

public class mashgh_emshab_bagher {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        int z = 0;

        int a = input.nextInt();
        if (a == 0) {
            z++;
        }

        int b = input.nextInt();
        if (b == 0) {
            z++;
        }

        int c = input.nextInt();
        if (c == 0) {
            z++;
        }

        if(a + b + c > 180 || a + b + c < 180) {
            z++;
        }

        if (z > 0) {
            System.out.println("No");
        }

        if (z == 0) {
            System.out.println("Yes");
        }

        input.close();
    }
}