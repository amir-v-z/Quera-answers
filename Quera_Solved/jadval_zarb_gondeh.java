import java.util.Scanner;

public class jadval_zarb_gondeh {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                System.out.print(i*j + " ");
            }
            System.out.println();
        }

        input.close();
    }
}