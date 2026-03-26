// 23. Write a program to find sum of even and odd numbers 
// separately (1 to N). 
class Assignment23{
	public static void main(String[] args){
		int esum = 0;
		int osum = 0;
		for(int i= 0 ; i <= 10 ; i++){
			if(i%2==0)
				esum = esum + i ;
			else 
				osum = osum + i;
		}
		System.out.println("Even Sum "+esum);
		System.out.println("Odd Sum "+osum);
	}
}
