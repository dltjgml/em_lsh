package ex3_single_for;

public class Ex1_for {
	public static void main(String[] args) {
		
	    //�ݺ��� : Ư�� ���๮�� ������ �ݺ��� �� �ֵ��� ���ִ� ���
		//for(�ʱ��; ���ǽ�; ������){
		//   ���ǽ��� ���� ��� ����Ǵ� ����
		//}
		
		for(int i = 0; i<3; i++) {
			System.out.println(i);
			//1. �ʱ�� ���� i=0 �� �ѹ�
			//2. ���ǽ����� �Ѿ ������ �� i<3�̱⿡ ��.
			//3. ���� ��츸 ����.
			//4. ���������� �ٽ� �ö󰡼� ����
            //5. ���ǽ��� ������ ���� ������ ����-����-���� ������ ����
			
		}//for
		
		//for�� ������ �������� i�� for���� �Ҽ��̹Ƿ�, for�� ������ ����� ����� �Ұ���
		
		int n = 0;
		for(n=1; n<=3; n++) {
			System.out.println(n);
		}
		System.out.println(n);
		
		
	//10���� 1���� ���ҵǴ� ��
		for(int n2=10; n2>=1; n2--) {
			System.out.println(n2);
		}//for
		
	//1~100���� 100ȸ���� �ϴ� for��, 3�� �����
		int a= 1;
		for(a=1; a<=100; a++) {
			if(a%3==0) {
				System.out.println(a);
			}//if
		}//for
		
		System.out.println("------------------------------------------------");
		
		for(int i = 3; i<=100; i+=3) {
			System.out.println(i);
		}
		//���������� ���������� ������� ����
		//���Կ����ڵ� �� �� �ִ�. += -= *= %= ��� ��� ����!
		
	}//main

}