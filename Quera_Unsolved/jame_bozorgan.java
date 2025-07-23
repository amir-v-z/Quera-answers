import java.util.Scanner;

public class jame_bozorgan {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        int x = input.nextInt();
        String op = input.next();
        int y = input.nextInt();

        if (op.equals("+")) {
            System.out.println(x + y);
        } else if (op.equals("*")) {
            System.out.println(x * y);
        }

        input.close();
    }
}