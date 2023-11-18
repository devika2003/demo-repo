import java.util.*;
class transpose
{
public static void main(String args[]){
	int i,j;
	Scanner scan=new Scanner(System.in);
	System.out.println("enter no of rows");
	int r=scan.nextInt();
	System.out.println("enter no of columns");
	int c=scan.nextInt();
	int num[][]=new int[r][c];
	System.out.println("enter elements");
	
	for(i=0;i<r;i++){
		for(j=0;j<c;j++){
		num[i][j]=scan.nextInt();
	}}
	for(i=0;i<r;i++){
		for(j=0;j<c;j++){
		System.out.print(" "+num[i][j]);
	}
	System.out.println();
}
	int b[][]=new int[c][r];
	for(i=0;i<c;i++){
		for(j=0;j<r;j++){
			b[i][j]=num[j][i];
}}
System.out.println();
for(i=0;i<c;i++){
		for(j=0;j<r;j++){
		System.out.print(" "+num[j][i]);
	}
	System.out.println();
}
}}

		
