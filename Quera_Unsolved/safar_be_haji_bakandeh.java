import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class safar_be_haji_bakandeh {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        ArrayList<Integer> num_villa = new ArrayList<>();

        int n = input.nextInt(); // تعداد ویلا
        int k = input.nextInt(); // تعداد دوستان

        for(int i=0; i<n; i++){
            int a = input.nextInt(); // هزینه پایه ی ویلا
            int b = input.nextInt(); // هزینه هر نفر اضافی
            int x = input.nextInt(); // تعداد نفرات پایه ی هر ویلا
    
            int hazineh_ezafeh = 0;

            if(k > x){
                hazineh_ezafeh = (k - x) * b; // محاسبه هزینه اضافی هر نفر
            }

            int sum = a + hazineh_ezafeh; // محاسبه هزینه کل

            num_villa.add(sum);
        }

        int min = Collections.min(num_villa); // بدست آوردن کمترین هزینه ویلا

        int index = num_villa.indexOf(min); // بدست آوردن شماره کمترین هزینه ویلا

        System.out.println(index + 1);

        input.close();
    }
}