package exampleOFAdapterPattern;

public class AdapterPatternTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       testClassAdapter();

	}
	
	private static void testClassAdapter() {
		SocketAdapter sockAdaper = new SocketClassAdapterImpl();
		Volt v3= getVolt(sockAdaper,3);
		Volt v12= getVolt(sockAdaper,12);
		Volt v120= getVolt(sockAdaper,120);
		System.out.println("v3 volts using class Adapter="+v3.getVolts());
		System.out.println("v12 volts using class Adapter="+v12.getVolts());
		System.out.println("v120 volts using class Adapter="+v120.getVolts());
	}
	private static Volt getVolt(SocketAdapter sockAdapter, int i) {
		switch(i) {
		case 3: return sockAdapter.get3Volt();
		case 12: return sockAdapter.get12Volt();
		case 120: return sockAdapter.get120Volt();
		default: return sockAdapter.get120Volt();
		}
	}

}
