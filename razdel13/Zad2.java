package razdel13;
import java.util.Scanner;
public class Zad2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		char tire = '-';
		String number;
		String a="lol";
		number=input.next();
		if(number.length()!=11) {
			System.out.print("ne e validno");		
		}
		else {
		if(Character.compare(number.charAt(3),tire)!=0 || Character.compare(number.charAt(6),tire)!=0) {
			System.out.print("ne e validno");
			
		}
		else {
			for (int i=0;i<number.length();i++) {
			Boolean digit = Character.isDigit(number.charAt(i));
			if(i==3 || i==6) i++;
			if(digit==false && i!=4 && i!=7) {
			System.out.print("ne e validno");
			i=number.length();
			}
			if(i==number.length()-1) System.out.print("validno");
			}
		}
		}
		

	}

}
//123-12-1234