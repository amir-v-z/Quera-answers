import java.util.Scanner;

public class jenas_ghalb {

    // پاک‌سازی رشته: حذف فاصله‌ها، علائم و تبدیل حروف بزرگ به کوچک
    public static String cleanString(String input) {
        StringBuilder cleaned = new StringBuilder();
        for (char ch : input.toCharArray()) {
            if (Character.isLetterOrDigit(ch)) {
                cleaned.append(Character.toLowerCase(ch));
            }
        }
        return cleaned.toString();
    }

    // تابع بازگشتی برای بررسی جناس قلب
    public static boolean isPalindromeRecursive(String str, int start, int end) {
        if (start >= end) return true;
        if (str.charAt(start) != str.charAt(end)) return false;
        return isPalindromeRecursive(str, start + 1, end - 1);
    }

    // تابع اصلی برای بررسی جناس قلب
    public static boolean isPalindrome(String input) {
        String cleaned = cleanString(input);
        return isPalindromeRecursive(cleaned, 0, cleaned.length() - 1);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        String test = input.nextLine();

        if (isPalindrome(test)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

        input.close();
    }
}