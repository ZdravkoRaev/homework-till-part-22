package razdel14;
import java.lang.Math;
public class Sistema {
	double x;
	double y;
Sistema(){
	x=0;
	y=0;
}
Sistema(int a, int b){
	x=a;
	y=b;
}
double distance(Sistema a,Sistema b) {
	double dis;
	double x1=a.x-b.x;
	double y1=a.y-b.y;
	if (x1<0) x1=-x1;
	if (y1<0) y1=-y1;
	dis=x1*x1+y1*y1;
	return Math.sqrt(dis);
}
}
