import java.util.Scanner;

public class kamel_bodan_ya_nabodan {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        int n = input.nextInt();

        int sum = 0;

        for (int i=1; i<n; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        
        if(n==sum) {
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }

        input.close();
    }
}