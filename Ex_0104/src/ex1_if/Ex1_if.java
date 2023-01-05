package ex1_if;

public class Ex1_if {
	public static void main(String[] args) {
		
		//제어문 : 프로그램의 흐름을 제어하는 문장
		// - 분기문 : if, switch
		// - 반복문 : for, while
		
		//if( 조건식 ){
		//  조건식이 참일 떄 실행되는 영역
		//}
		
		int n = 50;
		//String은 ""안에 여러글자(문자열)을 저장 가능한 자료형
		String str = "";
		
		if( n == 50 ) {
			//조건식이 참일 때 실행되는 영역
			str = "n=50"; //참
		}
		
		if( n != 50 ) {
			str = "n은 50이 아니다";
		}
		
		//이러면 Hello라는 출력은 절대 나오지 않을 것. 
		//String 변수 설정할 때 굳이 ""안에 무언가를 작성하지 x
		System.out.println(str);
		
		
		
		
		
	}//main

}
