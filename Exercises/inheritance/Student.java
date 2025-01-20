class Student extends Person implements Rewards{
//instance variables
    private String school;
	private double gpa;
	private String major;
	private int year;
	private double distinction;
	
	public Student(String name, int age, String gender,String address,String telephoneNo,int socialNumber,String school,double gpa, String major,int year, double distinction){
		super(name,age,gender, address,telephoneNo,socialNumber);
		this.gpa  = gpa;
		this.major = major;
		this.year  = year;	
		this.school = school;
		this.distinction = distinction;
	}


public static void main(String[]args){
    Rewards stud = new Student("Alice",18,"Female","78 Maine St","343 777 0865",2837967,"University of ottawa",4.0,"Business",1,3.90);
	System.out.println(stud.awards());
}
// creating a new instances of Student 
	
//Getters and Setters
public double getGpa(){return gpa;}
public String getMajor(){return major;}
public int getYear(){return year;}
public String getSchool(){return school;}
public double getDistinction(){return distinction;}

	
public String toString(){
		return super.toString() + ","+school+ ","+gpa + ","+ major + "," + year;
	}
	
	
	@Override
	public boolean awards(){
		if (this.gpa > distinction){
	   	    return true;
		}
     return false;
		
	}
	
  
}