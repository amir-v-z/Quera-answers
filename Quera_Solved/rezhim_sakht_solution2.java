import java.util.Scanner;

public class rezhim_sakht_solution2 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        String x = input.nextLine();

        int red = 0;
        int yellow = 0;

        for (char ch : x.toCharArray()) {
            if (String.valueOf(ch).equals("R"))
                red++;
            else if (String.valueOf(ch).equals("Y"))
                yellow++;
        }

        if( (yellow == x.length() || red == x.length()) || (red >= 3) || (red >= 2 && yellow >= 2) || (yellow==4 && red==1) ) {
            System.out.println("nakhor lite");
        } else {
            System.out.println("rahat baash");
        }

        input.close();
    }
}