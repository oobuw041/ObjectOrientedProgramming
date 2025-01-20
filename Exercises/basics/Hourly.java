abstract class Hourly extends Employee{
//instance variables
	private double hourlyRate;
	private int  hoursWorked;
	private double  unionDues;
	
	public Hourly(String name, int age, String gender,String address,String telephoneNo,int socialNumber,String deparment, String jobTitle, int yearHire ,double  hourlyRate, int hoursWorked, double  unionDues){
	super(name,age,gender, address,telephoneNo,socialNumber,deparment,jobTitle,yearHire);
	this.hourlyRate  = hourlyRate;
	this.hoursWorked = hoursWorked;
	this.unionDues   = unionDues;
	}
	
//Getters and Setters
public double getHourlyRate(){return hourlyRate;}
public double getHoursWorked(){return hoursWorked;}
public double getUnionDues(){return unionDues;}

public String toString(){
	return super.toString()+ ","+hourlyRate+","+hoursWorked+","+unionDues;
	}
}