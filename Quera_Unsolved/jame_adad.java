import java.util.Scanner;

public class jame_adad {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        long sum = 0;

        int i = 0;

        int n = input.nextInt();

        while (true) {
            sum += input.nextLong();
            i++;
            if(i == n){
                break;
            }
        }

        System.out.println(sum);

        input.close();
    }
}