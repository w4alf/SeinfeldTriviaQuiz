import java.util.Scanner;

public class Console {
    
    private static Scanner sc = new Scanner(System.in);

    public static String getString(String prompt) {
        
    	String s =null;
        boolean isValid = false;
        
        
        while (!isValid) {
        	 
        	System.out.print(prompt);
        	 s = sc.nextLine();
        	 if (s.isEmpty() || s==null) {
        		 System.out.println("Error! You must input something. Try again.");
        	 }
        	 else {
        		  
        		 isValid = true;
        	 }
        }
        return s;
       
     }


    public static String getSelection(String prompt) {

        String s =null;
        boolean isValid = false;


        while (!isValid) {

            System.out.print(prompt);
            s = sc.nextLine();
            if (s.isEmpty() || s==null) {
                System.out.println("Error! You must input something. Try again.");
            }
            else {

                if (s.equalsIgnoreCase("A")||s.equalsIgnoreCase("B")||s.equalsIgnoreCase("C")) {

                    isValid = true;
                }
                else {
                    System.out.println("Error! Please input A, B or C.");
                }

            }
        }
        return s;

    }




    public static String getEmail(String prompt) {
        
    	String s =null;
        boolean isValid = false;
        
        while (!isValid) {
        	 
        	System.out.print(prompt);
        	 s = sc.nextLine();
        	 if (s!=null && s.contentEquals("") ) {
        		 
        		 System.out.println("Error. You must input something. Try again.");
        	 
        	 } else if (!s.contains("@")) {
        		 
        		 System.out.println("Error. there is no @ in your email. Try again.");
        		 
        	 } else if (s.endsWith("@")) {
        		 
        		 System.out.println("Error. your email ends with @, email suffix is missing. Try again.");
        		 
        	 } else if (!s.contains(".")) {
        		 
        		 System.out.println("Error. there is a period \".\" missing from your email. Try again.");
        		 
        	 } else if (s.endsWith(".")) {
        		 
        		 System.out.println("Error. Your email cannot end with a period  \".\". Try again.");
        		 
        	 }
        	 
        	 
        	 else {
        		  
        		 isValid = true;
        	 }
        }
        return s;
       
     }
    
    
    
    public static String getYesOrNo(String prompt) {
        
    	String s =null;
        boolean isValid = false;
        while (!isValid) {
        	 
        	System.out.print(prompt);
        	 s = sc.nextLine();
        	 if (s.equalsIgnoreCase("y") || s.equalsIgnoreCase("n") ) {
        		 isValid = true; 
        	 }
        	 else {
        		 System.out.println("Error! You must input y or n. Try again."); 
        		 
        	 }
        }
        return s;
       
     }
    
    

    public static int getInt(String prompt) {

         String s = null;
     	 int i = 0;
         boolean isValid = false;

         while (!isValid) {
             System.out.print(prompt);
             if (sc.hasNextInt()) {
                 i = sc.nextInt();

                 if (String.valueOf(i).contentEquals("")||String.valueOf(i).isBlank()) {
                 	System.out.println("Error! Invalid entry. Try again.");
                 }else {
                 	isValid = true;
                 	
                 	
                 }
                 

             } else {
                 System.out.println("Error! Invalid integer. Try again.");
             }
             sc.nextLine();  // discard any other data entered on the line
         }
         return i;

        
    }




    public static int getInt(String prompt, int min, int max) {
        int i=0;
        boolean isValid = false;
        while (!isValid) {


            i = getInt(prompt);
            if (i >= min && i <= max){

                isValid = true;

            } else{
                System.out.println("Error! Please select only a value of between " + min + " and " + max + " ." );
            }



        }
        return i;
    }

    public static double getDouble(String prompt) {
        double d = 0;
        boolean isValid = false;
        while (!isValid) {
            System.out.print(prompt);
            if (sc.hasNextDouble()) {
                d = sc.nextDouble();
                isValid = true;
            } else {
                System.out.println("Error! Invalid number. Try again.");
            }
            sc.nextLine();  // discard any other data entered on the line
        }
        return d;
    }

    public static double getDouble(String prompt, double min, double max) {
        double d = 0;
        boolean isValid = false;
        while (!isValid) {
            d = getDouble(prompt);
            if (d <= min) {
                System.out.println(
                        "Error! Number must be greater than " + min + ".");
            } else if (d >= max) {
                System.out.println(
                        "Error! Number must be less than " + max + ".");
            } else {
                isValid = true;
            }
        }
        return d;
    }
}