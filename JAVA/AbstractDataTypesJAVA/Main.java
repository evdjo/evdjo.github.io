import java.util.MissingFormatArgumentException;

import abstractDataTypes.BoundedStack;

 




 

public class Main {

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) {
		
		
		BoundedStack b = new BoundedStack();
		String a = "({} (({}))";
		for(int i=0;i<a.length();i++){
			 if(a.charAt(i) == '(' || a.charAt(i) == '{'  ) {
				 b.push(a.charAt(i));
			 } else if(  a.charAt(i) == '}'  ) {
				 char  x = (char) b.pop();
				 if(x != '{' ) {
					 throw new Error("Closing bracet - \"}\" has no matching pair... ");
				 }  
				
				 
			 }  else if(a.charAt(i) == ')' ) {
				 char  x = (char) b.pop();
				 if(x != '('){
					 throw new Error("Closing bracet - \")\" has no matching pair... ");
				 }  
				 
			 }
		} if(b.sizeOf() != 0) {
			char z = (char) b.pop();
			 throw new Error("Unclosed braced "+z);
		}
		 

		
		
		
		
		
		
		
		
		
		
		/* 
		 Person a = new Person(21,"Evdzhan",1450);
		 Person b = new Person(32,"Evdzhan",1450);
		 Person c = new Person(33,"Evdzhan",1450);
		 Person d = new Person(34,"Evdzhan0",1450);
		 Person b1 = new Person(12,"Evdzhan",1450);
		 Person c2 = new Person(13,"Evdzhan",1450);
		 Person d3 = new Person(10,"Evdzhan0",1450);
		 AVLTree<Person> tree = new AVLTree<>();
		 tree.insert(a);
		 tree.insert(b);
		 tree.insert(c);
		 tree.insert(d);
		 tree.insert(b1);
		 tree.insert(c2);
		 tree.insert(d3);
		 
		 tree.orderTraverse(tree.root);
		
		System.out.println(tree.root.balanceFactor);
	 
		
		*/
   
 
	 
		

	}

}
