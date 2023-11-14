#include<stdio.h>
#include<stdlib.h>
#define size 50
int q[size];
int f=-1;
int r=-1;
void insertq(int);
int delete();
void display();
int isEmpty();
int isfull();
void main()
{
int c,item,v;
do
{
	printf("\n1.insert\n2.delete\n3.display\n4.exit\n"); 
	printf("enter your choice");
	scanf("%d",&c);
	switch(c){
	case 1:{
		if(isfull())
		printf("q is full");
		else{
		printf("eneter the elemenet to be inserted");
		scanf("%d",&v);
		insertq(v);}
		break;}
	case 2:
		if(isEmpty())
		{printf("empty");
		}
		else
		{//int d=delete();
		printf("the deleted val is %d ",delete());
		}
		break;
	case 3:
		if(isEmpty())
		{printf("empty");
		}
		else
		display();
		break;
	case 4:break;
	default:printf("wrong choice");
	}}while(c!=4);
}
int isEmpty(){
		if(f==-1)
		return 1;
		else
		return 0;
}
int isfull(){
	if(f==(r+1)%size)
	return 1;
	else 
	return 0;}
void insertq(int item){
	if(isEmpty())
	{
	f=0;
	r=0;
	q[r]=item;}
	else
	{r=(r+1)%size;
	
	q[r]=item;
	}}
int delete()
{
	int item;
	item=q[f];
	if(f==r)
	{
	f=-1;
	r=-1;
	}
	else{
	f=(f+1)%size;
	}
	return(item);
}
void display(){
	int i;
	for(i=f;i<=r;i++)
	printf("%d\n",q[i]);
}
	
