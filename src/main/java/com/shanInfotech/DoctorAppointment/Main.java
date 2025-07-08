package com.shanInfotech.DoctorAppointment;


public class Main {
	public static void main(String[]args) {
		
		
		AppointmentScheduler scheduler= new AppointmentScheduler();
		
		scheduler.scheduleAppointment(new DoctorAppointment("Yashas",100,"Emergency Surgery",1));
		scheduler.scheduleAppointment(new DoctorAppointment("Sagar",101,"Moderate",2));
		scheduler.scheduleAppointment(new DoctorAppointment("Nithish",102,"Just Consultency",3));
		scheduler.scheduleAppointment(new DoctorAppointment("Spandana",103,"Emergency",1));
		
		
		scheduler.walkInPatient(new DoctorAppointment("Dhanu",99,"Critical",1));
		
		
		System.out.println("Scheduled Appointments(FIFO):");
		scheduler.displaySchedule();
		
		System.out.println("\nWALK-IN");
		scheduler.displayWalkIns();
		
		
		System.out.println("\n Priority Conditions only Emergency");
		scheduler.dispalybasedonConditions(1);
		
		
		
}
}