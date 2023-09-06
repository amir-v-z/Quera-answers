import java.util.Scanner;

public class chapgar {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        int n = input.nextInt();
        int m = input.nextInt();

        Method1(n,m);
        Method2(m,n);
        Method3(n,m);

        input.close();
    }

    public static void Method1(int n, int m) {
        while(n>0) {
            for (int i=1; i<=m; i++) {
                System.out.print("X");
            }
            for (int i=1; i<=m; i++) {
                System.out.print(".");
            }
            for (int i=1; i<=m; i++) {
                System.out.print("X");
            }
            System.out.println();
            n--;
        }
    }

    public static void Method2(int n, int m) {
        while(m>0) {
            for (int i=1; i<=n; i++) {
                System.out.print(".");
            }
            for (int i=1; i<=n; i++) {
                System.out.print("X");
            }
            for (int i=1; i<=n; i++) {
                System.out.print(".");
            }
            System.out.println();
            m--;
        }
    }

    public static void Method3(int n, int m) {
        while(n>0) {
            for (int i=1; i<=m; i++) {
                System.out.print("X");
            }
            for (int i=1; i<=m; i++) {
                System.out.print(".");
            }
            for (int i=1; i<=m; i++) {
                System.out.print("X");
            }
            System.out.println();
            n--;
        }
    }
}