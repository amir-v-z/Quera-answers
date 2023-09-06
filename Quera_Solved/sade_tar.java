import java.util.Scanner;

public class sade_tar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        float a = input.nextInt();
        float b = input.nextInt();
        float c = input.nextInt();
        float d = input.nextInt();

        float sum = a+b+c+d;
        System.out.printf("Sum : %.6f" , sum);

        System.out.println();

        float average = sum/4;
        System.out.printf("Average : %.6f" , average);

        System.out.println();

        float product = a*b*c*d;
        System.out.printf("Product : %.6f" , product);

        System.out.println();

        float max = 0;
        if (a>=b && a>=c && a>=d) {
        max = a;
        }
        if (b>=a && b>=c && b>=d) {
        max = b;
        }
        if (c>=a && c>=b && c>=d) {
        max = c;
        }
        if (d>=a && d>=b && d>=c) {
        max = d;
        }
        System.out.printf("MAX : %.6f" , max);

        System.out.println();

        float min = 0;
        if (a<=b && a<=c && a<=d) {
        min = a;
        }
        if (b<=a && b<=c && b<=d) {
        min = b;
        }
        if (c<=a && c<=b && c<=d) {
        min = c;
        }
        if (d<=a && d<=b && d<=c) {
        min =d;
        }
        System.out.printf("MIN : %.6f" , min);

        input.close();
    }
}