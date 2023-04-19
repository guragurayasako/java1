public class Stack {
	private int[] data;
	private int top;

	public Stack() {
		data = new int[100];
		top = 0;
	}
	
	public void Push(int a){
		if(top > 100) System.out.println("Stack is full!");
		else{
			data[top] = a;
			top++;
		}
	}

	public int Pop(){
		if(top == 0) System.out.println("Stack is empty!");
		else{
			int a = data[top-1];
			top--;
			return a;
		}
		return 0;
	}



}
