import java.util.*;
class factorial
{
public static void main(String args[]){
	int fact=1;
	Scanner scan=new Scanner(System.in);
	System.out.println("enter the number");
	int a=scan.nextInt();
	for(int i=1;i<=a;i++){
		fact=fact*i;}
	System.out.println("factorial= "+fact);
}}
	
