#include<stdio.h>
#define size 10
char s[size];
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
void push(char value){
	//printf("enter value");
	//scanf("%d",&v);
	if(isfull())
	printf("stack is full");
	else
	s[top++]=value;
}
char pop(){
	
	if(isempty())
	printf("the stack is empty");
	else
	top=top-1;
	return (s[top]);
}


void main(){
	int i;
	char c[50];
	printf("enter string  ");
	scanf("%s",c);
	for(i=0;c[i]!='\0';i++)
		push(c[i]);
	while (!isempty())
	printf("%c",pop());
}
	
