import java.util.*;
class rep
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
	System.out.println();
 	System.out.println("enter the number to be replaced");
	int a=scan.nextInt();
	System.out.println("enter the number to be added");
	int b=scan.nextInt();
	for(i=0;i<n;i++){
		if(num[i]==a){
		num[i]=b;
	}}
	for(i=0;i<n;i++){
		System.out.print(" "+num[i]);
	}
}}

	
	
