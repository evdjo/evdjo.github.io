import java.util.Scanner;

import abstractDataTypes.BoundedStack;


public class StackUsageExample {

	/**
	 * 09/02/2014
	 * This is an example for the usage of Stack ADT.
	 * It is used in compilers, in expression evaluations.
	 * The test uses only the  ( , ) , { , } brackets , but the idea is clear.
	 * 
	 * @author Evdzhan Mustafa
	 * @param args
	 */
public static void main(String[] args) {
		
		
		BoundedStack b = new BoundedStack();
		String a = "({} ({}))";
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the string to check :  ( ( ) { } only  ");
		a=s.next();
		for(int i=0;i<a.length();i++){
			
		
			 if(a.charAt(i) == '(' || a.charAt(i) == '{'  ) {
				 
			 
				 b.push(a.charAt(i));
				 
				 
			 } else if(  a.charAt(i) == '}'  ) {
				 
				 char  x = (char) b.pop();
				
				 if(x != '{' ) {
					
					 s.close();
					 throw new Error("Closing bracet - \"}\" has no matching pair... ");
				 
				 }  
				
				 
			 }  else if(a.charAt(i) == ')' ) {
				
				 char  x = (char) b.pop();
				 if(x != '('){
					 s.close();
					 throw new Error("Closing bracet - \")\" has no matching pair... ");
				 }  
				 
			 }
		} if(b.sizeOf() != 0) {
			
			char z = (char) b.pop();
			s.close();
		    throw new Error("Unclosed braced "+z);
		    
		} else {
			System.out.println("The expression is fine !");
			
		}
		s.close();
		 

}
}
