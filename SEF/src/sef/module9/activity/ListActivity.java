package sef.module9.activity;
//Needs to be completed

import java.util.*;
import java.util.List;

public class ListActivity {

	public static void main(String[] args) {
		//1 - Type code to create a list of names. Use ArrayList.
		List list = new ArrayList();
		
		list.add("Joe");
		list.add("Sam");
		list.add("Tom");
		
		//2 - Call print method to print the list passed as its parameter.
		ListActivity obj = new ListActivity();
		obj.print(list);
	}
	
	void print(List l)
	{
		Iterator i = l.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		//3 - Type code to print this list
		//Notice the order in which elements get printed.
	
	}
}
}