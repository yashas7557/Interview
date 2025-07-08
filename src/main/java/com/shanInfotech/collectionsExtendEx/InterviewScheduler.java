package com.shanInfotech.collectionsExtendEx;

import java.util.ArrayDeque;
import java.util.Comparator;
import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class InterviewScheduler {
	public Queue<Interview> scheduleQueue =new LinkedList<>();
	public Deque<Interview> walkInDeque= new ArrayDeque<>();
	public PriorityQueue<Interview> topPerformersQueue=new PriorityQueue<>((a,b) -> Integer.compare(b.getScore(),a.getScore()));
	
	public void scheduleInterview(Interview i) {
		scheduleQueue.offer(i);
		topPerformersQueue.offer(i);
		
		}
	
	public void walkInCandidate(Interview i) {
		walkInDeque.offer(i);
		topPerformersQueue.offer(i);
	}
	
	public void displaySchedule() {
		System.out.println("Scheduled Interviews(FIFO):");
		scheduleQueue.forEach(System.out::println);
	}
	
	public void displayWalkIns() {
		System.out.println("Walk in Candidates(Deque):");
		walkInDeque.forEach(System.out::println);
	}

	
	public void dispalyTopScores(int threshold) {
		System.out.println("Shortlisted Candidates(Score > "+threshold+"):");
		topPerformersQueue.stream().filter(i -> i.getScore() > threshold).sorted(Comparator.comparing(Interview::getCandidateName)).forEach(System.out::println);
	}
}
