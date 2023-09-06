import java.util.Scanner;

public class to_cheghdar_ezafeh_vazn_dari {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        int n = input.nextInt();
        float m = input.nextFloat();

        float bmi = n / (m*m);
        System.out.printf("%.2f",bmi);
        System.out.println();

        if (bmi < 18.5) {
            System.out.println("Underweight");
        }

        if (18.5 <= bmi && bmi < 25) {
            System.out.println("Normal");
        }

        if (25 <= bmi && bmi < 30) {
            System.out.println("Overweight");
        }

        if (bmi >= 30) {
            System.out.println("Obese");
        }

        input.close();
    }
}