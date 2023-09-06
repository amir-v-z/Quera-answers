import java.util.Scanner;

public class nardeboni {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        int a = input.nextInt();
        int b = input.nextInt();

        a = Math.abs(a);
        b = Math.abs(b);

        int c = 0;
        if(b !=0) {
            c = bmm(a,b);
        }
        else {
            c = a;
        }
        System.out.println(c);

        input.close();
    }

    public static int bmm(int a, int b) {
        int r = a % b;
        if(r==0) {
            return b;
        }
        else {
            return bmm(b,r);
        }
    }
}