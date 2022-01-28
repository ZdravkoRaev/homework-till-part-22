package razdel11;
import java.util.Random;
public class zad3 {

	public static void main(String[] args) {
		Random rd = new Random();
		int[][] uchenik;
		int[] key;
		key=new int[10];
		for (int i=0;i!=8;i++) {
			
			key[i]=rd.nextInt(0+4);
		}
		uchenik= new int[8][10];
		for (int i=0;i!=8;i++) {
			for (int n=0;n!=10;n++) {
				uchenik[i][n]=rd.nextInt(0+4);
			}
		}
		for (int i=0;i!=8;i++) {
			int tochki=0;
			for (int n=0;n!=10;n++) {
				if (uchenik[i][n]==key[n]) tochki++;
			}
			System.out.println("uchenik " + i  +" ima " + tochki++);
		}
		
		
	}

}
