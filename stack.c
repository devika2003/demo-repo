#include<stdio.h>
#define size 10
int s[size];
int top=0;
int isfull(){
	if(top>=size)
	return(1);
	else
	return 0;
}
int isempty(){
	if(top==0)
	return 1;
	else 
	return 0;
}
void push(int value){
	//printf("enter value");
	//scanf("%d",&v);
	if(isfull())
	printf("stack is full");
	else
	s[top++]=value;
}
int pop(){
	
	if(isempty())
	printf("the stack is empty");
	else
	top=top-1;
	return (s[top]);
}
int peek(){
	if(isempty())
	printf("the stack is empty");
	else
	return(s[top-1]);
}
void display()
{
	int i;
	for(i=top-1;i>=0;i--)
		printf("%d",s[i]);
}
void main(){
	int c;
	do{
	
	printf("\n1.push\n2.pop\n3.peek\n4.display\n5.exit\n");
	printf("enter your choice");
	scanf("%d",&c);
	switch(c){
	case 1:{
		int v;
		printf("enter your value\n");
		scanf("%d",&v);
		if(isfull())
		printf("full");
		else 
		push(v);
	}
		break;
	case 2:
	if(isempty())
	printf("empty");
	else 
	printf("the value is %d ",pop());
	break;

	case 3:
	printf("item at the top is %d",peek());
	break;
	case 4:
	display();
	break;
	case 5:
	break;
	
	default: 
	printf("wrong choice");
}}while(c!=5);

}	
	

	
		
	

