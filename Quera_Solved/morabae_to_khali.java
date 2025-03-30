import java.util.Scanner;

public class morabae_to_khali {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a = input.nextInt(); // مربع بیرونی
        int b = input.nextInt(); // مربع درونی

        if (b >= a) {
            System.out.println("Wrong order!");
        }
        else if ((a - b) % 2 != 0) {
            System.out.println("Wrong difference!");
        }
        else {
            int margin = (a - b) / 2;
            for (int i = 0; i < a; i++) {
                for (int j = 0; j < a; j++) {
                    if (i < margin || i >= a - margin || j < margin || j >= a - margin) {
                        System.out.print("* ");
                    } else {
                        System.out.print("  ");
                    }
                }
                System.out.println();
            }
        }

        input.close();
    }
}