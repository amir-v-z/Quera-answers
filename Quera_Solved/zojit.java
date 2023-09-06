import java.util.Scanner;

public class zojit {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        int n = input.nextInt();
        int[] numbers = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47};
        int count = 0;

        for(int i=0; i<numbers.length; i++) {

            if (n==numbers[i]) {
                count = count + 1;
            }

        }

        if (n%2!=0 && count==1) {
            System.out.println("zoj");
        }

        else {
        System.out.println("fard");
        }

        input.close();
    }
}