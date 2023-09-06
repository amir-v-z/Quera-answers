import java.util.Scanner;

public class sope_sabzijat {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        int n = input.nextInt();
        float k = input.nextFloat();
        float s = input.nextFloat();

        float sum = n * k;

        if (sum == s || sum < s) {
            System.out.println("Kafie!");
        }
        else {
            System.out.println("Na! yeki bayad bere sabzi bekhare");
        }

        input.close();
    }
}