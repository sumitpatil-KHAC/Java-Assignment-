/*
17. Scope Demonstration Program 
Create a program: 
Requirements: 
 Declare variable inside: 
 Method 
 Loop 
 Block 
 Try accessing outside scope (show error via comments) 
 Print valid usages
*/
class Scope{
	{
		int d = 30;
		System.out.println("d : "+d);
	}
	// System.out.println("d : "+d); // error: illegal start of type
	static{
		int e = 40;
		System.out.println("e : "+e);
	}
	// System.out.println("e : "+e);  //error: illegal start of type
	void m1(){
		int a = 10;
		System.out.println("a : "+a );
		{
			int x = 50;
			System.out.println("x : "+x);
		}
		//System.out.println("x : "+x);           // error: cannot find symbol
	}
    //System.out.println("a : "+a );           // error: illegal start of type
  
}
public class ScopeDemonstration{
	
	public static void main(String[] args){
		Scope s = new Scope();
		s.m1();
		int b;
		for(int i = 0 ; i < 10 ; i++){
			int c = i;
			System.out.print(i+" ");
		}
		//System.out.println("c : "+c);           // error: cannot find symbol
		//System.out.println("i : "+i);           // error: cannot find symbol
	}
}
