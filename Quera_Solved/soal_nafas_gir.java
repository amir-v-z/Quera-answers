import java.util.ArrayList;
import java.util.Scanner;

public class soal_nafas_gir {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ArrayList<Integer> AI = new ArrayList<>(); // آرایه میزان نفس گیری
        ArrayList<Integer> BI = new ArrayList<>(); // آرایه افراد
        ArrayList<Integer> Multiplication = new ArrayList<>(); // آرایه برای ضرب دو آرایه بالا در هم

        int n = input.nextInt();

        int i = 0;
        while (i<n) {
            int ai = input.nextInt();
            AI.add(ai);
            i++;
        }

        int j = 0;
        while (j<n) {
            int bi = input.nextInt();
            BI.add(bi);
            j++;
        }

        int k = 0;
        while (k<n) {
            int multiplication = AI.get(k) * BI.get(k);
            Multiplication.add(multiplication);
            k++;
        }

        // چاپ مجموع اعداد آرایه ضرب
        int sum = 0;
        for (int numbers : Multiplication) {
            sum += numbers;
        }

        System.out.println(sum);

        input.close();
    }
}