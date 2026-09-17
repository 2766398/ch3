import java.util.Scanner;
import java.util.Random;

public class guess{
		public static void main (String[] args){
			Scanner in = new Scanner(System.in);
			Random random = new Random();
			int a = random.nextInt(101);
			int b;
			System.out.print("I'm thinking of a number between 1 and 100 \n(including both). Can you guess what it is? \nType a number: ");
			b = in.nextInt();
			int c = a - b;
			if (c < 0){
				c = -c;
			}
			System.out.print("Your guess is: " + b + " \nThI was thinking of is: " + a + " \nYou were off by: " + c);
	}
}
