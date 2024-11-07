import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		   Scanner in = new Scanner(System.in);
		   System.out.println("Write a short message to mess with");
			 String input = in.nextLine();
			 String message = "";
			    for (int x=0; x < input.length();x++) {
			    	char letter = input.charAt(x);
			    	
			    	if(Character.isUpperCase(letter)) {
			    		letter =(char)(letter+4);
			    		if (letter > 'Z') {
			    			letter -=26;
			    		}
			       
			    	}
			    	else if (Character.isLowerCase(letter))
			    		letter= (char)(letter+3);
			    		if (letter >'z') {
			    			letter -=26;
			    		}
			    		
			    	else if (Character.isDigit(letter)) {
			    		letter= (char) (letter +1);
			    		if(letter<'0') {
			    			letter +=10;
			    		}
			    	}
			
			    	 	    	
			     message += letter;
			
			
			
			 in.close();
			 }
			    System.out.println( message );
	}
}
	
			    
			        
			       
			       
			      
			  
	
			  			       
