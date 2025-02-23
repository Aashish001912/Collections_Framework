package com.aashish.Traval_Itinerary_Planner;

public class Activity
{
  private String name;
  private String Schedule;
  public Activity(String name, String schedule) {
	super();
	this.name = name;
	Schedule = schedule;
  }
  public String getName() {
	return name;
  }
  public void setName(String name) {
	this.name = name;
  }
  public String getSchedule() {
	return Schedule;
  }
  public void setSchedule(String schedule) {
	Schedule = schedule;
  }
  @Override
  public String toString() {
	return "Activity [name=" + name + ", Schedule=" + Schedule + "]";
  }
  
  
}
