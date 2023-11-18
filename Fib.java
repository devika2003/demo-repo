import java.util.*;
class Fib
{
public static void main(String args[]){
	Scanner scan=new Scanner(System.in);
	System.out.println("enter a number");
	int t,f=0,s=1,i;
	int a=scan.nextInt();
	System.out.println(f+"\n"+s);
	for(i=2;i<=a;i++){
	t=s+f;
	System.out.println(t);
	f=s;
	s=t;
	
}}}
