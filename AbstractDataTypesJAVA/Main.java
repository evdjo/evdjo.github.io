import abstractDataTypes.BinaryTree;

 

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
   
	 BinaryTree bt = new BinaryTree();
	 bt.addNode(5, "five");
	 bt.addNode(8, "eight");
	 bt.addNode(25, "twenty-five");
	 bt.addNode(1, "one");
	 bt.addNode(2, "two");
	 bt.addNode(3, "three");
	// bt.orderTraverse(bt.getRoot());
	System.out.println(bt.remove(25));
	 bt.orderTraverse(bt.getRoot());
	}
}