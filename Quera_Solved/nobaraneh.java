import java.util.Scanner;

public class nobaraneh {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        int sum =0;

        int x1 = input.nextInt();
        if (x1 >= 80) {
            sum+=1;
        }

        int x2 = input.nextInt();
        if (x2 >= 80) {
            sum+=1;
        }

        int x3 = input.nextInt();
        if (x3 >= 80) {
            sum+=1;
        }

        int x4 = input.nextInt();
        if (x4 >= 80) {
            sum+=1;
        }

        int x5 = input.nextInt();
        if (x5 >= 80) {
            sum+=1;
        }

        if (sum >= 3) {
            System.out.println("Mamma mia!");
        }

        if (sum == 1 || sum == 2) {
            System.out.println("Mamma mia!!");
        }

        if (sum == 0) {
            System.out.println("Mamma mia!!!");
        }

        input.close();
    }
}