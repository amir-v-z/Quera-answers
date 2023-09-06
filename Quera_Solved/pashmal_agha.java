import java.util.Scanner;

public class pashmal_agha {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        int n = input.nextInt();
        float k = input.nextFloat();
        int p = input.nextInt();

        float price = n * k * p;

        System.out.println((int)price);

        input.close();
    }
}