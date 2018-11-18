package Person;

import java.util.ArrayList;

import Thing.Event;

public class Organization {
	private String name;
	protected ArrayList<Event> events = new ArrayList<Event>(300);
	protected ArrayList<User> blacklist = new ArrayList<User>(150);
	
	public Organization (){
		name = "null";
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public ArrayList<Event> getEvents() {
		return events;
	}
	public void createEvent(Event event) {
		if(this.name == "null") {
			System.out.println("Organization Incomplete, cannot add or manage events.");
			System.out.println("");
			return;
		}
		this.events.add(event);
	}

}
