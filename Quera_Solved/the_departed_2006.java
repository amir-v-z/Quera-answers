import java.util.ArrayList;
import java.util.Scanner;

public class the_departed_2006 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        ArrayList<Integer> jets = new ArrayList<>();

        int count = 0;

        for(int i=1; i<=5; i++) {
            String x = input.next();
            if(x.contains("FBI")) {
                jets.add(i);
                count++;
            }
        }

        if(count == 0) {
            System.out.println("HE GOT AWAY!");
        }
        else {
            for(int sia:jets) {
                System.out.print(sia + " ");
            }
        }

        input.close();
    }
}