import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ramz_hay_jan_sakht {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        Integer[] x = {1,3,7,9};

        List<Integer> list = new ArrayList<>(Arrays.asList(23, 29, 31, 37, 59, 71, 73, 79));

        String check = String.valueOf(list.get(0));

        while(check.length() < n) {

            int size = list.size();

            for(int i=0;i<size;i++) {

                StringBuilder number = new StringBuilder(String.valueOf(list.get(i)));

                for(Integer prime : x) {

                    number.append(prime);

                    if(isPrime(Integer.parseInt(String.valueOf(number))))

                    list.add(Integer.parseInt(String.valueOf(number)));

                    number.deleteCharAt(number.length()- 1);

                }

            }

            list.subList(0, size).clear();
            check = String.valueOf(list.get(0));

        }

        for(Integer integer : list) {
            System.out.println(integer);
        }

        input.close();
        }

        public static boolean isPrime(int n){

        int sum=0;

        for(int i=3; i<=Math.sqrt(n); i++) {
            if (n%i==0) {
                sum++;
            }

            if(sum==1) {
                return false;
            }
        }
        return true;
        }
}