
package wq;

public abstract class PhoneCall   implements InterfacePhone { 

private String PhoneNumber;

public abstract void Thing();
	// Default constructor
	public PhoneCall() {
		PhoneNumber = " ";  
		}
	public PhoneCall( String Phone ) {
		this.PhoneNumber= Phone;
	}
	
	public void setPhoneNumber(String Phone) {
		this.PhoneNumber=Phone ; 
		}
	
	public String getPhone_Number() {
		return PhoneNumber;		}
		
}
