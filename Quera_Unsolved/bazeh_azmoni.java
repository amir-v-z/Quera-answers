import java.util.Scanner;

public class bazeh_azmoni {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        int s = input.nextInt();
        int f = input.nextInt();
        int l = input.nextInt();
        int x = input.nextInt();

        if (x < s) {
            System.out.println("exam did not started!");
        }

        if (x==f || x > f) {
            System.out.println("exam finished!");
        }

        if (x>=s && x<f) {
            int z = f - x;
            System.out.println(z);
        }

        input.close();
    }
}