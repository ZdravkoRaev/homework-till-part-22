package razdel13;
import java.util.Scanner;
public class Zad3 {

	public static void main(String[] args) {
		int bad=0;
		Scanner input = new Scanner(System.in);
		String password;
		password=input.next();
		int numbers=0;
		if (password.length()<8) bad++;
		
		for(int i=0;i!=password.length();i++) {
			if (Character.isLetter(password.charAt(i))!=true && Character.isDigit(password.charAt(i))!=true) bad++;
			if(Character.isDigit(password.charAt(i))) numbers++;
		}
		if (numbers<2) bad++;
		if(bad>0) System.out.print("ne e validno");
		else System.out.print("validno e");
	}
	
}
