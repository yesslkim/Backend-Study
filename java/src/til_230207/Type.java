package til_230207;

public class Type {
	public static void main (String[] args) {
		// 타입 변환
		// 자동변환 :  작은 타입을 큰 타입으로 캐스팅 연산
		// 숫자 타입 - byte short int long float double
		// int / int => double => int
		int divide = 5 / 2;
		System.out.println(divide);
		
		// 강제변환
		int ten = (int) 10.4;
		System.out.println(ten);
	}
}
