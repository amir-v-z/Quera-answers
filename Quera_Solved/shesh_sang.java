import java.util.Scanner;

public class shesh_sang {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        String str = input.next();

        if (str.contains("space")) {
            System.out.println("blue");
        } else if (str.contains("mind")) {
            System.out.println("yellow");
        } else if (str.contains("reality")) {
            System.out.println("red");
        } else if (str.contains("power")) {
            System.out.println("purple");
        } else if (str.contains("time")){
            System.out.println("green");
        } else {
            System.out.println("orange");
        }

        input.close();
    }
}