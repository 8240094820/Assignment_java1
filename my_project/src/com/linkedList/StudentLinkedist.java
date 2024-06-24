package com.linkedList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Scanner;

public class StudentLinkedist {

	public static void main(String[] args) {
		 LinkedList<String> li= new LinkedList<String>();
		 li.add("Sandip");
	     li.add("Rahul");
	     li.add("bittu");
	     li.add("subha");
	     li.add("punno");
	     li.add("arpan");
	     System.out.println("Present the list of names is...");
	     Iterator<String> itr=li.iterator();  
	       while(itr.hasNext()){  
	        System.out.println(itr.next());
	       }
	       System.out.println("After delete first node---");
	       li.remove(0);
	      Iterator<String> itr1=li.iterator();  
		   while(itr1.hasNext()){  
		    System.out.println(itr1.next());
		    
		   
	}
		   System.out.println("After delete last node---");
		     li.remove(4);
		      Iterator<String> itr2=li.iterator();  
			   while(itr2.hasNext()){  
			    System.out.println(itr2.next());
			   }
			   System.out.println("Delete any position");
		       System.out.println("1. Delete name for beginning.");
			      System.out.println("2. Delete name for end.");
			      System.out.println("What's your choice...");
			      Scanner c= new Scanner(System.in);
			      int num=c.nextInt();
			      if (num==1) {
				       
				       li.remove(0);
				       System.out.println("After Delete of name at the beginning--");
				       Iterator<String> it1=li.iterator();  
				       while(it1.hasNext()){  
				        System.out.println(it1.next()); 
			    	  
				       }
}
			      else {
			    	  
				       li.remove(3);
				       System.out.println("Delete name at the End--");
				       Iterator<String> i1= li.iterator();
				       while(i1.hasNext()) {
				    	   System.out.println(i1.next());
			      }
}
}
}

