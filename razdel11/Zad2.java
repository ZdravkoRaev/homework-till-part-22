package razdel11;

import java.util.Random;
public class Zad2 {

	public static void main(String[] args) {
		
		Random rd = new Random();
		
		int x=rd.nextInt(0+52);
		int y=rd.nextInt(0+51);
		int z=rd.nextInt(0+50);
		if(y>=x) {
			y++;
		}
		if(z>=x) {
			z++;
		}
		if(z>=y) {
			z++;
		}
		ImaNaKarta karta1 = new ImaNaKarta(x);
		System.out.println(x);
		karta1.getCardName();
		ImaNaKarta karta2 = new ImaNaKarta(y);
		System.out.println(y);
		karta2.getCardName();
		ImaNaKarta karta3 = new ImaNaKarta(z);
		System.out.println(z);
		karta3.getCardName();

}
}