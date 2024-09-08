package ust.com.assignment1;

import java.time.LocalDate;

public class Task {
	private String description;
	private String duedate;
	
	
	public Task(String description, String duedate) {
		
		this.description = description;
		this.duedate = duedate;
	}



	@Override
	public String toString() {
		return " [description=" + description + ", duedate=" + duedate + "]";
	}


	
}
