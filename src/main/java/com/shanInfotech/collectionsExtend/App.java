package com.shanInfotech.collectionsExtend;

import com.shanInfotech.collectionsExtendEx.Interview;
import com.shanInfotech.collectionsExtendEx.InterviewScheduler;

public class App {
	public static void main(String[]args) {
		
		
		InterviewScheduler scheduler= new InterviewScheduler();
		
		scheduler.scheduleInterview(new Interview(1,"Yashas",75,"10:00AM"));
		scheduler.scheduleInterview(new Interview(2,"Spandana",95,"10:30AM"));
		scheduler.scheduleInterview(new Interview(3,"Sanjan",90,"11:00AM"));
		
		scheduler.walkInCandidate(new Interview(4,"Dhanu",91,"Now"));
		
		System.out.println("\nFULL SCHEDULE");
		scheduler.displaySchedule();
		
		System.out.println("\nWALK-IN");
		scheduler.displayWalkIns();
		
		System.out.println("\nTOP PERFORMERS(Score > 70");
		scheduler.dispalyTopScores(70);
}
}