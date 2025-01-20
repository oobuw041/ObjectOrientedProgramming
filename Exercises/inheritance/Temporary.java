class Temporary extends Hourly {
	
	private  int timePeriod;
	private String project;
	//timePeriod represents the duration(days) of the project the worker is being hired for while project is the specific project the worker is hired for 
		
	public Temporary(String name, int age, String gender,String address,String telephoneNo,int socialNumber,String deparment, String jobTitle, int yearHire ,int hourlyRate, int hoursWorked, int  unionDues,int timePeriod,String project){
		super(name,age,gender, address,telephoneNo,socialNumber,deparment,jobTitle,yearHire,hourlyRate,hoursWorked,unionDues);
		this.timePeriod = timePeriod;
		this.project = project;
	}
	
	public static void main(String[]args){
	   Temporary season = new Temporary ("Mark",34,"Male","14 Someseret St","343-777-0865",2334567,"Finance","Manager",2024, 5,30,5324,189,"Web Installation");
		System.out.println(season.minimumHours());
	}
	
	@Override
	public int salary (){
		int salary = hoursWorked * hourlyRate;
		return salary;
	}
	
	
	@Override
	public int vacation (){
	int vacationDays = hoursWorked/60;	
	return vacationDays;
	}
	
	
	
	@Override
	public int healthCare (){
		int health =  this.salary()*5/100 ;
		return health;
	}
	
	@Override
	public int minimumHours (){
		int hours = timePeriod/10;
		return hours;
	}
	
}

	
	