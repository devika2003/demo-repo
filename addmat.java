import java.util.*;
class addmat
{
public static void main(String args[]){
	int i,j;
	Scanner scan=new Scanner(System.in);
	System.out.println("enter no of rows and columns(no of rows and coloms should be same) ");
	int r=scan.nextInt();
	
	int c=scan.nextInt();
	int num[][]=new int[r][c];
	int a[][]=new int[r][c];
	int b[][]=new int[r][c];
	System.out.println("enter elements of first matrix");
	
	for(i=0;i<r;i++){
		for(j=0;j<c;j++){
		num[i][j]=scan.nextInt();
	}}
	System.out.println("enter elements of second matrix");
	for(i=0;i<r;i++){
		for(j=0;j<c;j++){
		a[i][j]=scan.nextInt();
	}}
	for(i=0;i<r;i++){
		for(j=0;j<c;j++){
		System.out.print(" "+num[i][j]);
	}
	System.out.println();
}System.out.println();
	for(i=0;i<r;i++){
		for(j=0;j<c;j++){
		System.out.print(" "+a[i][j]);
	}
	System.out.println();
}
	for(i=0;i<r;i++){
		for(j=0;j<c;j++){
			b[i][j]=num[i][j]+a[i][j];
}}System.out.println();
for(i=0;i<r;i++){
		for(j=0;j<c;j++){
		System.out.print(" "+b[i][j]);
	}
	System.out.println();
}
}}

	

