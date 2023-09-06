import java.util.Scanner;

public class moadeleh_khat {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        int a = input.nextInt();
        int b = input.nextInt();

        if ( a==0 && b==0) {
            System.out.println("infinite");
        }
        
        else if ( a==0 ) {
            System.out.println("invalid");
        }

        else {
            System.out.println("unique");
        }

        input.close();
    }
}