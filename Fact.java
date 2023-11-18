import java.util.*;
class Fact{

public static void main(String args[])
{
	Scanner scan=new Scanner(System.in);
	int m;
	int a=scan.nextInt();
	for(int i=1;i<=a/2;i++){
		m=a%i;
		if(m==0)
	System.out.println(i+" is a factor of"+a);
}}}
