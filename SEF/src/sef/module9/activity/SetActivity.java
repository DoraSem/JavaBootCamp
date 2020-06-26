package sef.module9.activity;

import java.util.HashSet;
import java.util.Iterator;
//Needs to be completed
import java.util.Set;


public class SetActivity {

	public static void main(String[] args) {
		//1 - Type code to create a set of names.
		Set names = new HashSet<>();
		//Names must be sorted by their natural order.
		names.add("bob");
		names.add("anny");
		names.add("charly");
		names.add("bob");
		
		//Do research to find if you already have such a class. 
		//Also try adding a few duplicate entries to this set.
		
		
		
		//2 - Call print method to print the set passed as its parameter.
		print(names);
		
		//3 - Type code to print this set
	}
	
	static void print(Set name){
		Iterator i = name.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	}
	{
		
		//Notice the order in which elements get printed.
	}
}
