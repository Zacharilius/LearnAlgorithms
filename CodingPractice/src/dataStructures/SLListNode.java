package dataStructures;

public class SLListNode {
	private int data;
	private SLListNode next;
	
	public SLListNode(int data, SLListNode next) {
		this.data = data;
		this.next = next;
	}
	public SLListNode(int data) {
		this.data = data;
		this.next = null;
	}
	
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public SLListNode getNext() {
		return next;
	}
	public void setNext(SLListNode next) {
		this.next = next;
	}
	
	
}
