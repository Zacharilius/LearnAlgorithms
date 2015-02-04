package dataStructures;

public class Stack extends SLList{
	public Stack(){
		super();
	}
	public void push(int data){
		
	}
	public int pop(){
		int value = getHead().getData();
		setHead(getHead().getNext());
		return value;
	}
}

