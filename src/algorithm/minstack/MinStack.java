package algorithm.minstack;

import java.util.Stack;

public class MinStack extends Stack<Integer>
{
	    Stack<Integer> min = new Stack<>();
	     
	    /* SpecialStack's member method to insert an element to it. This method
	    makes sure that the min stack is also updated with appropriate minimum
	    values */
	     
	    void push(int x)
	    {
	        if(isEmpty() == true)
	        {
	            super.push(x);
	            min.push(x);
	        }
	        else
	        {
	            super.push(x);
	            int y = min.pop();
	            min.push(y);
	         
	            /* push only when the incoming element of main stack is smaller 
	            than or equal to top of auxiliary stack */
	            if( x <= y )
	                min.push(x);
	        }
	    }
	         
	    /* SpecialStack's member method to remove an element from it. This method
	    removes top element from min stack also. */
	    public Integer pop()
	    {
	        int x = super.pop();
	        int y = min.pop();
	         
	        /* Push the popped element y back only if it is not equal to x */
	        if ( y != x )
	            min.push(y);
	        return x;
	    }
	 
	    /* SpecialStack's member method to get minimum element from it. */
	    int getMin()
	    {
	        int x = min.pop();
	        min.push(x);
	        return x;
	    }
	 
	    /* Driver program to test SpecialStack methods */
	    public static void main(String[] args) 
	    {
	    	MinStack s = new MinStack();
	        s.push(10);
	        s.push(20);
	        s.push(30);
	        System.out.println(s.getMin());
	        s.push(5);
	        System.out.println(s.getMin());
	    }
}
