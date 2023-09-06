import java.util.Scanner;

public class mabnay_aynei {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String a = String.valueOf(input.nextInt());
        int b = input.nextInt();
        int c = input.nextInt();

        int x = Integer.valueOf(baseConversion(a, b, c));
        int y = Integer.valueOf(baseConversion(a, b, c));

        int reversed = 0;
        for(;x != 0; x /= 10) {
            int digit = x % 10;
            reversed = reversed * 10 + digit;
        }

        if (y==reversed) {
            System.out.println("YES");
        } 
        else {
            System.out.println("NO");
        }

    }

    public static String baseConversion(String a, int b, int c){
        return Integer.toString(Integer.parseInt(a, b), c);
    }
}