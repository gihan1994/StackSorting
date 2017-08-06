import java.util.Stack;

public class StackSort {

	public static void main(String[] args) {
		Integer values[] = { 12, 34, 23, 56, 78, 26, 18, 51, 46, 61, 89, 92 };
		Stack<Integer> stack1 = new Stack<>();
		Stack<Integer> stack2 = new Stack<>();
		// values adding in stack1
		for (Integer value : values) {
			stack1.push(value);
		}

		// sorting 

		while(!stack1.isEmpty()){
			int stack1val=stack1.pop();
			while(!stack2.isEmpty()&&stack2.peek()>stack1val){
				stack1.push(stack2.pop());
			}
			stack2.push(stack1val);
			
			
		}
		

		System.out.println(stack2);

	}

}

