import java.util.Scanner;

public class mashgh_mahtab {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        int n = input.nextInt();

        int sum = 0;

        for(int i=1; i<n; i+=2){
            sum += i;
        }

        System.out.println(sum);

        input.close();
    }
}