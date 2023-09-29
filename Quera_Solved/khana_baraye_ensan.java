import java.util.Scanner;

public class khana_baraye_ensan {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        int n = input.nextInt();

        for (int i=1; i<=n; i++) {
            int x = input.nextInt();

            if (x>=1 && x<=1023) {
                System.out.println(x + "B");
            }
            else if (x>=1024 && x<=1048575) {
                System.out.println(x/1024 + "KiB");
            }

            else if (x>=1048576 && x<=1073741824) {
                System.out.println(x/1048576 + "MiB");
            }
        }

        input.close();
    }
}