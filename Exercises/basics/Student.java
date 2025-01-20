class Student extends Person {
//instance variables
	private double gpa;
	private String major;
	private int year;
	
	public Student(String name, int age, String gender,String address,String telephoneNo,int socialNumber,double gpa, String major,int year){
		super(name,age,gender, address,telephoneNo,socialNumber);
		this.gpa  = gpa;
		this.major = major;
		this.year  = year;	
	}

//Getters and Setters
public double getGpa(){return gpa;}
public String getMajor(){return major;}
public int getYear(){return year;}
	
public String toString(){
		return super.toString() + ","+gpa + ","+ major + "," + year;
	}
}