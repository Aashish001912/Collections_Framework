package com.aashish.Traval_Itinerary_Planner;

import java.util.List;

public class Destination 
{
  private String name;
  private List<Activity> activities;
  public Destination(String name, List<Activity> activities) 
  {
	super();
	this.name = name;
	this.activities = activities;
  }
  
  public void addActivity(Activity activity)
  {
	  activities.add(activity);
  }
  public List<Activity> getActivities() {
      return activities;
  }

@Override
public String toString() {
	return "Destination [name=" + name + ", activities=" + activities + "]";
}
    
  
    
}
