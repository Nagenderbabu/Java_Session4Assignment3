
public class Employee {

	
	//declaring private variables 
	private String firstName;
	private String lastName;
	private int id;
	private String job_Title;
	private double basicSalary;
	private int phone;
	private String emailid;

	// declaring Constructor
	Employee(){
		
	}
	
	//getters and setter methods for each private variables
	
	// get method first name
	public String getFirstName() {
		return firstName;
	}
	// set method for first name
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	// get method last name
	public String getLastName() {
		return lastName;
	}
	// set method for last name
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	//get method for id
	public int getId() {
		return id;
	}
	// set method for employee id
	public void setId(int id) {
		this.id = id;
	}
	// get method for job title
	public String getJob_Title() {
		return job_Title;
	}
	// set method for job title
	public void setJob_Title(String job_Title) {
		this.job_Title = job_Title;
	}
	//get method for basic salary 
	public double getBasicSalary() {
		return basicSalary;
	}
	//set method for Basic salary
	public void setBasicSalary(double basicSalary) {
		this.basicSalary = basicSalary;
	}
	// get method for Phone
	public int getPhone() {
		return phone;
	}
	// S
	public void setPhone(int phone) {
		this.phone = phone;
	}
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}

	
	
	
}
