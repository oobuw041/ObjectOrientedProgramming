abstract class Hourly extends Employee{
//instance variables
	protected int hourlyRate;
	protected int  hoursWorked;
	protected int  unionDues;
	
	
	public Hourly(String name, int age, String gender,String address,String telephoneNo,int socialNumber,String deparment, String jobTitle, int yearHire ,int  hourlyRate, int hoursWorked, int unionDues){
	super(name,age,gender,address,telephoneNo,socialNumber,deparment,jobTitle,yearHire);
	this.hourlyRate  = hourlyRate;
	this.hoursWorked = hoursWorked;
	this.unionDues   = unionDues;
	
	}
	
	public abstract int minimumHours();
	
	
	
	
//Getters and Setters
public int getHourlyRate(){return hourlyRate;}
public int getHoursWorked(){return hoursWorked;}
public int getUnionDues(){return unionDues;}

public String toString(){
	return super.toString()+ ","+hourlyRate+","+hoursWorked+","+unionDues;
	}
	
	
}