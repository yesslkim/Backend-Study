package til_230207;

public class Print {

	public static void main(String[] args) {
		// NOTE: printf()
		int age = 29;
		int favNum = 5;
		double pi = 3.14159265;
		double score = 4.5;
		String name = "kim";
		
		// %d : 정수(10진수)
		System.out.printf("나이는 %d살 입니다\n",age);
		System.out.printf("나이는 %d살이고, 좋아하는 숫자는 %d입니다.", age, favNum);
		
		// %f : 실수
		System.out.printf("점수는 %f입니다",score);
		// n번째 자릿 수 설정
		System.out.printf("%.2f\n", pi);
		
		// %s : 문자열
		System.out.printf("이름은 %s입니다", name);

	}

}
