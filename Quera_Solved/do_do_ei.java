import java.util.Scanner;

public class do_do_ei {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        int n = input.nextInt();

        if (n > 1401) {
            System.out.println("YES");
        }

        else {
            System.out.println("NO");
        }

        input.close();
    }
}