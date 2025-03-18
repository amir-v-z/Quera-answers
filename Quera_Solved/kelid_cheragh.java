import java.util.ArrayList;
import java.util.Scanner;

public class kelid_cheragh {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> mode = new ArrayList<>();

        int n = input.nextInt();

        int i=0;
        while (i < n) {
            int x = input.nextInt();
            mode.add(x);
            i++;
        }

        int change=0;
        int j=0;
        while (j < n - 1) {
            if (mode.get(j) != mode.get(j + 1)) {
                change += 1;
            }
            j++;
        }

        System.out.println(change);

        input.close();
    }
}