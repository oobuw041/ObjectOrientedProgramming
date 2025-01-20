class Person{
//instance variables
private String name;
private int    age; 
private String gender;
private String address;
private String telephoneNo;
private int socialNumber;

//constructor 
public Person(String name, int age, String gender,String address,String telephoneNo,int socialNumber){ 
	this.name = name;
	this.age = age;
	this.gender = gender;
	this.address = address;
	this.telephoneNo = telephoneNo;
	this.socialNumber = socialNumber;
}


//Getters and Setters
public String getName(){ return name;}
 public int getAge(){return age;}
 public String getGender(){return gender;}
 public String getAddress(){return address;}
 public String getTelephoneNo(){return telephoneNo;}
 public int getSocialNumber(){return socialNumber;}
 
 

//toString method
public String toString(){
	return name + ","+ age + "," + gender + "," + address + ","+ telephoneNo + ","+ socialNumber;
}
}