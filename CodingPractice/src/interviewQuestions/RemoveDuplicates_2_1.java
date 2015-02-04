package interviewQuestions;

import dataStructures.SLList;

public class RemoveDuplicates_2_1 {
	public static void main(String[] args){
		SLList list = new SLList();
		list.append(5);
		list.append(22);
		list.append(21);
		list.append(0);
		list.append(5);
		list.append(22);
		list.append(21);
		list.append(0);
		
		System.out.println(list.toString());
		list.removeDuplicates();
		System.out.println("Removed: \n" + list.toString());
	}
	
}
