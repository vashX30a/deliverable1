package del1;

public class Contact {
	
	private	String fName, lName, address, city, state, pNumber, zipCode;
	
	public Contact(){
		
	}
	
	public Contact(String fName, String lName){
		this.fName = fName;
		this.lName = lName;
		zipCode = address = city = state = pNumber = null;
	}
	
	public Contact(String fName, String lName, String address, String city, String state, String pNumber, String zipCode){
		this.fName = fName;
		this.lName = lName;
		this.address = address;
		this.city = city;
		this.state = state;
		this.pNumber = pNumber;
		this.zipCode = zipCode;
	}
	
	public void setAll(String fName, String lName, String address, String city, String state, String pNumber, String zipCode){
		this.fName = fName;
		this.lName = lName;
		this.address = address;
		this.city = city;
		this.state = state;
		this.pNumber = pNumber;
		this.zipCode = zipCode;
	}
	
	public void setZipCode(String zipCode){
		this.zipCode = zipCode;
	}
	
	public void setAddress(String address){
		this.address = address;
	}
	
	public void setCity(String city){
		this.city = city;
	}
	
	public void setState(String state){
		this.state = state;
	}
	
	public void setPNumber(String pNumber){
		this.pNumber = pNumber;
	}
	
	public String getFName(){
		return fName;
	}
	
	public String getLName(){
		return lName;
	}
	
	public String getAddress(){
		return address;
	}
	
	public String getCity(){
		return city;
	}
	
	public String getState(){
		return state;
	}
	
	public String getPNumber(){
		return pNumber;
	}
	
	public String getZipCode(){
		return zipCode;
	}
	
	
	
	/*
	public static void main(String args[]){
	 
		int x = 10;
		System.out.println("Code: " + x);
		
	}
	*/
}
