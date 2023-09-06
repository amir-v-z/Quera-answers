import java.util.Scanner;

public class chap_moraba {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        int n = input.nextInt();

        for (int i=0; i<n; i++) {
            System.out.print("*");
        }

        System.out.println();

        for (int z=0; z<n-2; z++) {
            System.out.print("*");

            for (int z1=0; z1<n-2; z1++) {
                System.out.print(" ");
            }

            System.out.println("*");
        }

        for (int j=0; j<n; j++) {
            System.out.print("*");
        }

        input.close();
    }
}