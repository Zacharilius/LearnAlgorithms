package dataStructures; 

public class BinarySearchTree<Key extends Comparable<Key>, Value>{
	// Fields
	private BSTNode root;
	
	// Nested class
	private class BSTNode{
		private Key k;
		private Value v;
		private BSTNode left, right;
		public BSTNode(Key k, Value v) {
			super();
			this.k = k;
			this.v = v;
		}
	}
	
	// Main class
	public static void main(String[] args) {
		BinarySearchTree<String, Integer> bst = new BinarySearchTree<String, Integer>();
		String[] arr = {"a", "b", "c", "d", "e","f", "g", "h", "i", "j", "k"};
        for(int i = 0; i < arr.length; i++){
        	System.out.println(i);
        	bst.put(arr[i],i);
        }
        bst.inOrder();
        

	}
	// Put
	public void put(Key k, Value v){
		root = put(k, v, root);
	}
	private BSTNode put(Key k, Value v, BSTNode b){
		// Check if b = null
		if(b == null){
			System.out.println("added");
			return new BSTNode(k, v);
		}
		//Then recursively find position
		int comp = k.compareTo(b.k);
		if(comp == -1) b.left = put(k, v, b.left);
		else if(comp == 1) b.right = put(k,v,b.right);
		else return null;
		
		return b;
	}
	
	//In order
	public void inOrder(){
		inOrder(root);
	}
	private void inOrder(BSTNode b){

		//Then recursively find position
		if(b.left != null){
			inOrder(b.left);
		}
		System.out.print(b.k);
		if(b.right != null){
			inOrder(b.right);
		}
	
	}
	
	//Pre order
	
	//Post order
	
	
	// Delete
	
	

}
