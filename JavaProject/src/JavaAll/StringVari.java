package JavaAll;

public class StringVari {

	public static void main(String[] args) {
		
		String bookA=" Math Book";
		String bookB=" Math Book";
		String bookC="   Accounting book";
		
		
		//Variable print
		System.out.println(bookA); 
		
		
		
		//Memory address Print (Memory create based on value).
		System.out.println(System.identityHashCode(bookA));//Memory address of bookA variable :
		System.out.println(System.identityHashCode(bookB));//Memory address of bookB variable :
		
		
		//Memory address Equal or Not 
		System.out.println(bookA==bookB);
		
		
		
		//Value Equal or Not 
		System.out.println(bookA.equals(bookB)); // bookA=BookB ? True or False.
		System.out.println(bookA.equals(bookC)); // bookA=BookC ? True or False.
		
		
		//Find No of character of variable value
		System.out.println(bookA.length());
		
		
		//Concatenate
		System.out.println(bookA.concat(bookB));
		
		
		//Print without space while print
		System.out.println(bookC); //See the space 
		 System.out.println(bookC.trim());
		
		
		
		
				
	}

}
