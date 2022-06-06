package calculator;

public class CalculatorEx {
	public static void main(String[] args) {
		Calculator myCalc = new Calculator();
		myCalc.execute();
	}
}

// 실행 순서
// 16 라인에서 호출이 제일 먼저 일어남 -> avg()메소드 실행
// avg() 메소드의 10라인에서 호출이 일어나서 plus() 메소드가 실행
// plus() 메소드가 리턴값을 주면 -> 10라인에서 리턴값을 sum 변수에 저장 -> 11라인 실행 -> 12라인에서 execute() 메소드로 리턴값을 줌
// execute() 메소드 16라인에서 avg() 메소드의 리턴값을 받음 -> 17라인에서 println() 메소드를 호출할 떄 매개값으로 돌려줌
// println() 메소드는 매개값으로 받은 문자열을 21라인에서 콘솔로 출력
// execute() 메소드는 18라인을 만나게 되고 종류

// double result = avg(7,10);  avg에 호출 일어나 plus메소드가 실행되고 리턴값을 주면 sum변수 값에 저장 11라인실행 후 리턴값 으로 execute에  리턴값을 줌
// avg 메소드 내부 	double sum = plus(x, y); 실행 
// int plus(int x, int y )  
