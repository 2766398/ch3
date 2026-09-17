import java.util.Scanner;
	public class temp{
		public static void main (String[] args){
			final double C_TO_F = (9.0/5);
			double f;
			Scanner as = new Scanner(System.in);
			System.out.print("Enter a temperature in Celsius: ");
			f = as.nextDouble();
			double a = f * C_TO_F +32;
			System.out.printf(f + " C = %.1f F", a);
	}
}
