import java.util.Scanner;

public class ramin_va_masaleh_riyazi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int q = input.nextInt();
        int count = 0;

        while(count < q) {
            Long l = input.nextLong();
            Long r = input.nextLong();
            int x = (int)Math.floor(Math.sqrt(l));
            int y = (int)Math.ceil(Math.sqrt(r));
    
            if(x != Math.sqrt(l) && y != Math.sqrt(r)) {
                System.out.println(y - x - 1);
            }
    
            if(((x != Math.sqrt(l)) && y == Math.sqrt(r))|
            ((y != Math.sqrt(r)) && x == Math.sqrt(l))) {
                System.out.println(y - x);
            }
    
            if((x == Math.sqrt(l)) && y == Math.sqrt(r)) {
                System.out.println(y - x + 1);
            }
    
            count++;
        }
        input.close();
    
    }
}