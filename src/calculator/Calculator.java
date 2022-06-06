package calculator;

public class Calculator {
	int plus(int x, int y ) {			// 10 -> 4호출 : 2
		int result = x + y;
		return result;
	}
	
	double avg(int x, int y) {			// 			   : 1
		double sum = plus(x, y);		// 16 -> 10호출 : 2
		double result = sum / 2;
		return result;
	}
	
	void execute() {
		double result = avg(7,10);  	// 16 -> 9호출   : 1
		println("실행결과: " + result);	// 17 -> 20호출 : 3
	}
	
	void println(String message) {
		System.out.println(message);	//				:3
	}
}
