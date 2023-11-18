import java.util.*;
class shape
{
public static void main(String args[]){
	shap s=new shap();
	Scanner sc=new Scanner(System.in);
	System.out.println("enter radius");
	int r=sc.nextInt();
	s.area(r);
	System.out.println("enter l and b of rectangle");
	int len=sc.nextInt();
	int br=sc.nextInt();
	s.area(len,br);
	System.out.println("enter b and h of triangle");
	int wd=sc.nextInt();
	int hht=sc.nextInt();
	s.area(wd,hht,0);
	
}
}
class shap{

	void area(int l,int b){
		System.out.println("area="+(l*b));
	}
	void area(int rad){
		System.out.println("area="+(3.14*rad*rad));
	}
	void area(int w,int h,int k){
		System.out.println("area="+(w*h)/2);
	}
}
