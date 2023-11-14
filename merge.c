#include<stdio.h>
void readnum(int [],int);
void merge(int [],int,int);
//void swap(int *,int *);
void print(int [],int);
void smerge(int [],int,int,int);
void main(){
	int n,a[n];
	printf("enter the no of elements  ");
	scanf("%d",&n);
	
	int beg=0;
	int end=n-1;
	readnum(a,n);
	
	merge(a,beg,end);

	print(a,n);
	
}
void readnum(int x[],int n){
	printf("enter elements ");
	int i;
	for(i=0;i<n;i++)
            {
		scanf("%d",&x[i]);
	}
}
void print(int z[],int z1){
	for(int i=0;i<z1;i++){
	printf("%d	",z[i]);
}}
void smerge(int a[],int f,int s,int t){
	int i,k,j,temp[50];
	i=f;
	j=s;
	k=0;
	while(i<s && j<=t)
	{
		if(a[i]<a[j]){
			
		temp[k++]=a[i++];
	}
		else
		temp[k++]=a[j++];
	}
	while(i<s)
	temp[k++]=a[i++];
	while(j<=t)
	temp[k++]=a[j++];
	for (i=f,k=0;i<=t;)
	a[i++]=temp[k++];
	}

void merge(int a[],int beg,int end){
int mid;
if(beg<end)
{
mid=(beg+end)/2;
merge(a,beg,mid);
merge(a,mid+1,end);
smerge(a,beg,mid+1,end);
}}
