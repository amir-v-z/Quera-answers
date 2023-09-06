import java.util.Scanner;

public class soal_barname_nevisi_barname_nevisi_soal {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        int x = input.nextInt();
        input.nextLine();

        String text = input.nextLine();

        String array[] = text.split(" ");

        for (int j=array.length-1; j>=0; j--) {
            System.out.print(array[j] + " ");
        }

        input.close();
    }
}