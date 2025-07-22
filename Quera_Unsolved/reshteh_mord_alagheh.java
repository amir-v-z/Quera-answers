import java.util.Scanner;

public class reshteh_mord_alagheh {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        String x = input.nextLine(); // رشته اصلی مورد علاقه
        int n = input.nextInt(); // تعداد رشته‌هایی که بررسی میشن
        input.nextLine(); // بعد از عدد '\n' مصرف

        int count = 0;

        for (int i = 0; i < n; i++) {
            String y = input.nextLine();
            if (isSubsequence(x, y)) {
                count++;
            }
        }

        System.out.println(count);
        input.close();
    }

    // تابع بررسی زیر رشته‌ی ترتیبی
    public static boolean isSubsequence(String x, String y) {
        int i = 0, j = 0;
        while (i < x.length() && j < y.length()) {
            if (x.charAt(i) == y.charAt(j)) {
                i++;
            }
            j++;
        }
        return i == x.length();
    }
}