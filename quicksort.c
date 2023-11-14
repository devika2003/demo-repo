#include<stdio.h>
void readnum(int [],int);
int partition(int [],int,int);
void swap(int *,int *);
void print(int [],int);
void qsort(int [],int,int);
void main(){
	int n,a[10];
	printf("enter the no of elements  ");
	scanf("%d",&n);
	//int end=n-1;
	
	readnum(a,n);
	
	qsort(a,0,n-1);

	print(a,n);
	
}
void readnum(int x[],int x1){
	printf("enter elements ");
	int i;
	for(i=0;i<x1;i++)
            {
		scanf("%d",&x[i]);
	}
}
void print(int z[],int z1){
	for(int i=0;i<z1;i++){
	printf("%d",z[i]);
}}
void qsort(int x[],int start,int end){
if(start<end){
int pos=partition(x,start,end);
qsort(x,start,pos-1);
qsort(x,pos+1,end);
}}

int partition(int x[],int start,int end){
	int key,i,j;
	key=x[start];
	i=start+1;
	j=end;
	do{
		while(i<j && x[i]<key)
		i++;
	while(j>start && x[i]>key)
	j--;
	if(i<j)
		swap(&x[i],&x[j]);
	}
	while(i<j);
		swap(&x[start],&x[j]);
	return j;
}
void swap(int *y,int *b){
int t;
t=*y;
*y=*b;
*b=t;
}

