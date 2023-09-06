import java.util.Scanner;

public class dorbin_madar_baste {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int x1 = input.nextInt();
        int y1 = input.nextInt();

        int x2 = input.nextInt();
        int y2 = input.nextInt();

        int x3 = input.nextInt();
        int y3 = input.nextInt();

        if(x1 == x2) {
            if(y3 == y1) {
                System.out.print(x3 + " " + y2);
            }
            if(y3 == y2) {
                System.out.print(x3 + " " + y1);
            }
        }

        if(x2 == x3) {
            if(y1 == y2) {
                System.out.print(x1 + " " + y3);
            }
            if(y1 == y3) {
                System.out.print(x1 + " " + y2);
            }
        }

        if(x3 == x1) {
            if(y2 == y1) {
                System.out.print(x2 + " " + y3);
            }
            if(y2 == y3) {
                System.out.print(x2 + " " + y1);
            }
        }
        
        input.close();
    }
}