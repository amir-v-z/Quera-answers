import java.util.Scanner;

public class komak_be_kapy {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        int n = input.nextInt();
        String s = input.next();

        for (int i=0; i<n; i++) {
            System.out.print("copy of ");
        }
        System.out.print(s);

        input.close();
    }
}