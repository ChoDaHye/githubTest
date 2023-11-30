package java_23_11_29;

public class ArithOp {

	public static void main(String[] args) {
		int num1 = 7;
		int num2 = 3;
		
		System.out.println("num1 + num2 = " + (num1 + num2));
		System.out.println("num1 - num2 = " + (num1 - num2));
		System.out.println("num1 * num2 = " + (num1 * num2));
		System.out.println("num1 / num2 = " + ((double)num1 / num2));
		System.out.println("num1 % num2 = " + (num1 % num2));

		
		short num = 10;
		num = (short)(num + 77L);	// 형 변환 안하면 컴파일 오류 발생
		int rate = 3;
		rate = (int)(rate *3.5); //형 변환 안하면 컴파일 오류 발생
		System.out.println(num);
		System.out.println(rate);	
		
		num= 10;
		num += 77L;		//형 변환 필요하지 않다
		rate = 3;
		rate *= 3.5;	//형 변환 필요하지 않다
		System.out.println(num);
		System.out.println(rate);
		
		
		
	}

}

