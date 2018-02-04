public class MinStack {

	public void getMin(Node stack){
		if(stack.s.isEmpty()){
			System.out.println("Stack is Empty");
		}else
			System.out.println(stack.minEle);
	}

	//pop top element
	//if top<minEle -> minEle = 2*minEle - top
	public void pop(Node stack){
		if(stack.s.isEmpty()){
			System.out.println("Stack is empty");
		}else{
			int topElement = stack.s.pop();
			if(topElement<stack.minEle){
				stack.minEle = 2*stack.minEle-topElement;
			}
		}
	}

	//if empty push data and minEle = data
	//if data<minEle -> push data and minEle = 2*data-minEle;
	//else push data
	public void push(Node stack,int data){
		if(stack.s.isEmpty()){
			stack.s.push(data);
			stack.minEle = data;
		}else if(stack.minEle>data){
			stack.s.push(2*data-stack.minEle);
			stack.minEle = data;
		}else{
			stack.s.push(data);
		}
	}


	public static void main(String[] args) {
		MinStack minStack = new MinStack();
		Node stack = new Node();
		minStack.push(stack,3);
		minStack.push(stack,5);
		minStack.push(stack,4);
		minStack.push(stack,1);
		minStack.push(stack,7);
		minStack.getMin(stack);
		minStack.pop(stack);
		minStack.pop(stack);
		minStack.getMin(stack);
		
	}

}
