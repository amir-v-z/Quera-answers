import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class hendoneh_khory {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> waterMellons = new ArrayList<>();

        int n = input.nextInt();

        int i=0;
        while (i < n) {
            int x = input.nextInt();
            waterMellons.add(x);
            i++;
        }

        int max = Collections.max(waterMellons);

        int index = waterMellons.indexOf(max);

        System.out.println(index + 1);

        input.close();
    }
}