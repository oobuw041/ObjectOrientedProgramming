abstract class Employee extends Person{
//instance variables
	private String deparment;
	private String jobTitle;
	private int yearHire;
	
	public Employee(String name, int age, String gender,String address,String telephoneNo,int socialNumber,String deparment, String jobTitle, int yearHire){
	super(name,age,gender, address,telephoneNo,socialNumber);
	this.deparment = deparment;
	this.jobTitle  = jobTitle;
	this.yearHire  = yearHire;
	}
	
	public abstract int salary ();
	public abstract int vacation ();
	public abstract int healthCare ();
	
	public static void main(String[]args){
	Professional  prof  =  new Professional ("Jane Doe",25, "Female","134 Landsone St","343-777-0865",233456,"Finance","Manager",2022,1500000);
	Nonprofessional nonprof = new Nonprofessional("Alice",28,"Female","78 Maine St","343 777 0865",2837967,"Finance","Assistant",2019, 40, 5);
	System.out.println(prof.salary());
	System.out.println(prof.vacation());
	System.out.println(prof.healthCare());
	System.out.println(nonprof.salary());
	System.out.println(nonprof.vacation());
	System.out.println(nonprof.healthCare());
}
	
	
	
//Getters and Setters
public String getDeparment(){return deparment;}
public String getJobTitle(){return jobTitle;}	
public int getYearHire(){return yearHire;}
				
public String toString(){
return super.toString()+ ","+deparment+","+jobTitle+","+yearHire;
  }
}






