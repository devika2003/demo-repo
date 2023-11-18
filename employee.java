import java.util.*;
class st
{

	String name[]=new String[5];
	int phone[]=new int[5];
	int empno[]=new int[5];
	void employees(String name[],int empno[],int phone[])
	{
         this.name=name;
         this.empno=empno;
         this.phone=phone;
         }

	void read(){
	
	Scanner sc=new Scanner(System.in);
	for(int i=0;i<5;i++){
		

	System.out.println("enter name"+(i+1));
	name[i]=sc.next();
	System.out.println("enter phone no "+(i+1));
	phone[i]=sc.nextInt();
	System.out.println("enter empno "+(i+1));
	empno[i]=sc.nextInt();
}}
void display(){
		for(int i=0;i<5;i++){
		System.out.println("name "+(i+1)+" "+name[i]);
		System.out.println("empno"+(i+1)+" "+empno[i]);
		System.out.println("phone"+(i+1)+" "+phone[i]);
		

}}}


	
		
		

class employee
{
 public static void main(String args[])
 {
  int phone,empno;
  String name;
  st s=new st();
  s.read();
  s.display();
 }
}
