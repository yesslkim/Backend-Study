package til_230206;

public class JavaString {
	public static void main (String[] args) {
		String subject;
		subject = "자바";
		
		// NOTE: 변수 값 복사 가능
		String copySubject = subject;
		
		System.out.println("지금 공부하고 있는 과목은");
		System.out.println(subject + "입니다");
		
		System.out.println(copySubject);
	}
}