package testExamples;

import java.util.Scanner;
import java.util.Vector;

public class TestingAsYouCode {
	 public static void main(String[] args) {

	Scanner Obj = new Scanner(System.in);
	Vector<String> Words = new Vector<String>();
	System.out.print("Enter your name: ");
	String myString = Obj.nextLine();
	Words.add(myString);
	int A = (Words.size());
	if (A == 1){
		System.out.print("Value successfully added");
	
	}else {
		System.out.print("Value addition FAIL");
	}
	
	System.out.print("Enter your age: ");
	
	String myString2 = Obj.nextLine();
	Words.add(myString2);
	int B = (Words.size());
	if (B == 2){
		System.out.print("Value successfully added");
	
	}else {
		System.out.print("Value addition FAIL");
	}
	
	String username = Words.get(0)+ Words.get(1);
	System.out.print(username);
	

}
}