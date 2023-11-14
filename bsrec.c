#include<stdio.h>
void read(int [],int);
int binary(int [],int,int,int);
void main(){
	
	int n,a[10],x,flag;
	printf("enter the number of elements");
	scanf("%d",&n);
	read(a,n);
	int top=0,bot=n-1;
	printf("enter the number to be searched");
	scanf("%d",&x);
	flag=binary(a,top,bot,x);
	if(flag==(-1))
		printf("element is not present");
	else
		printf("element is present at %d",flag+1);
}
void read(int x[],int x1){
	printf("enter elements in sorted order ");
	int i;
	for(i=0;i<x1;i++){
		scanf("%d",&x[i]);
	}
}
int binary(int a[],int top,int bot,int x){
int mid;
if(top<=bot){
mid=(top+bot)/2;
	if(a[mid]==x)
		return mid;
	else if(x<a[mid])
		binary(a,top,mid-1,x);
	else if(x>a[mid])
		binary(a,mid+1,bot,x);
}
	else 
		return (-1);
}



