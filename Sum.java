import java.util.*;
class Sum
{
public static void main(String args[]){
	int i,sum=0;
	Scanner scan=new Scanner(System.in);
	System.out.println("enter no of elements");
	int n=scan.nextInt();
	int num[]=new int[n];
	
	for(i=0;i<n;i++){
		num[i]=scan.nextInt();
	}
	for(i=0;i<n;i++){
		System.out.print(" "+num[i]);
	}
	for(i=0;i<n;i++){
		sum=sum+num[i];
	}
	
	System.out.println("	sum= "+sum);
	}
}
