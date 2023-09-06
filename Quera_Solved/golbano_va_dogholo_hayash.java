import java.util.Scanner;

public class golbano_va_dogholo_hayash {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        String x = input.next();

        StringBuilder y = new StringBuilder(x);
        y.reverse();

        String z = y.toString();
        System.out.println(z);

        input.close();
    }
}