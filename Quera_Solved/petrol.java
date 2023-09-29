import java.util.Scanner;

public class petrol {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        int n = input.nextInt();
        int k = input.nextInt();

        int b = k + 60;

        if (n<=59 || n<=b) {
            int a = n * 1500;
            System.out.println(a);
        }
        else {
            int b1 = b * 1500;
            int c = n - b;
            int c1 = c * 3000;
            int sum = b1 + c1;
            System.out.println(sum);
        }

        input.close();
    }
}