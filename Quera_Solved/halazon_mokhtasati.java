import java.util.Scanner;

public class halazon_mokhtasati {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int x=0, y=0;

        for(int i=2; i<=n; i++) {
            int b = i % 4;
            switch(b) {
                case 2:
                    x = -x + 1;
                    break;
                case 3:
                    y = -y + 1;
                    break;
                case 0:
                    x = -x;
                    break;
                case 1:
                    y = -y;
                    break;
            }
        }

        System.out.println(x + " " + y);
        input.close();
    }
}