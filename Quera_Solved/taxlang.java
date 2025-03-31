import java.util.Scanner;

public class taxlang {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        String str1 = input.next();
        String str2 = input.next(); // ورودی خط دوم رو فقط برای تشخیص (ایکس) استفاده کردم
        String str3 = input.next(); // با ورودی خط سوم کاری ندارم

        int count = str1.length() / 5; // برای تشخیص طول رشته خط اول

        int i = 0;
        int j = 0; // این متغییر 5 تا 5 تا روی (طول رشته خط اول) جلو میره
        while (i < count) {
            if(str1.substring(j,j+5).equals("*****")){
                System.out.print("T");
            } else if(str1.substring(j, j+5).equals("oo*oo")){
                System.out.print("A");
            } else if(str1.substring(j, j+5).equals("*ooo*") && str2.substring(j, j+5).equals("oo*oo")){
                System.out.print("X");
            } else if(str1.substring(j, j+5).equals("**o**")){
                System.out.print("M");
            } else if(str1.substring(j, j+5).equals("*ooo*")){
                System.out.print("N");
            }
            i++;
            j+=5;
        }

        input.close();
    }
}