import java.util.Scanner;
public class Age{
   
        
         public static void main(String args[]) {
           
              try{
                 Scanner s = new Scanner(System.in);
                 System.out.println("Enter age :");
                  
                 int age = s.nextInt();
                 if(age < 0) {
                  throw new NegativeAgeException("Age can not be negative");
                }
                
              }catch(NegativeAgeException e){
    		    System.out.println(e) ;
    	    }
      }
    
}
class NegativeAgeException extends Exception{
     String str1;
   
    NegativeAgeException(String str2) {
	    str1=str2;
   }
   public String toString(){ 
	    return ("NegativeAgeException Occurred: "+str1) ;
   }
}
