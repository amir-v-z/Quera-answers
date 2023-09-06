import java.util.Scanner;

public class chap_bar_aks {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        int number;
        String result = "";
        int counter = 0;

        while (true) {
            number = input.nextInt();

            if(number == 0)
                break;

            if(counter==0)
                result = String.valueOf(number);
            else
                result = String.valueOf(number) + '\n' + result;

            counter++;
        }

        System.out.println(result);

        input.close();
    }
}