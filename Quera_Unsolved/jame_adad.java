import java.util.Scanner;

public class jame_adad {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        long sum = 0;

        for (int i = 0; i < n; i++) {
            sum += input.nextLong();
        }

        System.out.println(sum);

        input.close();
    }
}