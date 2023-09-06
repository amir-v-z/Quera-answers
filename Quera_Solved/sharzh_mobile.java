import java.util.Scanner;

public class sharzh_mobile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int z = 0;
        int n = input.nextInt();

        if (n==1) {
            System.out.println("1");
        }

        else {
            for(int i=0; i<n; i++) {
                z += i+1;
            }
            System.out.println(z);
        }

        input.close();
    }
}