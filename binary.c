#include<stdio.h>
void read(int [],int);
int binary(int [],int,int);
void main(){
	
	int n,a[10],x,flag;
	printf("enter the number of elements");
	scanf("%d",&n);
	read(a,n);
	printf("enter the number to be searched");
	scanf("%d",&x);
	flag=binary(a,n,x);
	if(flag==(-1))
		printf("element is not present");
	else
		printf("element is present at %d",flag+1);
}

	
	
	
int binary(int a[],int n,int x){
	int top,bot,mid;
	top=0;
	bot=n-1;
	while(top<=bot){
	mid=(top+bot)/2;
	if(a[mid]==x)
		return mid;
	else if(x<a[mid])
		bot=mid-1;
	else
		top=mid+1;
	}
	return(-1);
}
void read(int x[],int x1){
	printf("enter elements in sorted order ");
	int i;
	for(i=0;i<x1;i++){
		scanf("%d",&x[i]);
	}
}
