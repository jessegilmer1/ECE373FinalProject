package Thing;
import java.util.ArrayList;

public class Records {
	private String name;
	private ArrayList <Offense> offenses = new ArrayList<Offense>(300); 
	private String workAllowed;
	
	public Records(){};
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getWorkAllowed() {
		return workAllowed;
	}
	public void setWorkNotAllowed(String workAllowed) {
		this.workAllowed = workAllowed;
	}
	public ArrayList<Offense> getOffenses(){
		return offenses;
	}
	public void addOffense(Offense o) {
		offenses.add(o);
	}
	public void printOffenses() {
		System.out.println("Printing List of offenses for Convict: " + this.name);
		for(int i = 0; i < offenses.size(); i++) {
			System.out.println("Crime: " + offenses.get(i).getNatureOfCrime());
			System.out.println("Date of Crime: " + offenses.get(i).getDate());
			System.out.println("Arresting Officer: " + offenses.get(i).getArrestingOfficer());
			System.out.println("Police Report: " + offenses.get(i).getPoliceReport());
			System.out.println("Date of Conviction: " + offenses.get(i).getDateOfConviction());
			System.out.println("Community Hours Required: " + offenses.get(i).getCommunityHoursRequired());
			System.out.println("");
		}
	}
	
	
}