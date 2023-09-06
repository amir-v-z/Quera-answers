import java.util.Scanner;

public class kaktos_hay_por_dardsar {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        int n = input.nextInt();

        for (int i=0; i<n; i++) {

            int a = input.nextInt();

            if (a==1 || a==2 || a==3) {
                for (int j=0; j<a; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }

            else {
                System.out.println("*");
            }
        }

        input.close();
    }
}