package com.tasks;

public class BugTracker {
	// Instance variables
	int bugId;
	String applicationName;
	String bugTitle;
	String severity;
	String priority;
	String status;
	String assignedDeveloper;

	// Getter methods
	int getBugId() {
		return bugId;
	}

	String getApplicationName() {
		return applicationName;
	}

	String getBugTitle() {
		return bugTitle;
	}

	String getSeverity() {
		return severity;
	}

	String getPriority() {
		return priority;
	}

	String getStatus() {
		return status;
	}

	String getAssignedDeveloper() {
		return assignedDeveloper;
	}

	// Assign developer to the bug
	void assignToDeveloper(int bugId, String developerName) {
		if (this.bugId == bugId) {
			assignedDeveloper = developerName;
			// Calling updateStatus()
			updateStatus("In Development");
		}
	}

	// Update bug status
	void updateStatus(String newStatus) {
		status = newStatus;
	}

	// Display complete bug details
	void displayBugSummary() {
		System.out.println("Bug ID: " + getBugId());
		System.out.println("Application Name: " + getApplicationName());
		System.out.println("Bug Title: " + getBugTitle());
		System.out.println("Severity: " + getSeverity());
		System.out.println("Priority: " + getPriority());
		System.out.println("Status: " + getStatus());
		System.out.println("Assigned Developer: " + getAssignedDeveloper());
	}

	public static void main(String[] args) {
		// Creating first object
		BugTracker b1 = new BugTracker();
		// Assigning values using object reference
		b1.bugId = 101;
		b1.applicationName = "Banking Application";
		b1.bugTitle = "Login button not working";
		b1.severity = "High";
		b1.priority = "High";
		b1.status = "Open";
		b1.assignedDeveloper = "Not Assigned";
		// Display bug details
		b1.displayBugSummary();
		System.out.println("-------------------------");
		// Assign developer
		b1.assignToDeveloper(101, "Rahul");
		// Display updated details
		b1.displayBugSummary();
	}
}