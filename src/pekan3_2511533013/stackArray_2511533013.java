package pekan3_2511533013;

public class stackArray_2511533013 {
	static final int MAX_3013 = 1000;
	int top_3013;
	int a[] = new int[MAX_3013];
	boolean isEmpty()
	{
		return (top_3013 < 0);
	}
	stackArray_2511533013()
	{
		top_3013 = -1;
		
	}
	boolean push_3013 (int x)
	{
		if (top_3013 >= (MAX_3013 -1)) {
			System.out.println("Stack Overflow");
			return false;
			
		}
		else {
			a[++top_3013] = x;
			System.out.println(x + " dimasukkan dalam Stack");
			return true;
			
		}
	}
	int pop()
	{
		if(top_3013 < 0) {
			System.out.println("Stack Underflow");
			return 0;
	
		}else {
				int x = a [top_3013--];
				return x;
			}
		
		}
	int peek()
	{
		if (top_3013 < 0) {
			System.out.println("Stack Underflow");
			return 0;
			
		}
		else {
			int x = a [top_3013];
			return x;
		}
	}
	void print  () {
		for (int i = top_3013; i>-1; i--) {
			System.out.print(" "+ a[i]);
		}
		
		}
	}