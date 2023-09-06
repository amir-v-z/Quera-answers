import java.util.Scanner;

public class maximum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        
        int max = 0;

        for (int i=0; i<n; i++) {

            int x = input.nextInt();

            if (x > max) {
                max = x;
            }
        }

        System.out.println(max);

        input.close();
    }
}