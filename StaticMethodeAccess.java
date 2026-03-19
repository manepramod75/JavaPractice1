
// Access Static method access inside the static method

package javaprograms;

public class StaticMethodeAccess {

	static void sub () {
		
		System.out.println("Sub");
	
}
	public static void main(String[] args) {
		
		System.out.println("Main Mathod");
		add();add();
		sub();
	}
		static void add () {
			
			System.out.println("add");
			Multi();
			
	}
static void Multi () {
			
			System.out.println("Maulti");
}
}