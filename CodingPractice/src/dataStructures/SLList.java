package dataStructures;

import java.util.Hashtable;

public class SLList {
	private SLListNode head;
	
	public SLList(int data){
		head = new SLListNode(data);
	}
	public SLList(){
		head = null;
	}
	//appends node to the end of the SLList
	public void append(int data){
		//SLList is empty
		if(head == null){
			head = new SLListNode(data);
		}
		//SLList is not empty
		else{
			SLListNode currNode = head;
			while(currNode.getNext() != null){
				currNode = currNode.getNext();
			}
			currNode.setNext(new SLListNode(data));
		}
	}
	public void prepend(int data){
		SLListNode temp = new SLListNode(data);
		temp.setNext(head);
		head = temp;
	}
	public String toString(){
		StringBuffer buff = new StringBuffer();
		SLListNode currNode = head;
		while(currNode.getNext() != null){
			buff.append(currNode.getData() + "\n");
			currNode = currNode.getNext();
		}
		buff.append(currNode.getData());
		return buff.toString();
	}
	//remove first node with NodeData = data
	public int remove(int data){
		int output;
		//If head.getData = data
		if(head.getData() == data){
			output = head.getData();
			head = head.getNext();
			return output;
		}
	
		//
		SLListNode currNode = head;
		
		while(currNode.getNext() != null){
			if(currNode.getNext().getData() ==  data){
				output = currNode.getNext().getData();
				currNode.setNext(currNode.getNext().getNext());
				return output;
			}
			currNode = currNode.getNext();
		}
		//Check last node
		return 999;
		
	}
	public boolean search(int data){
		//If head.getData = data
		if(head.getData() == data){
			return true;
		}
	
		//
		SLListNode currNode = head;
		
		while(currNode.getNext() != null){
			if(currNode.getNext().getData() ==  data){
				return true;
			}
			currNode = currNode.getNext();
		}
		//Check last node
		return false;	}
	public SLListNode getHead() {
		return head;
	}
	public void setHead(SLListNode head) {
		this.head = head;
	}
	public void removeDuplicates(){
		Hashtable hash = new Hashtable();
		SLListNode currNode = head;

		while(currNode.getNext() != null){
			if(hash.containsKey(currNode.getData())){
				remove(currNode.getData());
			}
			else{
				hash.put(currNode.getData(), true);
			}
			currNode = currNode.getNext();
		}
		// Checks last node
		if(hash.containsKey(currNode.getData())){
			remove(currNode.getData());
		}
	}
}
