import java.util.Scanner;
	public class temp{
		public static void main (String[] args){
			final double C_TO_F = (9.0/5) + 32;
			double f;
			Scanner as = new Scanner(System.in);
			System.out.print("Enter a temperature in Celsius: ");
			f = as.nextDouble();
			double a = f * C_TO_F;
			System.out.printf(f + " in Fahrenheit is %.1f F", f);
	}
}
