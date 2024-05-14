import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class cake_dar_quera {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        Deque<Integer> adad = new ArrayDeque<>();
        int n = input.nextInt();

        adad.add(1);
        adad.add(2);
        adad.add(3);
        adad.add(4);
        adad.add(6);
        adad.add(12);

        boolean x = adad.contains(n);
        if(x==true){
            System.out.println("YES");
        }  
        else{
            System.out.println("NO");  
        }   

        input.close();
    }
}