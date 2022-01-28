package razdel13;
import java.util.Scanner;
public class Anagram {
Scanner input = new Scanner(System.in);
String a;
String b;
int OK=0;
void proveri() {
	
if (a.length()!=b.length())System.out.print("ne sa");

else if (a.length()<2);

else {
	
	for (int i=0;i<a.length();i++) {
		
		for (int n=0;n<a.length();n++) {
			
			if (Character.compare(a.charAt(i), b.charAt(n))==0) {
				if (i==0){
					a="0"+a.substring(1,a.length()-1);
				}
				else if(i==a.length()-1) {
					a=a.substring(0,i)+"0";	
				}
				else {
				a=a.substring(0,i-1)+"0"+a.substring(i+1,a.length()-1);
				}
				if (n==0){
					b="0"+b.substring(1,b.length()-1);
				}
				else if(n==b.length()-1) {
					b=b.substring(0,n)+"0";	
				}
				else {
				b=b.substring(0,n-1)+"0"+b.substring(n+1,b.length()-1);
				}
			}
		
		}
	}
	for (int n=0;n<a.length();n++) {
		if (Character.compare(a.charAt(n),'0')==0) OK++;
	}
	if(OK==a.length())System.out.print("te sa");
	else System.out.print("ne sa");
}
}
Anagram(String c, String d){
	a=c;
	b=d;
}
}
//Character.compare(a.charAt(i),b.charAt(n)