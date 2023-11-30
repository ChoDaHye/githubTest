package java_23_11_29;

public class math {

	public static void main(String[] args) {
		// 국어 65, 영어 70, 수학 65
		//총점과 평균을 구하되 평균이 소숫점으로 나오도록 하시오
		
		int kor = 65;
		int eng = 70;
		int math = 66;
		
		int total = kor + eng + math;
		
		double avg = (double)total / (double)3;
		
		System.out.println("총점 : " + total);
		System.out.println("평균 : " + avg);		

		//원의 반지름이 5이다.
		//원넓이를 구하시오
		//반지름 x 반지름 x 3.14
		
		final double PI = 3.14;
		double radius = 5;
		
		double area = radius * radius * PI;
		
		System.out.println("넓이 : " + area );
		double pi = 3.14;
		int r = 5;

		double circle = pi * r * r;

		System.out.println("원넓이 : " + circle);

		// 방법2
		double circle2 = r * r * Math.PI;

		System.out.println("원넓이 : " + circle2);
		
	}

}
