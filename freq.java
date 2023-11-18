import java.util.*;
class freq
{
public static void main(String args[]){
	
	Scanner sc=new Scanner(System.in);
	System.out.println("enter string");
	
	String input=sc.nextLine();
	System.out.println("enter letter");
	char a=sc.next().charAt(0);
	int j=0;
	int n=input.length();
	for(int i=0;i<n;i++){
		if(input.charAt(i)==a){
			j++;
}}
 System.out.println("the element occurs "+j+" times");
}}
