package razdel11;
import java.util.Scanner;
import java.util.Random;
public class Zad1 {

	public static void main(String[] args) {
		int[] numbers;
		numbers=new int[10];
		Scanner input = new Scanner(System.in);
		Random rd = new Random();
		for(int i=0; i!=10; i++) {
			numbers[i]=input.nextInt();
		}
		
		for(int i=0;i!=100;i++){
		int random1 = rd.nextInt(0+9);
		int random2 = rd.nextInt(0+9);
		int temp1=numbers[random1];
		int temp2=numbers[random2];
		numbers[random1]=temp2;
		numbers[random2]=temp1;
        
		
		}
		
		for(int i=0; i!=10; i++) {
			System.out.print(numbers[i]);
		}
		
	}

}
