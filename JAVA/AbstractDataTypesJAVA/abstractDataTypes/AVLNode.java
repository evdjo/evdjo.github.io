package abstractDataTypes;

public class AVLNode<E extends Comparable<E>> {
	
	public E data;
	public AVLNode<E> left;
	public AVLNode<E> right;
	public int balanceFactor=0;
	
	public int compareTo(AVLNode<E> anotheNode){
		return data.compareTo(anotheNode.data);
	}
	
	public AVLNode(E data) {
		this.data=data;
	}
	public AVLNode() {
		 
	}
	public String toString() {
		return data.toString();
	}
	
	
	
	


}
