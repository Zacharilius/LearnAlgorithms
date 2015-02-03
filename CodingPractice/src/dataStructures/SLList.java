package dataStructures;

public class SLList {
	private SLListNode head;
	
	public SLList(int data){
		head = new SLListNode(data);
	}
	public SLList(){
		head = null;
	}
	//appends node to the end of the SLList
	public boolean append(int data){
		//SLList is empty
		if(head == null){
			head = new SLListNode(data);
			return true;
		}
		//SLList is not empty
		else{
			SLListNode currNode = head;
			while(currNode.getNext() != null){
				currNode = currNode.getNext();
			}
			currNode.setNext(new SLListNode(data));
			return true;
		}
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
}
