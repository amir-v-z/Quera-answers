import java.util.Scanner;

public class haj_mashti {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        String str = input.next();
        String s1 = str.substring(0,1);
        String s2 = str.substring(1,2);
        String s3 = str.substring(2,3);

        if (s1.contains("Y")) {
            System.out.println("Haji");
        } else if (s2.contains("Y")) {
            System.out.println("Karbalaee");
        } else if (s3.contains("Y")) {
            System.out.println("Mashti");
        } else if (str.contains("NNN")){
            System.out.println("Agha");
        }

        input.close();
    }
}