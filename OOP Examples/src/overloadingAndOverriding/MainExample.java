package overloadingAndOverriding;

public class MainExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Boy Steve = new Boy();
		Human Dave = new Human();
		
		Steve.eat();
		Dave.eat();
		
		
		Overloading obj = new Overloading();
		obj.disp('A');
		obj.disp(10);
		obj.show('B', 20);
		obj.show(20, 'B');
		obj.out('C');
		obj.out('C',30);
		
		
	}

}
