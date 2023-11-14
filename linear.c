#include<stdio.h>
void readnum(int [],int);
void linearSearch(int [],int,int);


void main(){
	int n,a[10],key;
	printf("enter the no of elements  ");
	scanf("%d",&n);
	printf("enter the key");
	scanf("%d",&key);
	readnum(a,n);
	linearSearch(a,n,key);
	
}
void readnum(int x[],int x1){
	printf("enter elements");
	int i;
	for(i=0;i<x1;i++){
		scanf("%d",&x[i]);
	}
}
void linearSearch(int y[],int x2,int k){
	int i,flag=0; 
	
	for(i=0;i<x2;i++){
		if(y[i]==k){
		flag=1;
		break;
	}}
	if(flag==1){
		printf("the number is found at position %d ",i+1);
}
	else
		printf("the number is not found");
}


