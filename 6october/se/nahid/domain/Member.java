package se.nahid.domain;

public class Member {

    public String name;


    private String email;



   
    
    public Member(String name) {
	this.name = name;
    }
    
    

   
    public Member(String name, String email) {
	this(name); //calling the other constructor which has parameter "name"
       	this.email = email; 
    }
   

   

    public String emailAddress() {
	return email; // we can write: this.email too
	    }
   


   
    public String name() {
	return name;
    }
   
        

   
    public String toString() {
	return this.name + ";" + this.email;
    }
   


    
   
    public void changeEmailAddress(String email) {
	this.email = email;
    }
   



    
}
