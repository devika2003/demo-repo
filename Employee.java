import java.util.*;
class Empl
{


	String name;
	int age;
	int phone;
	String address;
	int salary;
	Empl(String name,int age,int phone,String address,int salary){
	this.name=name;
	this.age=age;
	this.phone=phone;
	this.address=address;
	this.salary=salary;
	}
	


	void Printsalary(){
		System.out.println("salary="+salary);
	}	
}



class Officer extends Empl{
	String specialisation;
	Officer(String name,int age,int phone,String address,int salary,String specialisation){
	super( name, age, phone, address, salary);
	this.specialisation=specialisation;
	System.out.println("name="+name+"\nage="+age+"\nphone="+phone+"\naddress="+address+"\nsalary="+salary+"\nspecialisation="+specialisation);
}}




class Manager extends Empl{
	String department;
	Manager(String name,int age,int phone,String address,int salary,String department){
	super(name, age, phone, address, salary);
	this.department=department;
	System.out.println("\nname="+name+"\nage="+age+"\nphone="+phone+"\naddress="+address+"\nsalary="+salary+"\ndepartment="+department);
}}


class Employee{
	public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	Officer o=new Officer("abc",16,9876543,"abc villa",50000,"sales");
	Manager m=new Manager("abcd",20,98765543,"abcd villa",5000,"sales");
}}
	 
	
