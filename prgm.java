import java.util.*;
class st
{
	
	String name;int marks[]=new int[5],rollno;
	void student(String name,int rollno,int marks[])
        {
         this.name=name;
         this.rollno=rollno;
         this.marks=marks;
         }
 
	
	void read(){
	Scanner sc=new Scanner(System.in);
	System.out.println("enter rollno ");
	rollno=sc.nextInt();
	System.out.println("enter name ");
	name=sc.next();
	System.out.println("enter marks ");
	for(int j=0;j<5;j++){
			 marks[j]=sc.nextInt();
		}}
	void display(){
		System.out.println(rollno+" "+name+" ");
		for(int i=0;i<5;i++)
		System.out.println("marks"+(i+1)+"="+marks[i]);
}}
class prgm
{
 public static void main(String args[])
 {
  int marks[],rollno;
  String name;
  st s=new st();
  s.read();
  s.display();
 }
}
