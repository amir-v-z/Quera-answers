import java.util.Scanner;

public class daroy_corona {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        int n = input.nextInt();
        int k = input.nextInt();

        int p = input.nextInt();
        int q = input.nextInt();

        int behbodShekarestan = n-k;
        int behbodNamakestan = p-q;

        if (behbodShekarestan > behbodNamakestan) {
            System.out.println("Shekarestan");
        }
        else if (behbodNamakestan > behbodShekarestan) {
            System.out.println("Namakestan");
        }
        else {
            System.out.println("Equal");
        }

        input.close();
    }
}