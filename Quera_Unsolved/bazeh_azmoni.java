import java.util.Scanner;

public class bazeh_azmoni {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int s = input.nextInt(); // زمان شروع آزمون
        int f = input.nextInt(); // زمان پایان آزمون
        int l = input.nextInt(); // مدت زمان پاسخگویی (استفاده‌ای نداره)
        int x = input.nextInt(); // زمان ورود فرد

        if (x < s) {
            System.out.println("exam did not started!");
        } else if (x >= f) {
            System.out.println("exam finished!");
        } else {
            int timeLeft = f - x; // زمان باقی‌مانده تا پایان آزمون
            System.out.println(timeLeft);
        }

        input.close();
    }
}