//9��
import java.util.Scanner;
public class StackApp {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.print("�� ���� ���� ������ ũ�� �Է� >>");
		int num= s.nextInt();
		StringStack stack= new StringStack(num);
		
		
		while(true) {
			System.out.print("���ڿ� �Է�>>");
			String val= s.next();
			if(val.equals("�׸�")) break;
			if(!stack.push(val)) { //�ʰ��� 
				System.out.println("������ �� ���� Ǫ�� �Ұ�!");
			}
		}
		
		System.out.print("���ÿ� ����� ��� ���ڿ� �� ");
		int length1= stack.length();
		for(int i=0; i<length1;i++) {
			System.out.print(stack.pop()+" ");
		}
		s.close();
	}

}
