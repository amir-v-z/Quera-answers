import java.util.Scanner;

public class harkat_roy_zorof {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        float a = input.nextFloat();
        float b = input.nextFloat();
        float c = input.nextFloat();

        Float avg = (a+b+c) / 3;

        if (a==b && b==c) {
            System.out.println(0);
        }
        else if (a == avg || b == avg || c == avg) {
            System.out.println(1);
        }
        else {
            System.out.println(2);
        }

        input.close();
    }
}