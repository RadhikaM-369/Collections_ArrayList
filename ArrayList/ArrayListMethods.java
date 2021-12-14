package com.xworkz.Collections.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayListMethods {

	public static void main(String[] args) {
	List arrayList=new ArrayList();
	
	boolean empty=arrayList.isEmpty();
	System.out.println("Before adding element-ArrayList is empty...? "+ empty);
	
	arrayList.add("Xworkz");
	arrayList.add(11);
	arrayList.add(true);
	arrayList.add(22.11);
	arrayList.add('B');
		
	//int size=arrayList.size();
	//arrayList.size();
	System.out.println("\n Size of arrayList : "+arrayList.size());
	
	System.out.println(" After adding element- ArrayList is empty...? "+ arrayList.isEmpty());
	
	System.out.println(" The object present in index is : "+arrayList.get(2));
	
	System.out.println(" The index of B is: "+arrayList.indexOf('B'));
	
	System.out.println(" The given element is present in array: "+arrayList.contains(22.11));
	
	System.out.println(" Object removed is : "+arrayList.remove(3));
	System.out.println("After removing object-Size of arrayList : "+arrayList.size());
	
	System.out.println("Object removed is : "+arrayList.remove(true));
	System.out.println("After removing object-Size of arrayList : "+arrayList.size());
	}

}
