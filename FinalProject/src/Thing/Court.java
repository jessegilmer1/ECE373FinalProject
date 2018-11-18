package Thing;
import java.util.ArrayList;

import Person.ConvictUser;

public class Court {
	private ArrayList <Records> criminalRecords = new ArrayList<Records>(300);
	private ArrayList<ConvictUser> convicts = new ArrayList<ConvictUser>(300);
	
	public Court() {};
	
	public ArrayList<Records> getRecords() {
		return criminalRecords;
	}
	public void addRecord(Records r1) {
		criminalRecords.add(r1);
	}
	public Records retrieveRecord(String name) {
		
		for(int i = 0; i < criminalRecords.size(); i++) {
			if(criminalRecords.get(i).getName() == name) {
				return criminalRecords.get(i);
			}
		}
		System.out.println("Record for " + name + " not found in Court Records.");
		return null;
	}
	public void displayPOInfo(ConvictUser c1) {
		System.out.println("Probation Officer Name: " + c1.getPo().getName());
		System.out.println("Probation Officer Phone: " + c1.getPo().getPhoneNumber());
		System.out.println("");
	}

	public ArrayList<ConvictUser> getConvicts() {
		return convicts;
	}

	public void addConvicts(ConvictUser convicts) {
		this.convicts.add(convicts);
	}
}