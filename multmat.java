import java.util.*;
class multmat
{
public static void main(String args[]){
	int i,j,k;
	Scanner scan=new Scanner(System.in);
	System.out.println("enter no of rows and columns of first matrix");
	int r1=scan.nextInt();
	
	int c1=scan.nextInt();
	System.out.println("enter no of rows and columns of second matrix");
	int r2=scan.nextInt();
	
	int c2=scan.nextInt();
	int num[][]=new int[r1][c1];
	int a[][]=new int[r2][c2];
	int b[][]=new int[r1][c2];
	System.out.println("enter elements of first matrix");
	
	for(i=0;i<r1;i++){
		for(j=0;j<c1;j++){
		num[i][j]=scan.nextInt();
	}}
	System.out.println("enter elements of second matrix");
	for(i=0;i<r2;i++){
		for(j=0;j<c2;j++){
		a[i][j]=scan.nextInt();
	}}
	for(i=0;i<r1;i++){
		for(j=0;j<c1;j++){
		System.out.print(" "+num[i][j]);
	}
	System.out.println();
}System.out.println();
	for(i=0;i<r2;i++){
		for(j=0;j<c2;j++){
		System.out.print(" "+a[i][j]);
	}
	System.out.println();
}System.out.println();

	for(i=0;i<r1;i++){
		for(j=0;j<c2;j++){
		for(k=0;k<r2;k++){
		b[i][j]+=num[i][k]*a[k][j];
}}}System.out.println("product=");
for(i=0;i<r1;i++){
		for(j=0;j<c2;j++){
	System.out.print(" "+b[i][j]);
		
}System.out.println();}}}
