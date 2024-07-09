import java.util.Scanner;

public class jame_do_adad {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int x = input.nextInt();
        int y = input.nextInt();

        System.out.println(x+y);

        input.close();
    }
}