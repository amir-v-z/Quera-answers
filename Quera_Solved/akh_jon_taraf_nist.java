import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class akh_jon_taraf_nist {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        ArrayList<String> days = new ArrayList<String>(Arrays.asList("shanbe","1shanbe","2shanbe","3shanbe","4shanbe","5shanbe","jome"));

        int x1 = input.nextInt();
        for (int i = 0; i<x1; i++) {
            String y1 = input.next();
            days.remove(y1);
        }

        int x2 = input.nextInt();
        for (int i = 0; i<x2; i++) {
            String y2 = input.next();
            days.remove(y2);
        }

        int x3 = input.nextInt();
        for (int i = 0; i<x3; i++) {
            String y3 = input.next();
            days.remove(y3);
        }

        System.out.println(days.size());

        input.close();
    }
}