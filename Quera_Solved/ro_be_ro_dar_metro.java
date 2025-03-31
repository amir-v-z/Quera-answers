import java.util.Scanner;
import java.util.ArrayList;

public class ro_be_ro_dar_metro {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        ArrayList <Integer> line1 = new ArrayList<Integer>();
        ArrayList <Integer> line2 = new ArrayList<Integer>();

        int i = 0;
        while (i < 8) {
            int chairLine1 = input.nextInt();
            line1.add(chairLine1);
            i++;
        }

        int j = 0;
        while (j < 8) {
            int chairLine2 = input.nextInt();
            line2.add(chairLine2);
            j++;
        }

        int sum = 0;
        int k = 0;
        while (k < 8) {
            if(line1.get(k)==1 && line2.get(k)==1) {
                sum++;
            }
            k++;
        }

        System.out.println(sum);
        input.close();
    }
}
