import java.util.ArrayList;
import java.util.Scanner;

public class bab_va_kelid_TV {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        int n = input.nextInt(); // تعداد شبکه های تلویزیون
        int x = input.nextInt(); // شماره شبکه اولیه تلویزیون
        int k = input.nextInt(); // تعداد دفعاتی که کلید را میفشارد

        ArrayList <String> channels = new ArrayList<String>();

        int i = 0;
        while (i < n) {
            String channelName = input.next();
            channels.add(channelName);
            i++;
        }

        if (n==k || k==0){
            System.out.println(channels.get(x-1));
        }
        else {
            int desiredChannel = (x + k - 1) % n;
            System.out.println(channels.get(desiredChannel));
        }

        input.close();
    }
}