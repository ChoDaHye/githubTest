package java_23_11_29;

public class score {

	public static void main(String[] args) {
	// 국어 90, 영어 60, 수학 70의 총점을 구하시오
	// 내풀이
		int num1 = 90;
		int num2 = 70;
		int num3 = 60;
		int score = num1 + num2 + num3;
		System.out.println("총점 : "+ score);
		

	//다른 풀이
		int kor, eng, math;
		int total;
		
		kor = 90;
		eng = 60;
		math = 70;
		
		total = kor + eng + math;
		System.out.println("총점 : "+ total);
		
	}

}
