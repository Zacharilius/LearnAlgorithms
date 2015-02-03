package dataStructures;

public class TestDataStructures {

	public static void main(String[] args) {
		SLList list = new SLList();
		list.append(5);
		list.append(22);
		list.append(21);
		list.append(0);
		System.out.println(list.toString());
		
		System.out.println(list.search(0));
		System.out.println("\n" + list.toString());
	}

}
