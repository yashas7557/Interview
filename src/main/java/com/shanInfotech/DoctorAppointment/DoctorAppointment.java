package com.shanInfotech.DoctorAppointment;

public class DoctorAppointment {
	private String patientName;
	private int appointId;
	private String condition;
	private int conditionPriority;
	
	public DoctorAppointment() {
		
	}

	public DoctorAppointment(String patientName, int appointId, String condition, int conditionpriority) {
		super();
		this.patientName = patientName;
		this.appointId = appointId;
		this.condition = condition;
		this.conditionPriority = conditionpriority;
	}

	public String getPatientName() {
		return patientName;
	}

	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	public int getAppointId() {
		return appointId;
	}

	public void setAppointId(int appointId) {
		this.appointId = appointId;
	}

	public String getCondition() {
		return condition;
	}

	public void setCondition(String condition) {
		this.condition = condition;
	}

	public int getConditionPriority() {
		return conditionPriority;
	}

	public void setConditionPriority(int conditionPriority) {
		this.conditionPriority = conditionPriority;
	}

	@Override
	public String toString() {
		return "DoctorAppointment [patientName=" + patientName + ", appointId=" + appointId + ", condition=" + condition
				+ ", conditionPriority=" + conditionPriority + "]";
	}

}