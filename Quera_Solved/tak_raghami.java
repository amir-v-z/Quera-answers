import java.util.Scanner;

public class tak_raghami {

    static Long Sum(Long x) {
        long sum = 0 ;
        
        while (x > 0 || sum > 9) {
            if (x == 0) {
                x = sum;
                sum = 0;
            }
            sum += x % 10;
            x /= 10;
        }

        return sum;
    }



    public static void main (String args[]) {
        Scanner input = new Scanner(System.in);

        long x = (input.nextLong());
        System.out.println(Sum(x));

        input.close();
    }
}