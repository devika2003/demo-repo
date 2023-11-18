import java.util.*;
class Reverse{

public static void main(String args[])
{	
	int n,r=0;
	Scanner scan=new Scanner(System.in);
	System.out.println("enter a number"); 
	int m=scan.nextInt();
	
	while(m!=0){
	n=m%10;
	r=r*10+n; 
	m=m/10;
}
System.out.println(r); 
}}
