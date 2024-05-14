import java.util.Scanner;

public class aval_biny {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        int a = input.nextInt();
        int b = input.nextInt();

        StringBuilder output = new StringBuilder();
        for (int j=a+1; j<b; j++) {
            if (isPrime(j)) {
                output.append(j).append(",");
            }
        }

        // Remove the last comma from the output
        if (output.length() > 0) {
            output.deleteCharAt(output.length() - 1);
        }

        System.out.println(output.toString());

        input.close();
    }

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i=2; i*i<=number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}