import java.util.Scanner;

public class shomareh_telephon {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        int n = input.nextInt();

        for (int i=0; i<n; i++) {

            String num = input.next();

            if (num.length() == 11 && num.startsWith("09")) {
                System.out.println("+98" + num.substring(1,11));
            } else if (num.length() == 12 && num.startsWith("98")) {
                System.out.println("+" + num);
            } else if (num.length() == 13 && num.startsWith("+98")) {
                System.out.println(num);
            } else {
                System.out.println("invalid");
            }
        }

        input.close();
    }
}