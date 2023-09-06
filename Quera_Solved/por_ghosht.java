import java.util.Scanner;

public class por_ghosht {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        int n = input.nextInt();
        int m = input.nextInt();
        int zarf1 = 0;
        int zarf2 = 0;

        for (int i=0; i<n; i++) {
            char[] t1 = input.next().substring(0,m).toCharArray();
            for (char tt1 : t1) {
                if(tt1 == '*') {
                    zarf1++;
                }
            }
        }

        for (int i=0; i<n; i++) {
            char[] t2 = input.next().substring(0,m).toCharArray();
            for (char tt2 : t2) {
                if(tt2 == '*') {
                    zarf2++;
                }
            }
        }

        System.out.println(zarf1+" "+zarf2);

        input.close();
    }
}