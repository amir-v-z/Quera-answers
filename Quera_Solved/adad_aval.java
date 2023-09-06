import java.util.Scanner;

public class adad_aval {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        int a = input.nextInt();
        int b = input.nextInt();

        for (int x = a; x <= b; x++) {
            int c = 0;
            for (int y = 1; y <= x; y++)
                if (x % y == 0)
                    c++;
                if (c == 2)
                    System.out.println(x);
        }

        input.close();
    }
}