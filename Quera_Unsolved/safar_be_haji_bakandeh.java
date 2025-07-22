import java.util.Scanner;

public class safar_be_haji_bakandeh {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt(); // تعداد ویلا
        int k = input.nextInt(); // تعداد دوستان

        int minCost = Integer.MAX_VALUE;
        int chosenIndex = -1; // متغیر برای ذخیره شماره‌ی ویلا با کمترین هزینه

        for (int i = 0; i < n; i++) {
            int a = input.nextInt(); // هزینه پایه ویلا
            int b = input.nextInt(); // هزینه هر نفر اضافی
            int x = input.nextInt(); // تعداد نفرات پایه ویلا

            int extraCost;
            
            if (k > x) {
                int extraPeople = k - x;       // تعداد نفرات اضافی
                extraCost = extraPeople * b;   // ضرب در هزینه‌ی هر نفر اضافی
            } else {
                extraCost = 0;                 // اگه تعداد دوستان کمتر یا برابر با ظرفیت پایه باشه، هزینه‌ی اضافی نداریم
            }

            int totalCost = a + extraCost;

            if (totalCost < minCost) {
                minCost = totalCost;
                chosenIndex = i;
            }
        }

        System.out.println(chosenIndex + 1); // شماره ویلا با کمترین هزینه
        input.close();
    }
}