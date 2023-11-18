import java.util.*;
class repl
{
public static void main(String args[]){
	
	Scanner sc=new Scanner(System.in);
	System.out.println("enter string");
	String input=sc.nextLine();
	System.out.println("enter char to be replaced");
	char n=sc.next().charAt(0);
	System.out.println("enter char to be replaced with");
	char m=sc.next().charAt(0);
	String rep=input.replace(n,m);
	System.out.println(rep);
	

}}
	
	
	
	//for(int i=0;i<n;i++){
		//if(input.charAt(i)=='x'){
