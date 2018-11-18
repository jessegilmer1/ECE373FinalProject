package Thing;
public class Offense {
	
	private String natureOfCrime;
	private String arrestingOfficer;
	private String date;
	private String policeReport;
	private String dateOfConviction;
	private int communityHoursRequired;
	
	public Offense(){}
	
	public String getNatureOfCrime() {
		return natureOfCrime;
	}
	public void setNatureOfCrime(String natureOfCrime) {
		this.natureOfCrime = natureOfCrime;
	}
	public String getArrestingOfficer() {
		return arrestingOfficer;
	}
	public void setArrestingOfficer(String arrestingOfficer) {
		this.arrestingOfficer = arrestingOfficer;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getPoliceReport() {
		return policeReport;
	}
	public void setPoliceReport(String policeReport) {
		this.policeReport = policeReport;
	}
	public String getDateOfConviction() {
		return dateOfConviction;
	}
	public void setDateOfConviction(String dateOfConviction) {
		this.dateOfConviction = dateOfConviction;
	}
	public int getCommunityHoursRequired() {
		return communityHoursRequired;
	}
	public void setCommunityHoursRequired(int commuityHoursRequired) {
		this.communityHoursRequired = commuityHoursRequired;
	}
	
}