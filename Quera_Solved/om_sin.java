import java.util.Scanner;

public class om_sin {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        String[] Haftsin = {"sib","samanoo","sir","senjed","somagh","sekeh","serkeh"};

        int m = input.nextInt();
        
        for(int i=0; i<m; i++) {
            System.out.println(Haftsin[i]);
        }

        input.close();
    }
}