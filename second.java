import java.util.*;
class second
{
public static void main(String args[]){
	int i,j;
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
	for(i=0;i<n-1;i++){
		for(j=0;j<n-1-i;j++){
		if(num[j]<num[j+1]){
			int temp=num[j];
			num[j]=num[j+1];
			num[j+1]=temp;
}}}

System.out.println("the second largest element is "+num[1]);
}}	
