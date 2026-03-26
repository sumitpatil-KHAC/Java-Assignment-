

class Assignment31_32_33_Error{
	public static void main(String[] args){
		// 31. Fix the error: 
        // int x ; 
        // System.out.println(x);  // CTE : variable x might not have been initialized
	    int x = 10; 
        System.out.println(x);
		
		/*
		32. Fix: 
            if(x = 10){       // CTE: incompatible types: int cannot be converted to boolean
                 System.out.println("Hello"); 
            }
        */
		if(x == 10){ 
            System.out.println("Hello"); 
        }
	
	    /* 
        33. Fix infinite loop: 
            while(i < 10){ 
                 System.out.println(i); 
            }
        */
		int i = 1;
		while(i <= 10){ 
            System.out.println(i); 
		    i++;
        }
	
	
	
	}
}

