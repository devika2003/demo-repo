import java.util.*;
class palin
{
public static void main(String args[]){
	
	Scanner sc=new Scanner(System.in);
	System.out.println("enter string");
	String input=sc.nextLine();
	
	int n=input.length();
	int flag=0;
	
	for(int i=0;i<n/2;i++){
		if(input.charAt(i)!=input.charAt(n-1-i)){
			flag=1;
			break;
}}
if(flag==0)
	System.out.println("is a palindrome");
else
System.out.println("not a palindrome");
}}

	

	
	 
	
