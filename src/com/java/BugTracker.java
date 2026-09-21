package com.java;

public class BugTracker {
	int bugid;
	String aname;
	String title;
	String severity;
	String priority;
	String developername;
	String status;
	String assignDeveloper;
	String display;
	String assignToDeveloper;

	public static void main(String[] args) {
		BugTracker b = new BugTracker();
		b.bugid = 101;
		b.aname = "Banking";
		b.title = "Login Issue";
		b.severity = "High";
		b.priority = "High";
		b.assignDeveloper = "Samatha";
		b.status = "Open";
		b.assignDeveloper = "Not Assigned";
		b.assignToDeveloper(101, "samatha");
		b.displayBugSummary();
	}

	void displayBugSummary() {
		System.out.println("Bug Id:" + bugid);
		System.out.println("Applicant Name:" + aname);
		System.out.println("Bug Title:" + title);
		System.out.println("Severity:" + severity);
		System.out.println("Priority:" + priority);
		System.out.println("Assigned Developer:" + assignDeveloper);
		System.out.println("Status:" + status);
	}

	int getBugid() {
		return bugid;
	}

	String getApplicationName() {
		return aname;

	}

	String getBugTitle() {
		return title;
	}

	String getSeverity() {
		return severity;
	}

	String getPrority() {
		return priority;
	}

	String getAssignedDeveloper() {
		return developername;
	}

	String updateStatus() {
		return status;
	}

	void updateStatus(String newstatus) {
		status = newstatus;
	}

	void assignToDeveloper(int bugid, String developerName) {
		assignDeveloper = developerName;
		updateStatus("In Development");
	}

}
