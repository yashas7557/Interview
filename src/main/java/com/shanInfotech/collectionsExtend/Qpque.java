package com.shanInfotech.collectionsExtend;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Qpque {
	
	private static void arrayDequeMethod() {
		
		ArrayDeque<String> eventQue=new ArrayDeque<String>();
		eventQue.add("Yashas");
		eventQue.add("Sagar");
		eventQue.add("Spandana");
		eventQue.add("Dhanu");
		eventQue.add("Yamaha");
		eventQue.add("Rx");
		System.out.println("Queue:"+eventQue);
		System.out.println("ArrayyDeque Removed from 1st Uses LiFo:" +eventQue.removeLast());
		
		System.out.println("\nOfferring New First Value for the Que:"+eventQue.offerFirst("Lama"));
		
		System.out.println(eventQue);
		System.out.println("\nGets the peek Element from Last:"+eventQue.peek());
		
		System.out.println("\nRetrievea and removes the element:"+eventQue.pollFirst());
		
		System.out.println(eventQue);
	}
		
		private static void queMethod() {
		
			Queue<String> eventQue=new LinkedList<String>();
			
			eventQue.add("Yashas");
			eventQue.add("Sagar");
			eventQue.add("Spandana");
			eventQue.add("Dhanu");
			eventQue.add("Yamaha");
			eventQue.add("Rx");
			System.out.println("Queue:"+eventQue);
			
			System.out.println("Removed from 1st Uses LiFo:" +eventQue.remove());
			
			System.out.println("\nOfferring New Value for the Que:"+eventQue.offer("Lama"));
			
			
			System.out.println(eventQue);
			System.out.println("\nGets the peek Element from Last:"+eventQue.peek());
			
			
			System.out.println("\nRetrievea and removes the element:"+eventQue.poll());
			System.out.println(""+eventQue.element());
			System.out.println(eventQue);
	}
		
		private static void priorityqueMethod() {
			
			PriorityQueue<String> eventQue=new PriorityQueue<String>();
			
			eventQue.add("Yashas");
			eventQue.add("Sagar");
			eventQue.add("Spandana");
			eventQue.add("Dhanu");
			eventQue.add("Yamaha");
			eventQue.add("Rx");
			System.out.println("PriorityQueue:"+eventQue);
			
			System.out.println("Removed from 1st Uses fiFo :" +eventQue.remove());
			
			System.out.println("\nOfferring New Value for the Que:"+eventQue.offer("Lama"));
			
			
			System.out.println(eventQue);
			System.out.println("\nGets the peek Element from Last:"+eventQue.peek());
			
			
			System.out.println("\nRetrieves and removes the element:"+eventQue.poll());
			System.out.println(""+eventQue.element());
			System.out.println(eventQue);
	}
		
  public static void  main(String[]args) {
	// queMethod();
	//  arrayDequeMethod();
	  priorityqueMethod();
	  
  }
} 
