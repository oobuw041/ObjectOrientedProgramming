class Nonprofessional extends Employee implements Rewards{
    int hoursWorked;
    int  hourlyRate;
	int minimum;
   
     public  Nonprofessional (String name, int age, String gender,String address,String telephoneNo,int socialNumber,String deparment, String jobTitle, int yearHire,int hoursWorked, int hourlyRate, int minimum){
		 super(name,age,gender, address,telephoneNo,socialNumber,deparment,jobTitle,yearHire);
		 this.hoursWorked = hoursWorked;
		 this.hourlyRate  = hourlyRate;
		 this.minimum     = minimum;
		 
	 }
 	
 	public static void main(String[]args){
 	Nonprofessional nonprof = new Nonprofessional("Alice",28,"Female","78 Maine St","343 777 0865",2837967,"Finance","Assistant",2019, 50, 5,40);
 	System.out.println(nonprof.salary());
 	System.out.println(nonprof.vacation());
 	System.out.println(nonprof.healthCare());
 	System.out.println(nonprof.awards());
 	
 }
 
 
	@Override
	public int salary (){
		int salary = hoursWorked * hourlyRate;
		return salary;
	}
	
	
	@Override
	public int vacation (){
	int vacationDays = hoursWorked/20;	
	return vacationDays;
	}
	
	
	
	@Override
	public int healthCare (){
		int health =  this.salary()*10/100 ;
		return health;
	}
	
	@Override
	public boolean awards(){
		if (this.hoursWorked > minimum){
	   	    return true;
		}
     return false;
		
	}
}

