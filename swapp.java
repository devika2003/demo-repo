import java.util.*;
class swapp{

public static void main(String args[])
{
	Scanner scan=new Scanner(System.in);
	System.out.println("enter a and b"); 
	int a=scan.nextInt();
	int b=scan.nextInt();
	
	int t;
	t=a;
	a=b;
	b=t;
	System.out.println("a=" +a+" b=" +b);
}}
