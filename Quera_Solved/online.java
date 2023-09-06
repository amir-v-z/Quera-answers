import java.util.Scanner;

public class online {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int x = input.nextInt();

        int y = 1401 * x;

        System.out.println(13 - y);

        input.close();
    }
}