package com.shanInfotech.collectionsExtend;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.shanInfotech.collectionsExtendEx.Interview;
import com.shanInfotech.collectionsExtendEx.InterviewScheduler;

public class AppTest {

InterviewScheduler scheduler= null;
@BeforeEach // its like a constructor which initializes before test methods getting loaded
	void setup() {
	scheduler= new InterviewScheduler();
	scheduler.scheduleInterview(new Interview(1,"Yashas",75,"10:00AM"));
	scheduler.scheduleInterview(new Interview(2,"Spandana",95,"10:30AM"));
	scheduler.scheduleInterview(new Interview(3,"Sanjan",90,"11:00AM"));
	
	scheduler.walkInCandidate(new Interview(4,"Dhanu",91,"Now"));
}
	@Test
	void testSchedulerCoreFlow() {
	assertEquals("Yashas",scheduler.scheduleQueue.peek().getCandidateName());
	assertEquals("Dhanu",scheduler.walkInDeque.peek().getCandidateName());
	assertEquals("Spandana",scheduler.topPerformersQueue.peek().getCandidateName());
}
	@Test
	void testTopScorersAbove70() {
		List<String> expectedNames=Arrays.asList("Dhanu","Sanjan","Spandana","Yashas");
		List<String> topScorers=scheduler.topPerformersQueue.stream().filter(i->i.getScore()>70).map(Interview::getCandidateName).sorted().toList();
		
		assertEquals(expectedNames,topScorers);
	}
	
	@AfterEach
	public void tearDown() {
		scheduler=null;
	}
}