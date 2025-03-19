import java.util.Scanner;

public class dayereh_ajib {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int k = input.nextInt();

        int position = 0; // شروع از حسنی
        int steps = 0;

        do {
            position = (position + k) % n; // حرکت به جلو
            steps++; // شمارش مراحل
        } while (position != 0); // تکرار تا زمانی که دوباره به حسنی برسد

        System.out.println(steps);

        input.close();
    }
}