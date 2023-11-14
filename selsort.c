#include<stdio.h>
void readnum(int [],int);
void bubble(int [],int);
void swap(int *,int *);
void print(int [],int);
void selsort(int [],int);

void main(){
	int n,a[10];
	printf("enter the no of elements  ");
	scanf("%d",&n);
	
	readnum(a,n);
	
	selsort(a,n);

	print(a,n);
	
}
void selsort(int b[],int b1){
	int i,j,l,index;
	for(i=0;i<=b1-1;i++){
		l=b[0];
		index=0;
		for(j=1;j<b1-i;j++){
			if(l<b[j]){
			l=b[j];
			index=j;
	}}
	swap(&b[index],&b[b1-1-i]);
}
}
	
		

 
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
	printf("%d",z[i]);
}}

