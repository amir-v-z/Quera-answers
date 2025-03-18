import java.util.Scanner;

public class bi_mim_abolfazl {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String s = input.next();

        if (s.contains("m")) {
            System.out.println("No");
        }
        else {
            System.out.println("Yes");
        }

        input.close();
    }
}