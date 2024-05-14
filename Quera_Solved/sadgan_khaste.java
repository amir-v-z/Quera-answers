import java.util.Scanner;

public class sadgan_khaste {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        String x = input.next();
        String y = input.next();

        if (x.equals(y)) {
            System.out.println(x + " = " + y);
        }

        else {
            String z1 = x.substring(2,3);
            String z2 = y.substring(2,3);
            int num1 = Integer.parseInt(z1);
            int num2 = Integer.parseInt(z2);

            if (num1 < num2) {
                System.out.println(x + " < " + y);
            }

            else {
                System.out.println(y + " < " + x);
            }
        }
        
        input.close();
    }
}