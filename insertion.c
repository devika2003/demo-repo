#include<stdio.h>
void readnum(int [],int);
void insertion(int [],int);
void swap(int *,int *);
void print(int [],int);


void main(){
	int n,a[10];
	printf("enter the no of elements  ");
	scanf("%d",&n);
	
	readnum(a,n);
	
	insertion(a,n);

	print(a,n);
	
}
void insertion(int b[],int b1){
	int i,j,key;
	for(i=1;i<b1;i++){
		key=b[i];
		j=i-1;
		while(j>=0 && b[j]>key){
		b[j+1]=b[j];
		j--;
	b[j+1]=key;
}}}
	
		

 
void readnum(int x[],int x1){
	printf("enter elements ");
	int i;
	for(i=0;i<x1;i++){
		scanf("%d",&x[i]);
	}
}

void swap(int *a,int *b){
int t;
t=*a;
*a=*b;
*b=t;
}

void print(int z[],int x3){
	for(int i=0;i<x3;i++){
	printf("%d ",z[i]);
}}

