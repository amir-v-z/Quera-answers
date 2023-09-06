import java.util.HashSet;
import java.util.Scanner;

public class navahi_service_dehi {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        HashSet<Integer> poshesh = new HashSet<>();

        int n = input.nextInt();
        int count = 0;

        while(count<n) {
            int x = input.nextInt();
            int y = input.nextInt();

            for (int i=x; i<=y; i++) {
                poshesh.add(i);
            }
            count++;
        }

        int start = input.nextInt();
        int end = input.nextInt();
        int location[] = new int[end-start+1];
        int index =0;

        for(int j=start; j<=end; j++) {
            location[index] = j;
            index ++;
        }

        int sum =0;
        for(int _location : location) {
            for(int _poshesh : poshesh) {
                if(_location == _poshesh) {
                    sum++;
                    break;
                }
            }
        }
        if(sum == end-start+1) {
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }
        input.close();
    }
}