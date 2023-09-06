import java.util.Scanner;

public class adad_chap_kon {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        String number = input.next(); //! دریافت ورودی به صورت رشته

        int x=0, y=1;

        for (int i=0; i<number.length();i++) {

            String argham = number.substring(x,y); //! شکستن ارقام

            System.out.print(argham + ": "); //! طریقه چاپ رقم شکسته شده در ابتدای خط

            int arghaam = Integer.parseInt(argham); //! تبدیل رشته به عدد

            //! تعداد چاپ عدد
            for (int j=0; j<arghaam; j++) {
                System.out.print(arghaam);
            }

            System.out.println();

            x++;
            y++;
        }

        input.close();
    }
}