class Professional extends Employee implements Organisation{
   int annualSalary;
   
   public  Professional (String name, int age, String gender,String address,String telephoneNo,int socialNumber,String deparment, String jobTitle, int yearHire,int annualSalary){
	   super(name,age,gender, address,telephoneNo,socialNumber,deparment,jobTitle,yearHire);
	   this.annualSalary = annualSalary;
   }
   
   
public static void main(String[]args){
Professional  prof  =  new Professional ("Jane Doe",25, "Female","134 Landsone St","343-777-0865",233456,"Finance","Manager",2022,1500000);
     System.out.println(prof.salary());
     System.out.println(prof.vacation());
     System.out.println(prof.healthCare());
 	System.out.println(prof.name());
 	System.out.println(prof.category());
  	  prof.display();
   	  prof.display(2500000);
	
}

   
   public String name(){
   	return name;
   }
   
   public String category(){
	   return deparment;
   }
   
public void display(){
	System.out.println("Displays person:"+name + "," + age  + "," +  gender + "," + address + "," + telephoneNo + "," + socialNumber);
}

public void display(double annualSalary){
	System.out.println("Displays Professional:"+name + "," + age + "," + gender + "," + address + "," + telephoneNo + "," + socialNumber + "," + deparment + "," + jobTitle + "," + yearHire + "," + annualSalary);
}
   
   
   @Override
	public int salary (){
	int salaryAmount = annualSalary/52;
	return salaryAmount;
	}
	
	
	@Override
	public int vacation (){
	int numberOfDays =  365/6;
	return numberOfDays;
	}
	
	
	@Override
	public int healthCare (){
	int health = this.salary() *10/100;
	return health;
	}
	
	
	
}