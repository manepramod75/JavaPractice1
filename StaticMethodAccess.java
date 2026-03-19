package javaprograms;

public class StaticMethodAccess {
	
	void sub () {
		
		System.out.println("Aut Learning");
	}

	public static void main(String[] args) {
	
		System.out.println("java learning");
		
		StaticMethodAccess s1= new StaticMethodAccess();
		s1. sub();
		LogicalOperators.main(args);
		NestedIfElase.main(args);

	}

}
