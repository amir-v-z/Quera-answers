import java.util.Scanner;

public class khob_bagher_sarma_khordeh {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        int z = 0;

        String x1 = input.next();
        String x2 = input.next();
        String x3 = input.next();
        String x4 = input.next();
        String x5 = input.next();

        if (x1.contains("MOLANA") || x1.contains("HAFEZ")) {
            System.out.print("1 ");
            z++;
        }
        if (x2.contains("MOLANA") || x2.contains("HAFEZ")) {
            System.out.print("2 ");
            z++;
        }
        if (x3.contains("MOLANA") || x3.contains("HAFEZ")) {
            System.out.print("3 ");
            z++;
        }
        if (x4.contains("MOLANA") || x4.contains("HAFEZ")) {
            System.out.print("4 ");
            z++;
        }
        if (x5.contains("MOLANA") || x5.contains("HAFEZ")) {
            System.out.print("5 ");
            z++;
        }
        if (z==0) {
            System.out.print("NOT FOUND!");
        }

        input.close();
    }
}