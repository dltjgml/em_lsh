package ex2_switch;

public class Ex4_1_work {
	public static void main(String[] args) {
		
		int month = 3;
		switch (month) {
		case 1: case 3: case 5: case 7: 
		case 8: case 10: case 12: 
			System.out.println(month+"월은 31일까지 있습니다.");
			break;
			
		case 4: case 6: case 9: case 11: 
			System.out.println(month+"월은 30일까지 있습니다.");
			break;
			
		case 2: 
			System.out.println("2월은 28일까지 있습니다.");
				break;

		default:
			System.out.println(month+"월은 없습니다");
			break;
		}//switch
		
	}//main

}
