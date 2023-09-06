import java.util.Scanner;

public class name_bad {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        String s = input.next();

        if (s.length() % 2 == 0) {
            System.out.println("khoob");
        }

        else {
            System.out.println("bad");
        }

        input.close();
    }
}