import java.util.Scanner;

public class sorakh_mosh {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int x = input.nextInt();
        int y = input.nextInt();

        if (x==y) {
            System.out.println("Saal Noo Mobarak!");
        }

        if (x>y) {
            int z1 = x-y;
            for (int i=0; i<z1; i++) {
                System.out.print("L");
            }
        }

        if (x<y) {
            int z2 = y-x;
            for (int j=0; j<z2; j++) {
                System.out.print("R");
            }
        }

        input.close();
    }
}