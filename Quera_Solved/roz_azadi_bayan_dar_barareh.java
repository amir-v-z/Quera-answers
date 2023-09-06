import java.util.Scanner;

public class roz_azadi_bayan_dar_barareh {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        if (n % 2 == 0) {
            System.out.println("Bala Barare");
        }
        else {
            System.out.println("Payin Barare");
        }

        input.close();
    }
}