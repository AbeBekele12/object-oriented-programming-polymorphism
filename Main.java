package wq;

public class Main {
	public static void Main(String argss[]) {
		
		PhoneCall PhoneObj;
		PhoneObj= new IncomingCall();
		PhoneObj.Thing();
		PhoneObj= new OutgoingCall();
		PhoneObj.Thing();
	}
	
}
