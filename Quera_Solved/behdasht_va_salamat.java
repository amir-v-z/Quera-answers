import java.util.Scanner;

public class behdasht_va_salamat {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        int x = input.nextInt();
        int n = input.nextInt();

        System.out.println(nomreh(x,n));

        input.close();
    }

    public static int nomreh (int x , int n) {
        int nomreh = x-n;

        if (n==0) {
            return 20;
        }

        if (n==7) {
            return x;
        }

        if (nomreh<=0) {
            return 0;
        }

        else {
            return nomreh;
        }
    }
}