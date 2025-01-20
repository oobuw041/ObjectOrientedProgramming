class Main{
	public static void main(String[]args){
		Person [] people = new Person[2];
		people[0] = new Person("James",18,"Male","134 Landsone St","343-777-0865",2334567);
		people[1] = new Student("Alice",18,"Female","78 Maine St","343 777 0865",2837967,"University of ottawa",4.0,"Business",1,3.90);
		
	    Person sims = new Person("Simon",38,"Male","48 Mann St","343 980 0675",286790);
		System.out.println(sims.name());
		System.out.println(sims.category());
		
		
	    Student stud = new Student("Alice",18,"Female","78 Maine St","343 777 0865",2837967,"University of ottawa",4.0,"Business",1,3.90);
		System.out.println(stud.awards());
		
 	   Temporary season = new Temporary ("Mark",34,"Male","14 Someseret St","343-777-0865",2334567,"Finance","Manager",2024, 5,30,5324,189,"Web Installation");
 		System.out.println(season.minimumHours());
		
	 	Nonprofessional nonprof = new Nonprofessional("Alice",28,"Female","78 Maine St","343 777 0865",2837967,"Finance","Assistant",2019, 50, 5,40);
	 	System.out.println(nonprof.salary());
	 	System.out.println(nonprof.vacation());
	 	System.out.println(nonprof.healthCare());
	 	System.out.println(nonprof.awards());
		
		Professional  prof  =  new Professional ("Jane Doe",25, "Female","134 Landsone St","343-777-0865",233456,"Finance","Manager",2022,1500000);
		     System.out.println(prof.salary());
		     System.out.println(prof.vacation());
		     System.out.println(prof.healthCare());
		 	System.out.println(prof.name());
		 	System.out.println(prof.category());
		  	  prof.display();
		   	  prof.display(2500000);
		
		for (int i =0; i < people.length; i++){
			System.out.println(people[i]);
			System.out.println();
		}
		}
	
}