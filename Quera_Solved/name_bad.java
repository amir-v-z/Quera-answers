import java.util.Scanner;

public class name_bad {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        String s = input.next();

        for (int i=0; i<s.length(); i++) {
            int res = 1;
            while (i<s.length()-1 && s.charAt(i)==s.charAt(i+1)) {
                res++;
                i++;
            }
            if (res % 2 == 1) {
                System.out.println("bad");
                return;
            }
        }
        System.out.println("khoob");

    }
}