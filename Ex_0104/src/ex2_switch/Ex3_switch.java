package ex2_switch;

public class Ex3_switch {
	public static void main(String[] args) {
		
		//switch���� �񱳰����� �� ������ Ÿ�Ը� ����� ����
		//����(byte, int, short), ���ڿ�(String), ����(char)
		//boolean, float, double, long�� ���� �� ��� �Ұ�
		
		char ch ='��';
		
		switch(ch) {//�񱳰�
		case '��':
			System.out.println("21%");
			break;
			
		case '��':
			System.out.println("14%");
			break;
			
		case '��':
			System.out.println("8%");
			break;
			
			//break�� �ɸ��� ������ �񱳰��� ���ǰ��� ��ġ���� �ʴ��� break�� ���� ������ ����Ѵ�
			//�ǵ������� break�� ������� �ʴ� ��쵵 �ִ�
			
		}//switch
		
	}//main

}