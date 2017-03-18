import java.util.Scanner;


public class EmployeeMain {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Initializing employee class
		Employee emp=new Employee();
		// scanner object to read input
        Scanner sc=new Scanner(System.in);
        // asking user first name
		System.out.println("First Name :");
		// input of First Name passing to name variable
		String name=sc.next();
		// passing the name variable through set method of employee class to its First name variable
		emp.setFirstName(name);
		// print statement asking for user input
		System.out.println("Last Name :");   
		// input of last name passing to sur_name variable 
		String sur_name=sc.next();
		//passing the sur_name variable through set method of employee class to its Last name variable 
		emp.setLastName(sur_name);
		// print statement asking for user input
		System.out.println("Employee id :");
		// input of employee id passing to id variable variable
		int id=sc.nextInt();
		//passing the id value through set method of employee class to  its employee id variable
		emp.setId(id);	
		// print statement asking for user input
		System.out.println("Job Title :");
		// input of job title passing to job variable 
		String job=sc.next();
		//passing the job title value through set method of employee class to its job_Title variable
		emp.setJob_Title(job);
		// print statement asking for user input
		System.out.println("Basic Salary :");
		// input of basic salary passing to salary variable 
		double salary=sc.nextDouble();
		//passing the salary value through set method of employee class to its BasicSalary variable
		emp.setBasicSalary(salary);
		// print statement asking for user input
		System.out.println("Phone No :");   
		// input of phone no passing to contact variable
		int contact =sc.nextInt();
		//passing the contact value to set method of employee class to its Phone variable
		emp.setPhone(contact);
		// print statement asking for user input
		System.out.println("Email Id :");   
		// input of email id passing to email variable 
		String email =sc.next();
		//passing the emailId value to set method of employee class to its Email variable
		emp.setEmailid(email);
		
		System.out.println(" ");
	
		// displaying output through get methods of employee class
		System.out.println("Employee Details are :");
		// displays first name 
		System.out.println("First Name:"+emp.getFirstName());
        // displays last name
		System.out.println("Last name: "+ emp.getLastName());
		// displays employee id
		System.out.println("Employee ID: "+emp.getId());
		// displays job title
		System.out.println(" Job title:"+emp.getJob_Title());
		// display phone no
		System.out.println("Contact no:"+emp.getPhone());
		//displays basic salary
		System.out.println(" Salray:"+emp.getBasicSalary());
		// displays email
		System.out.println("Email :"+emp.getEmailid()); 
	}

}
