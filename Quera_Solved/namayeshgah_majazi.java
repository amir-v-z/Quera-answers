import java.util.Scanner;

public class namayeshgah_majazi {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        int n = input.nextInt();
        int c=0;
        
        System.out.println("########.......########");

        if (n==0) {
            System.out.println("#.....................#");
            while(c<3) {
                System.out.println("########.......########");
                System.out.println("#.....................#");
                c++;
            }
        }

        if (n==1) {
            System.out.println("#ghorfe1..............#");
            while(c<3) {
                System.out.println("########.......########");
                System.out.println("#.....................#");
                c++;
            }
        }

        if (n==2) {
            System.out.println("#ghorfe1.......ghorfe2#");
            while(c<3) {
                System.out.println("########.......########");
                System.out.println("#.....................#");
                c++;
            }
        }

        if (n==3) {
            System.out.println("#ghorfe1.......ghorfe2#");
            System.out.println("########.......########");
            System.out.println("#ghorfe3..............#");
            while(c<2) {
                System.out.println("########.......########");
                System.out.println("#.....................#");
                c++;
            }
        }

        if (n==4) {
            System.out.println("#ghorfe1.......ghorfe2#");
            System.out.println("########.......########");
            System.out.println("#ghorfe3.......ghorfe4#");
            while(c<2) {
                System.out.println("########.......########");
                System.out.println("#.....................#");
                c++;
            }
        }

        if (n==5) {
            System.out.println("#ghorfe1.......ghorfe2#");
            System.out.println("########.......########");
            System.out.println("#ghorfe3.......ghorfe4#");
            System.out.println("########.......########");
            System.out.println("#ghorfe5..............#");
            while(c<1) {
                System.out.println("########.......########");
                System.out.println("#.....................#");
                c++;
            }
        }

        if (n==6) {
            System.out.println("#ghorfe1.......ghorfe2#");
            System.out.println("########.......########");
            System.out.println("#ghorfe3.......ghorfe4#");
            System.out.println("########.......########");
            System.out.println("#ghorfe5.......ghorfe6#");
            while(c<1) {
                System.out.println("########.......########");
                System.out.println("#.....................#");
                c++;
            }
        }

        if (n==7) {
            System.out.println("#ghorfe1.......ghorfe2#");
            System.out.println("########.......########");
            System.out.println("#ghorfe3.......ghorfe4#");
            System.out.println("########.......########");
            System.out.println("#ghorfe5.......ghorfe6#");
            System.out.println("########.......########");
            System.out.println("#ghorfe7..............#");
        }

        if (n==8) {
            System.out.println("#ghorfe1.......ghorfe2#");
            System.out.println("########.......########");
            System.out.println("#ghorfe3.......ghorfe4#");
            System.out.println("########.......########");
            System.out.println("#ghorfe5.......ghorfe6#");
            System.out.println("########.......########");
            System.out.println("#ghorfe7.......ghorfe8#");
        }
        
        System.out.println("#######################");

        input.close();
    }
}