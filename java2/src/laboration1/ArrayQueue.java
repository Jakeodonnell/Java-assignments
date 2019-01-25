package laboration1;

public class ArrayQueue<T> implements Queue<T>{
	private T[] stack;
	private int length = 0;
	
	public ArrayQueue(int size) {
		stack = (T[])new Object[size];
	}
	
	public void add(T data) {
		if(length < stack.length) {
			throw new QueueException("Queue is full");
		}
		stack[length++] = data;
	}

	public T remove() {
		if(length==0) {
			throw new QueueException("Queue is empty");
		}
		T value = stack[0];
		length--;
		for(int i = 1; i < length; i++) {
			stack[i-1] = stack[i];
		}
		stack[length] = null;
		return value;
	}

	public T element() {
		if(length == 0) {
			throw new QueueException("Queue is empty");
		}
		return stack[0];
	}

	public boolean isEmpty() {
		return(length == 0);
	}

	public int size() {
		return length;
	}
	
}
