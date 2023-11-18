import java.util.*;
abstract class shape{
	abstract void numberofsides();
	}
class rectangle extends shape{
	void numberofsides(){
	System.out.println("4 sides");
	}
	}
class triangle extends shape{
	void numberofsides(){
	System.out.println("3 side");
	}
}
class hexagon extends shape{
 void numberofsides(){
	System.out.println("6 side");
}}
public class abs{
 public static void main(String args[]){
	rectangle rect=new rectangle();
	triangle tri=new triangle();
	hexagon hex=new hexagon();
	rect.numberofsides();
	tri.numberofsides();
	hex.numberofsides();
}}
