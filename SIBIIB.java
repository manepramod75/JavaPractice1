package javaprograms;

public class  SIBIIB
{
	static 
	{
		System.out.println("SIB");
	}
	
	{
		System.out.println("IIB");
	}
	{
		System.out.println("IIB1");
	}	
	
	SIBIIB () // constructure
	
	{
		System.out.println("constructure");
	}
	
	static 
	{
		
		System.out.println("SIB1");
	}
	public static void main(String[] args) {
	
		System.out.println("Main method");
		new SIBIIB();
		new SIBIIB();
	}

}
