import java.util.Scanner;

public class do_noghte_khat {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        int x1 = input.nextInt();
        int y1 = input.nextInt();
        int x2 = input.nextInt();
        int y2 = input.nextInt();

        if (x1==x2) {
            System.out.println("Vertical");
        }

        if (y1==y2) {
            System.out.println("Horizontal");
        }

        if (x1 != x2 && y1 != y2) {
            System.out.println("Try again");
        }

        input.close();
    }
}