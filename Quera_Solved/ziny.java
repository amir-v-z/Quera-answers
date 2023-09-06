import java.util.Scanner;

public class ziny {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m,n;
        n = sc.nextInt();
        m = sc.nextInt();

        int a[][] = new int [n][m];

        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        int c =0 ;
        for(int i=1; i<n-1; i++)
            for(int j=1; j<m-1; j++)
                if(isZiny(a, i, j))
                    c++;

        System.out.println(c);

        sc.close();
    }

    public static boolean isZiny(int a[][], int i, int j) {
        if(a[i-1][j] < a[i][j] && a[i+1][j] < a[i][j] && a[i][j-1] > a[i][j] && a[i][j+1] > a[i][j])
            return true;

        if(a[i-1][j] > a[i][j] && a[i+1][j] > a[i][j] && a[i][j-1] < a[i][j] && a[i][j+1] < a[i][j])
            return true;
        return false;
    }
}