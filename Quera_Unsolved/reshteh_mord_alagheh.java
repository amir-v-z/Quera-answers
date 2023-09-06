import java.util.Scanner;

public class reshteh_mord_alagheh {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        String x = input.nextLine();

        int n = input.nextInt();

        int count = 0;

        for (int i=-1; i<n; i++) {
            String y = input.nextLine();
            if (y.contains(x)) {
                count++;
            }
        }

        System.out.println(count);

        input.close();
    }
}