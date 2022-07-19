package simplilearn.arthmeticcalculator;

import java.util.ArrayList;


public class EmailValidation {
	
public static void main(String[] args) {
        
        ArrayList<String> emailID = new ArrayList<String>();
        
        emailID.add("ram.izsvf@sll.com");
        emailID.add("vaalam.klein@sll.com");
        emailID.add("hansik.hoch@sll.com");
        emailID.add("kalyan.senthil@sll.com");
        emailID.add("harik.pogadad@sll.com");
        emailID.add("laura.kramm@sll.com");
        emailID.add("shrini.sridhar@sll.com");
        
   
        String searcElement = "kalyan.senthil@sll.com";
        
                for(int i=0; i<emailID.size(); i++) {
                    
                    //System.out.println(emailID.get(i));
                    
                    if(searcElement==emailID.get(i)) {
                        
                        System.out.println("\n");
                        
                        System.out.println("email ID - " + searcElement + " is found");
                        
                        break;
                        
                    }
                    
                }

    }
	

}
