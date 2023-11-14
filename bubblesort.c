#include<stdio.h>
void readnum(int [],int);
void bubble(int [],int);
void swap(int *,int *);
void print(int [],int);


void main(){
	int n,a[10];
	printf("enter the no of elements  ");
	scanf("%d",&n);
	
	readnum(a,n);
	bubble(a,n);
	
	print(a,n);
	
}

	
		

 
void readnum(int x[],int n){
	printf("enter elements ");
	int i;
	for(i=0;i<n;i++){
		scanf("%d",&x[i]);
	}
}
void bubble(int x2[],int n){
	int i,j,exchange,t;
	for(i=0;i<n-1;i++){
	 exchange =0;
	for(j=0;j<n-1;j++)
		if(x2[j]>x2[j+1]){
		swap(&x2[j],&x2[j+1]);
		exchange=1;
 		} 
	}
	if(exchange==1)
		return;
}
void swap(int *a,int *b){
int t;
t=*a;
*a=*b;
*b=t;
}

void print(int z[],int n){
	for(int i=0;i<n;i++){
	printf("%d ",z[i]);
}}

