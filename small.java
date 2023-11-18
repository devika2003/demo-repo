import java.util.*;
class small
{
public static void main(String args[]){
	int i;
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
	int small=num[0];
	for(i=0;i<n;i++){
		if(num[i]<small){
			small=num[i];
	}}
	System.out.println("the smallest element is "+small);

}}
