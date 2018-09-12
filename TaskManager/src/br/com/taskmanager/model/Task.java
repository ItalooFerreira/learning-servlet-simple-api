package br.com.taskmanager.model;

import java.util.UUID;

public class Task {
	
	private String id;
	private String title; 
	private String resume; 
	private Boolean isPriority;
	private Boolean isDone;
	
	
	public Task() {
		super();
		this.id = UUID.randomUUID().toString();
	}
	
	public String getId() { 
		return id;
	}
	
	public void setId(String id) { 
		this.id = id;
	}
	
	public String getTitle() {
		return title; 
	}
	
	public void setTitle(String title) { 
		this.title = title;
	}
	
	public String getResume() {
		return resume; 
	}
	
	public void setResume(String resume) { 
		this.resume = resume;
	}

	public Boolean isPriority() {
		return isPriority;
	}

	public void setPriority(Boolean isPriority) {
		this.isPriority = isPriority;
	}

	public Boolean isDone() {
		return isDone;
	}

	public void setDone(Boolean isDone) {
		this.isDone = isDone;
	}
}
