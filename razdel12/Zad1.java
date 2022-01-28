package razdel12;
import java.util.Random;

public class Zad1 {
	
	public static void main(String[] args) {
		Timer time = new Timer();
		time.startTimer();
		SelectionSortExample az = new SelectionSortExample();
		Random rd = new Random();
		
		int[] numbers;
		numbers = new int[100000];
		for (int i=0;i!=100000;i++)
		{
			numbers[i]=rd.nextInt(100000);
		}
		az.selectionSort(numbers);
		System.out.println(time.getElapsedSeconds());
	}
}