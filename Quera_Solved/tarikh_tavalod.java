import java.util.Scanner;

public class tarikh_tavalod {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        String n = input.next();
        System.out.print("saal:");
        System.out.print(n.substring(0,2));
        System.out.println();
        System.out.print("maah:");
        System.out.print(n.substring(2,4));
        
        input.close();
    }
}