import java.util.Scanner;
public class TempConvert {
	public static void main(String[] args){
		Scanner keyboard = new Scanner(System.in);
		double temp1, temp2;
		String isF;
		System.out.print("Enter temperature: ");
		temp1 = keyboard.nextDouble();
		System.out.println("Is this temperature in Fahrenheit (y/n): ");
		isF = keyboard.next();
		temp2 = convertTemp(temp1, isF);
		System.out.print("The coverted temperature is : " + temp2);
	}
	private static double convertTemp(double t1, String f){
		double t2;
		if (f.equals("y")){
			t2=(t1-32)*5/9;
		} else {	
			t2=t1*1.8+32;
		}
		return t2;
	}
}
