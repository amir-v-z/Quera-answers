import java.util.Scanner;

public class do_shoghleh {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        String x = input.next();

        String[] zoj = {"shanbe","doshanbe","chaharshanbe"};
        String[] fard = {"yekshanbe","seshanbe","panjshanbe"};

        for (String z : zoj) {
            if (x.equals(z)) {
                System.out.println("perspolis");
            }
        }

        for (String f : fard) {
            if (x.equals(f)) {
                System.out.println("bahman");
            }
        }

        if (x.equals("jome")) {
            System.out.println("tatil");
        }

        input.close();
    }
}