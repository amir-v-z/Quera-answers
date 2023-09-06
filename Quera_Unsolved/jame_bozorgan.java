import java.util.Scanner;

public class jame_bozorgan {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        int x = input.nextInt();
        String z = input.next();
        int y = input.nextInt();

        if (z.equals("+")) {
            System.out.println(x + y);
        }

        if (z.equals("*")) {
            String zz = String.valueOf(y);
            System.out.print(x + zz.substring(1));
            // System.out.println(x * y);
        }

        input.close();
    }
}