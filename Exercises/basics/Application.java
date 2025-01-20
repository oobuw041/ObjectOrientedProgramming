class Application{
	public static void main(String[]args){
		Person [] people = new Person[2];
		people[0] = new Person("James",18,"Male","134 Landsone St","343-777-0865",2334567);
		people[1] = new Student("Alice",18,"Female","78 Maine St","343 777 0865",2837967,4.0,"Business",1);
		
		for (int i =0; i < people.length; i++){
			System.out.println(people[i]);
			System.out.println();
		}
		Professional  prof  =  new Professional ("Jane Doe",25, "Female","134 Landsone St","343-777-0865",233456,"Finance","Manager",2022,1500000);
		Nonprofessional nonprof = new Nonprofessional("Alice",28,"Female","78 Maine St","343 777 0865",2837967,"Finance","Assistant",2019, 40, 5);
		System.out.println(prof.salary());
		System.out.println(prof.vacation());
		System.out.println(prof.healthCare());
		System.out.println(nonprof.salary());
		System.out.println(nonprof.vacation());
		System.out.println(nonprof.healthCare());
		
		
		}
	
}