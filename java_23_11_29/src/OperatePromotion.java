
public class OperatePromotion {

	public static void main(String[] args) {
		
//		short num1 = 11;
//		short num2 = 22;
//		short result = num1 + num2;
//		System.out.println(result);
		
	/* short형 변수와 int형 변수 중 하나를 선택한다면?
	에러가 뜨는 이유: 컴파일 에러는 정수형 덧셈 시 자료형에
	상관없이 int형 덧셈을 진행함을 의미한다. */
	
//		int num1 = 2000000000;
//		int num2 = 2000000000;
//		
//		int result = num1 + num2;
//		
//		System.out.println(result);
//		
//		int의 유효 범위가 초과 되었기 때문에 오류
		
//		long num3 = 2000000000;
//		long num4 = 2000000000;
//		
//		long result = num3 + num4;
//		System.out.println(result);
//		
		
		char ch1 = '헐';	//문자저장
		char ch2 = '확';	//문자저장
		char ch3 = 54736;	//유니코드 직접 저장
		char ch4 = 54869;	//유니코드 직접 저장
		char ch5 = 0xD5d0;	//16진수 0xD5d0와 매핑되는 문자 'ch5'
		char ch6 = 0xD655;	//16진수 0xD655와 매핑되는 문자 'ch5'
		System.out.println(ch1 + " " + ch2);
		System.out.println(ch3 + " " + ch4);
		System.out.println(ch5 + " " + ch6);

	}

}
