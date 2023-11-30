package java_23_11_29;

public class Boolean {

	public static void main(String[] args) {
		//초기화 = 처음으로 값을 할당
		int num = 100;
		
		int num3;
		num3 = 100;
		
		boolean b1 = true;
		boolean b2 = false;
		System.out.println(b1);
		System.out.println(b2);
		
		int num1 = 10;
		int num2 = 20;
		System.out.println(true);
		System.out.println(num1 < num2);
		System.out.println(num1 > num2);
		System.out.println(num1 == num2);
		
		
		/*1. Cpu 조차도 하나의데이타 타입을 잡아서 응답하고 있음
		  2. 데이터 타입의 가장 큰 의미는 언어 차원에서 제공하는 
		 	 데이터 타입중 하나로 무조건 메모리에 올린다.*/
	
		
		int n1 = 4;
		int n2  =3;
		
		double div = n2/n1;
		System.out.println(div);
		
		
		short s1 = 10;
		short s2 = 10;
		
		int s3 = s1 + s1;
		
		System.out.println(s3);
		
		long numl = 1;
		float f1 = 0.1f;
		
		System.out.println(numl +f1);
	
		
		
		char ch = 'A';
		int num4 = 10;
		
		int result = num4 + ch;
		
		System.out.println(result);
		
		char ch2 = 'A';
		char ch3 = 'A';
		
		result = ch3 + ch2;
		
		System.out.println(result);
		//System.out.println(result);
		//아스키 코드 char A의 값은 65이기 때문에 65+ 65 = 130
		
		
		double pi = 3.14;
		int num5 = (int)pi;
		
		System.out.println();
		
		
		
	}

}

