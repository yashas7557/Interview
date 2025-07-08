package com.shanInfotech.DoctorAppointment;

import java.util.ArrayDeque;
import java.util.Comparator;
import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;


public class AppointmentScheduler {
	private Queue<DoctorAppointment> scheduleQueue =new LinkedList<>();
	private Deque<DoctorAppointment> walkInDeque= new ArrayDeque<>();
	private PriorityQueue<DoctorAppointment> conditionsQueue=new PriorityQueue<>((a,b)-> Integer.compare(b.getAppointId(), a.getAppointId()));
	
	public void scheduleAppointment(DoctorAppointment d) {
		scheduleQueue.offer(d);
		conditionsQueue.offer(d);
		
		}
	
	public void walkInPatient(DoctorAppointment d) {
		walkInDeque.offer(d);
		conditionsQueue.offer(d);
	}
	
	
	public void displaySchedule() {
		System.out.println("Scheduled Appointments(FIFO):");
		scheduleQueue.forEach(System.out::println);
	}
	
	public void displayWalkIns() {
		System.out.println("Walk in Patient(Deque):");
		walkInDeque.forEach(System.out::println);
	}

	public void dispalybasedonConditions(int Emergency) {
		//System.out.println("Patients Condition(PriorityBasis = "+Emergency+"):");
		conditionsQueue.stream().filter(d -> d.getConditionPriority() == 1).sorted(Comparator.comparing(DoctorAppointment::getPatientName)).forEach(System.out::println);
	
		
	}
}
