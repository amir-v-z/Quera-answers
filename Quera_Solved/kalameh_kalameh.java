import java.util.Scanner;

public class kalameh_kalameh {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        int count = 0;

        String s = input.next();

        char s1 = s.charAt(0);
        char s2 = s.charAt(1);
        char s3 = s.charAt(2);
        char s4 = s.charAt(3);
        char s5 = s.charAt(4);
        char s6 = s.charAt(5);

        if (s1=='a' || s1=='e' || s1=='i' || s1=='o' || s1=='u') {
            count++;
        }

        if (s2=='a' || s2=='e' || s2=='i' || s2=='o' || s2=='u') {
            count++;
        }

        if (s3=='a' || s3=='e' || s3=='i' || s3=='o' || s3=='u') {
            count++;
        }

        if (s4=='a' || s4=='e' || s4=='i' || s4=='o' || s4=='u') {
            count++;
        }

        if (s5=='a' || s5=='e' || s5=='i' || s5=='o' || s5=='u') {
            count++;
        }

        if (s6=='a' || s6=='e' || s6=='i' || s6=='o' || s6=='u') {
            count++;
        }
        
        if (count > 0) {
            System.out.printf("%.0f",Math.pow(2,count));
        }

        else {
            System.out.println("1");
        }

        input.close();
    }
}