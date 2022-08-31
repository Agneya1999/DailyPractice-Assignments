package practice;

interface abc{
	static String st = "PrimaryColors";
}

enum color implements abc {
	Red(25), Green(30), Yellow(20);
	
	color(int value){
		this.value =value;
	}
	 int value;
	 int getValue() {
		 return value;
	 }
}

public class EnumExample {
	public EnumExample(){
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		color c1 = color.Red;
		color c2 = color.Green;
		System.out.println(c2.getValue() + c2.st + c2.ordinal());

		System.out.println(c1);
		switch (c1) {
		case Red:
			System.out.println(c1.getValue() + c1.st + c1.ordinal());
			break;

		case Green:
			System.out.println(c1.ordinal());
			break;
		case Yellow:
			break;
		}

	}

}
