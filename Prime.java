import java.util.*;
class Prime{

public static void main(String args[])
{
	Scanner scan=new Scanner(System.in);
	int a=scan.nextInt();
	int flag=1;
	for(int i=2;i<=a/2;i++){
		if(a%i==0){
			flag=0;
			break;
	}
	}
	if(flag==1)
		System.out.println("prime");
	else
		System.out.println("not prime");
}}
