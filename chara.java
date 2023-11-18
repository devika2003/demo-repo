import java.util.*;
class chara
{
public static void main(String args[]){
	
	Scanner sc=new Scanner(System.in);
	System.out.println("enter string");
	String input=sc.nextLine();
	char a=sc.next().charAt(0);
	int pos;
	int flag=0;
	int n=input.length();
	for(int i=0;i<n;i++){
		if(input.charAt(i)==a){
			pos=i;
			flag=1;
			System.out.println("element is found at "+(i+1));
}}

	if(flag==0)
		System.out.println("element is not found  ");
}}
				
