package Core_program;

public class Swapnumber {
	public static void main(String[] args) {
int first=11;
int second=14;

System.out.println("--Before Swap");
	System.out.println("First number="+first);
	System.out.println("Second number="+second);
	
	first=first-second;
	second=first+second;
	first=second-first;
	
	System.out.println("--After swap--");
	System.out.println("First number="+first);
	System.out.println("Second number="+second);
	
	}
	}
