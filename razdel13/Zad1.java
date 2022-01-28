package razdel13;
import java.util.Scanner;
public class Zad1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String duma;
		duma=input.next();
		for (int i=0; i<duma.length()/2+1;i++){
			char a=duma.charAt(i);
			char b=duma.charAt(duma.length()-i-1);
			int c=Character.compare(a, b);
			if(c!=0) {
				System.out.println("ne");
				break;
				}
			if(i==duma.length()/2) System.out.println("da");
		}
		

	}

}
