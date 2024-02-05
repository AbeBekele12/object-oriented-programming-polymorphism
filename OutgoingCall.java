package wq;

public class OutgoingCall  extends PhoneCall {
	private String PhoneNumber;
	private double RatePerMinute;
	private double Minutes;
	public void Thing() {
		
	}
	public OutgoingCall() {
		 PhoneNumber=" ";
		 RatePerMinute=0;
		 Minutes=0;
	}
	
	public OutgoingCall( String PhoneNumber,  double number_of_Minutes) {
		 this.PhoneNumber= PhoneNumber;
		 this.Minutes=number_of_Minutes;
		
	}
	
	public OutgoingCall(OutgoingCall obj) {
		this.PhoneNumber=obj.PhoneNumber;
		this.Minutes= obj.Minutes;
	}
	public void MakeCopy(OutgoingCall obj) {
		this.PhoneNumber=obj.PhoneNumber;
		this.Minutes= obj.Minutes;
	}

	public void SetPhoneNumber(String  PhoneNumber) {
		 this.PhoneNumber= PhoneNumber;
	}

	public void Setnumber_of_Minutes(double number_of_Minutes) {
		this.Minutes= number_of_Minutes;
	}

	public String getPhoneNumber() {
		return PhoneNumber;
	}
	public double getRatePerMinute() {
		return RatePerMinute;
	}
	public double getnumber_of_Minutes() {
		return Minutes;
	}

	public double total_Price() {
		return ( RateOutgoing * Minutes);
		
	}

	public String toString() {
		return("Outgoing phone call :" +PhoneNumber+  " "+ RateOutgoing +" per minutes at " + Minutes+ " minutes. Total is $"+total_Price());
	}
	
	
	
}
