import java.util.Scanner;

public class reshteh_cheker {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        String x = input.next().substring(0,1);

        String y = input.next();
        StringBuilder z = new StringBuilder(y);
        z.reverse();
        String q = z.toString().substring(0,1);

        if (x.equals(q)) {
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }

        input.close();
    }
}