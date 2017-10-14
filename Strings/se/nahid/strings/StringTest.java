package se.nahid.strings;

import se.nahid.domain.Member;

public class StringTest {

    public static void main(String[] args) {
	String city = "LIVERPOOL" ;
	city.toLowerCase();
	System.out.println("city: " + city);

	
	String lowerCaseCity = city.toLowerCase();
	System.out.println("city: " + city + " lowerCaseCity: " + lowerCaseCity);
	

	
	String cityAndCountry = city.concat(", Great Britain");
	System.out.println("city: " + city + " cityAndCountry: " + cityAndCountry);

	System.out.println();
	System.out.println("*************************************************");
	System.out.println("*************************************************");
	System.out.println("*************************************************");
	System.out.println();
	

	
	//To check == operator compares the "address" of two variables.
	Member first = new Member("James");
	Member second = first;
	Member third = new Member("James");
	System.out.println(first == second); //true - same object!
	System.out.println(first == third); //false - same name but different objects!
	System.out.println(second == second); //true - same object!
	System.out.println(second == third); //false - same name but different object!
	
	System.out.println();
	System.out.println("*************************************************");
	System.out.println("*************************************************");
	System.out.println("*************************************************");
	System.out.println();
	

	
	
	String myName = "James";
	String fullName = myName.concat(" Brown");
	System.out.println(myName == fullName); // false - concat creates a new object!
	System.out.println(myName == myName.concat (" Stewart") ) ; // false - cocnat creates a new object!


	System.out.println();
	System.out.println("*************************************************");
	System.out.println("*************************************************");
	System.out.println("*************************************************");
	System.out.println();
	

	
	//To check "equals" for two different objects
	String name = new String ("James");
	String otherName = new String("James");
	System.out.println(name.equals(otherName) ) ; //true- different object, but same contents!
	System.out.println(name == otherName);  //false- 
	
	System.out.println();
	System.out.println("*************************************************");
	System.out.println("*************************************************");
	System.out.println("*************************************************");
	System.out.println();
	

	
	//pool of String objects
	String one = "Hello";
	String two = "Hello";
	System.out.println(one == two); //true. it is only one object created and then reused.

	String three = "Hej";
	String four = new String ("Hej");
	System.out.println(three == four); //false- the operator "new" forces to create a new object!
	System.out.println(three.equals(four));
	
	    
    }
}
