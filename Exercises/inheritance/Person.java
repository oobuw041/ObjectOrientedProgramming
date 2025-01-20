class Person implements Organisation {
//instance variables
protected String name;
protected int    age; 
protected String gender;
protected String address;
protected String telephoneNo;
protected int socialNumber;


//constructor 
public Person(String name, int age, String gender,String address,String telephoneNo,int socialNumber){ 
	this.name = name;
	this.age = age;
	this.gender = gender;
	this.address = address;
	this.telephoneNo = telephoneNo;
	this.socialNumber = socialNumber;
}

public static void main(String[]args){
    Person sims = new Person("Simon",38,"Male","48 Mann St","343 980 0675",286790);
	System.out.println(sims.name());
	System.out.println(sims.category());
}


public String name(){
	return name;
}
public String category(){
	return gender;
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