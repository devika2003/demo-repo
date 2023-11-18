import java.util.*;
class perimeter
{
public static void main(String args[]){
	
	Scanner sc=new Scanner(System.in);
	
	System.out.println("enter radius");
	int r=sc.nextInt();
	Perimeter s1=new Perimeter(r);
	//System.out.println(s1.Perimeter(r));
	//s1.p1(r)
	System.out.println("enter l and b of rectangle");
	int x=sc.nextInt();
	int y=sc.nextInt();
	
	Perimeter s2=new Perimeter(x,y);
	//System.out.println(s2.Perimeter(r));
	System.out.println(s1.peri());
	System.out.println(s2.peri());
}
}
class Perimeter {
	int l,b,rad,x,y,r;
	int a;
	
	Perimeter(int l,int b){
		//l=x;
		//b=y;
		a=2*(l+b);
	}
	Perimeter(int rad){
		//rad=r;
		a=(3*2*rad);
		
	}
	int peri(){
		return a;
}
	//void area(int w,int h,int k){
		//System.out.println("area="+(w*h)/2);
	//}
}


