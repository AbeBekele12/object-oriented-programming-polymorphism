package wq;

public class IncomingCall extends PhoneCall {
	
	private String PhoneNumber;
	private double minutes;

	public void Thing() {
		
	}
	
	public IncomingCall(){
		PhoneNumber= " ";
	}

	public IncomingCall(String Number) {
		PhoneNumber=Number;	
	}
	
	public IncomingCall(IncomingCall obj) {
		this.PhoneNumber= obj.PhoneNumber;}
	
	public void MakeCopy(IncomingCall obj) {
		this.PhoneNumber= obj.PhoneNumber;
		this.minutes= obj.minutes;
		}

	public void SetPhoneNumber(String  PhoneNumber) {
		 this.PhoneNumber= PhoneNumber;
	}
	public void Setminutes(double minutes) {
		this.minutes= minutes;
	}

	public String getPhoneNumber() {
		return PhoneNumber;
	}
	public double getminutes() {
		return minutes; 
		}
	
	public double CalculatePay() {
		return ( RateIncoming * 1);
		}
	
	public String toString() {
		return ("Incoming phone call: "+PhoneNumber + " "+ RateIncoming+" per call. Total is $"+ CalculatePay() );
	}
}
