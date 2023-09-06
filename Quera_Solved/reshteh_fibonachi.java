import java.util.ArrayList;
import java.util.Scanner;

public class reshteh_fibonachi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        ArrayList<Long> num = new ArrayList<Long>();
        
        for(int a=0 ; a<12 ; a++){
            num.add(fibo(a));   
        }

        for(long b=1 ; b<=n ; b++){
            if(num.contains(b)){
                System.out.print("+");
            }
            else{
                System.out.print("-");
            }
        }
    }
  
    public static long fibo (int n){
        if(n<=2)
            return 1;
        else{
            long c = fibo(n-1) + fibo(n-2);
            return c;
        }
    }         
}