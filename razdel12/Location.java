package razdel12;
import java.util.Scanner;

public class Location {
	Scanner input = new Scanner(System.in);
	 private int tablica[][];
	 int m;
	 int n;
	public void create(){
		System.out.print("enter size");
		m= input.nextInt();
		n= input.nextInt();
		tablica = new int[m][n];
		for (int i=0; i!=m;i++){
			System.out.print("row" + i);
			for (int o=0; o!=m;o++){
				System.out.print("column " + o);
				tablica[i][o]= input.nextInt();
		}
	}
}
	public void retunrTablicaMax() {
		int max=tablica[0][0];
		int x=0;
		int y=0;
		for (int i=0; i!=m;i++){
			for (int o=0; o!=m;o++){
				if(max<tablica[i][o]) {
					max=tablica[i][o];
					x=i;
					y=o;
				}
			}
		}
		System.out.println("cordinati: " + x + ":" + y);
		System.out.print("chislo:" + max);
	}
	Location() {
		
	}
}
