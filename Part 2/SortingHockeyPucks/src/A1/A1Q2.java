/**
 * EECS 2101 N, Winter 2024
 * Assignment 1, Question 2 starter code.
 * Please read carefully the instructions in the assignment handout
 * and the starter code.
 */
package A1;
// Do NOT modify the package declaration

import java.util.ArrayList;
// Do NOT add any import

// You may implement a new class here, such as a Stack or a Queue.
// Any additional class that you use must be included in THIS file.
class StackOfNumbers{
	ArrayList<Integer> list;
	
	public StackOfNumbers(ArrayList<Integer> arr) {
		list = new ArrayList<Integer>(arr);
	}
	
	public StackOfNumbers() {
		list = new ArrayList<Integer>();
	}
	
	public boolean empty() {
		return this.list.isEmpty();
	}
	
	public Integer peek() {
		if (this.list.isEmpty()) return null;
		return this.list.get(this.list.size()-1);
	}
	
	public Integer pop() {
		if (this.list.isEmpty()) return null;
		return this.list.remove(this.list.size()-1);
	}
	
	public boolean push(int element) {
		boolean state = this.list.add(element);
		return state;
	}
	
}

class QueueOfNumbers{
	ArrayList<Integer> list;
	
	public QueueOfNumbers(){
		list = new ArrayList<Integer>();
	}
	
	public QueueOfNumbers(int arr[]) {
		for (int element: arr) {
			this.list.add(element);
		}
	}
	
	public boolean isEmpty() {
		return this.list.isEmpty();
	}
	
	public Integer peek() {
		if (this.list.isEmpty()) return null;
		return this.list.get(0);
	}
	
	public Integer pop() {
		if (this.list.isEmpty()) return null;
		return this.list.remove(0);
	}
	
	
}

public class A1Q2 {

    /**
     * The function that you need to implement.
     * Read the assignment handout for the specification.
     *
     * DO NOT MODIFY the declaration of the function (its parameter types and return type).
     */
    public static int solve(int[] arr) {
    	
    	if (arr.length == 0) return 0;
    	
    	
    	StackOfNumbers stack = new StackOfNumbers();
    	
    	
    	
        return 0;
    }

    /**
     * This main function contains a few test cases that can be used to check
     * that your code compiles and runs. Note that these test cases are NOT complete,
     * and you need to test your code thoroughly with more cases.
     */
    public static void main(String[] args) {

        // Printing "true" means the return value is correct.

        int[] arr = {4, 5, 2, 1, 3};
        System.out.println(3 == solve(arr));

        arr = new int[] {5, 4, 3, 1, 2};
        System.out.println(5 == solve(arr));

        arr = new int[] {1};
        System.out.println(1 == solve(arr));

        arr = new int[] {2, 3, 1};
        System.out.println(1 == solve(arr));

        arr = new int[] {7, 1, 5, 4, 3, 2, 8, 10, 9, 6};
        System.out.println(6 == solve(arr));
    }
}
