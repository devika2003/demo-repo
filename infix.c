#include<stdio.h>
 

#define size 10
int s[size];
int top = 0;
int stackTop(){
    return s[top-1];
}
int isfull() {
    if(top >= size)
        return 1;
    else
        return 0;
}

int isempty() {
    if(top == 0)
        return 1;
    else 
        return 0;
}

void push(int value) {
    if(isfull())
        printf("Stack is full\n");
    else
        s[top++] = value;
}

int pop() {
    if(isempty()) {
        printf("The stack is empty\n");
        return -1; 
    }
    else
        return s[--top];
}

int peek() {
    if(isempty()) {
        printf("The stack is empty\n");
        return -1; 
    }
    else
        return s[top - 1];
}

void display() {
    int i;
    for(i = top - 1; i >= 0; i--)
        printf("%d ", s[i]);
    printf("\n");
}

int isOperator(char ch) {
    
    if(ch == '+' || ch == '-' || ch == '*' || ch == '/'|| ch== '(' || ch==')' )
        return 1;
    else
        return 0;
}



int precedence(char ch) {
    if(ch == '*' || ch == '/')
        return 2;
    else if(ch == '+' || ch == '-')
        return 1;
    else
        return 0;
}

void infixToPostfix(char infix[], char postfix[]) {
    int i, j = 0;
    char ch;
    for (i = 0; infix[i] != '\0'; i++) {
        if (!isOperator(infix[i])) {
            postfix[j] = infix[i];
            j++;
        } else if (infix[i] == '(') {
            push(infix[i]);
        } else if (infix[i] == ')') {
            while (stackTop() != '(' && !isempty()) {
                postfix[j] = pop();
                j++;
            }
            pop(); 
        } else if (isOperator(infix[i])) {
            while (!isempty() && precedence(infix[i]) <= precedence(stackTop())) {
                postfix[j] = pop();
                j++;
            }
            push(infix[i]);
        }
    }

    while (!isempty()) {
        postfix[j] = pop();
        j++;
    }

    postfix[j] = '\0';
}


  

int main() {
    char infix[10];
	scanf("%s",infix);
    char postfix[size]; 
    infixToPostfix(infix, postfix);
    printf("Infix: %s\n", infix);
    printf("Postfix: %s\n", postfix);
    return 0;
}
