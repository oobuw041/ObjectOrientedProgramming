abstract class Salary extends Employee{
//instance variables
	private double annualSalary;
	
	
	public Salary(String name, int age, String gender,String address,String telephoneNo,int socialNumber,String deparment, String jobTitle, int yearHire ,double annualSalary){
	super(name,age,gender, address,telephoneNo,socialNumber,deparment,jobTitle,yearHire);
	this.annualSalary = annualSalary;
	
	}
	
//Getters and Setters
public double getAnnualSalary(){return annualSalary;}


public String toString(){
	return super.toString()+","+annualSalary;
	}
}

