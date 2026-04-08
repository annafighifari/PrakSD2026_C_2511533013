package pekan3_2511533013;

public class stackArray_251153013 {
    static final int MAX_3013 = 1000;
    int top;
    int a[] = new int[MAX_3013];
    boolean isEmpty()
{
    return (top < 0);
}
stackArray_251153013()
{
    top = -1;
}
boolean push(int x)
{
    if (top >= (MAX_3013 - 1)) {
        System.out.println("Stack Overflow");
        return false;
    }
    else {
        a[++top] = x;
        System.out.println(x + " dimasukkan kedalam stack");
        return true;
    }
}
int pop()
{
    if (top < 0) {
        System.out.println("Stack Underflow");
        return 0;
    }
    else {
        int x = a[top--];
        return x;
    }
}
int peek()
{
    if(top < 0) {
        System.out.println("Stack Underflow");
        return 0;
    }
    else {
        int x = a[top];
        return x;
    }
}
void print(){
    for(int i = top; i>-1; i--){
        System.out.println(" "+ a[i]);
        }
    }
}



