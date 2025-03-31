import java.util.ArrayList;
import java.util.Scanner;

public class ersal_sangin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList <Integer> bazeh_kari_n = new ArrayList<Integer>(); // ساعت کاری های پیک اول
        ArrayList <Integer> bazeh_kari_m = new ArrayList<Integer>(); // ساعت کاری های پیک دوم

        int n = input.nextInt();
        int m = input.nextInt();

        for(int i=0; i<n; i++){
            int ln = input.nextInt();
            int rn = input.nextInt();
            while (ln <= rn) {
                bazeh_kari_n.add(ln);
                ln++;
            }
        }

        for(int j=0; j<m; j++){
            int lm = input.nextInt();
            int rm = input.nextInt();
            while (lm <= rm) {
                bazeh_kari_m.add(lm);
                lm++;
            }
        }

        int count = 0; // شمارش ساعت های مشترک
        for (int num : bazeh_kari_m) {
            if (bazeh_kari_n.contains(num)) {
                count++;
            }
        }

        System.out.println(count);

        input.close();
    }
}