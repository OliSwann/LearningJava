package randomGenerator;
import java.util.Vector;
import java.util.Scanner;
public class ListGetter {
	
	 
	 
	    public static void main(String[] args) {
	        
	        Vector<String> vWords = new Vector<String>();
	        Vector<String> Dashes = new Vector<String>();
	        Vector<String> Guess = new Vector<String>();
	        Scanner Obj = new Scanner(System.in);

	        vWords.add("Hello");
	        vWords.add("apple");
	        vWords.add("nismo");
	        vWords.add("older");
	        
	      
	        int number = (int) (Math.random() * vWords.size());
	            
	            //get the element at random index
	        String answer = ( vWords.get(number) );
	        for (int i = 0; i <= (answer.length())-1; i = i + 1) {
	        	Dashes.add("-");
	        }
	        for (int i = 0; i <= (answer.length())-1; i = i + 1) {
	        	System.out.print(Dashes);
	        	System.out.print("Enter text: ");
	        	String myString = Obj.nextLine();
	        	System.out.println(answer.contains(myString));
	        	if (answer.contains(myString)) {
	        		Dashes.add(myString);
	        	}
	        			
	        	}
	        }
	    
}
	        
	    
	

