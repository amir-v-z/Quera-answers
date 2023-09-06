import java.util.Scanner;

public class rezhim_sakht {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        String x = input.next();
        String t1 = x.substring(0,1);
        String t2 = x.substring(1,2);
        String t3 = x.substring(2,3);
        String t4 = x.substring(3,4);
        String t5 = x.substring(4,5);

        int red=0;

        if (t1.equals("R")) {
            red++;
        }
        if (t2.equals("R")) {
            red++;
        }
        if (t3.equals("R")) {
            red++;
        }
        if (t4.equals("R")) {
            red++;
        }
        if (t5.equals("R")) {
            red++;
        }

        int yellow=0;

        if(t1.equals("Y")) {
            yellow++;
        }
        if(t2.equals("Y")) {
            yellow++;
        }
        if(t3.equals("Y")) {
            yellow++;
        }
        if(t4.equals("Y")) {
            yellow++;
        }
        if(t5.equals("Y")) {
            yellow++;
        }

        if (red>=3 || red==5 || yellow==5 || (red>=2 && yellow>=2) || (yellow==4 && red==1)) {
            System.out.println("nakhor lite");
        }

        else {
            System.out.println("rahat baash");
        }

        input.close();
    }
}