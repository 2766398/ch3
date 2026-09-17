import java.util.Scanner;

public class converter{
		public static void main (String[] args){
			Scanner in = new Scanner(System.in);
			int seconds;
			System.out.print("Input seconds: ");
			seconds = in.nextInt();
			int a = seconds/3600;
			int b = (seconds%3600)/60;
			int c = (seconds%3600)%60;
			System.out.printf(seconds + " seconds = %d hours, %d minutes, and %d seconds.", a, b, c);
	}
}
