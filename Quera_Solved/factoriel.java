import java.util.Scanner;

public class factoriel {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);

		System.out.println(fact(input.nextInt()));
        
		input.close();
	}

	public static int fact(int n) {
		if(n==1) {
			return 1;
		}
		else {
			int f = n*fact(n - 1);
			return f;
		}
	}
}