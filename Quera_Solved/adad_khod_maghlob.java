import java.util.Scanner;

public class adad_khod_maghlob {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        String x = input.next();

        StringBuilder y = new StringBuilder(x);
        y.reverse();

        String z = y.toString();

        if (x.equals(z)) {
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }

        input.close();
    }
}