package intro;

public class MyFirst {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World");
		int b = 1;
		if((b>0) && (b<21))	{
			System.out.println("Hello");
		}
		while (b<10) {
			System.out.println(b);
			b += 1;
		}
		Number1 x = new Number1();
		x.printHi();
	}

}
