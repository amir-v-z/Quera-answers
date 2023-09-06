import java.util.Scanner;

public class adad_fisaghoresi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 

        int x = input.nextInt();
        int y = input.nextInt();
        int z = input.nextInt();

        if (x*x + y*y == z*z || x*x + z*z == y*y || y*y + z*z == x*x) {
            System.out.println("YES");
        }

        else {
            System.out.println("NO");
        }

        input.close();
    }
}