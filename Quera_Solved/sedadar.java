import java.util.Scanner;

public class sedadar {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        String x = input.nextLine();
        char[] ch = x.toCharArray ();

        int count =0;

        for (int i=0 ; i<x.length(); i++) {
            if('a' == ch[i]) {
                count++ ;
            }
            if('e' == ch[i]) {
                count++ ;
            }
            if('i' == ch[i]) {
                count++ ;
            }
            if('o' == ch[i]) {
                count++ ;
            }
            if('u' == ch[i]) {
                count++ ;
            }
        }

        System.out.println(count);

        input.close();
    }
}