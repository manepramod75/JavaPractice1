package javaprograms;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetIntoList {

	public static void main(String[] args) {
		
		Set s1 = new HashSet();
	
		s1.add(12);
		s1.add(23);
		s1.add(05);
		s1.add(23);
		
		System.out.println("Setoutput "+s1);
		
		List l1 = new ArrayList(s1);
		System.out.println("set into list output "+l1);
		l1.add(23);
		System.out.println("adding duplicate in list "+l1);
		}

}
  