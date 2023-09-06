import java.util.Scanner;

public class morabaha_va_moshkelat_eghtesadi {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        int n = input.nextInt();
        int k = input.nextInt();

        int x = n*k;
        int[] s = new int[n];

        int y =0;

        for(int i=0; i<n; i++) {
            s[i] = input.nextInt();
            y += s[i]-k;
        }

        int z = -(y / k);

        if(y >= x) {
            System.out.println(0);
        }
        else{
            System.out.println(z);
        }
        input.close();
    }
}