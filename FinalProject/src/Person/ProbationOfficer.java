package Person;

import java.util.ArrayList;
import java.util.Collections;



public class ProbationOfficer extends User {
	
	private ArrayList<ConvictUser> convicts = new ArrayList<ConvictUser>(300); 
	private String phoneNumber;
	
	public ProbationOfficer() {
		this.setName("No Name");
	}
	
	public String getPhoneNumber(){
		return phoneNumber;
	}
	public void setPhoneNumber(String p){
		phoneNumber = p;
	}
	public void addConvict(ConvictUser c1) {
		convicts.add(c1);
		c1.setPo(this);
	}
	public void removeConvict(ConvictUser c1) {
		convicts.remove(c1);
	}
}

